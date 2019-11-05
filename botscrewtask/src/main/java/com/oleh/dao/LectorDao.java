package com.oleh.dao;

        import com.oleh.entity.LectorsEntity;
        import com.oleh.utils.HibernateSessionFactoryUtil;
        import org.hibernate.Query;
        import org.hibernate.Session;
        import java.util.List;

public class LectorDao {
    String first_name;
    String last_name;
    String department_name;
    String param;
    Session session;
    public List<LectorsEntity> findByDepartment(){
        List<LectorsEntity> lectorsBydDpartment = (List<LectorsEntity>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from LectorsEntity where  ="+"'"+department_name+"'").list();
        return lectorsBydDpartment;
    }
    public List<LectorsEntity> getAvarageSalary(String department_name){
        List<LectorsEntity> lectorsAvarageSalary= (List<LectorsEntity>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("select avg(salary) from LectorsEntity  where department_name="+"'"+department_name+"'").list();
        return  lectorsAvarageSalary;
    }
    public List<LectorsEntity> getPositionsCount(String param){
        List<LectorsEntity> lectorsEntityList = (List<LectorsEntity>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("select count(position) from LectorsEntity  where position='Biology'").list();
        return lectorsEntityList;
    }
    public List<LectorsEntity> getStatisticByDepartment(String param){
        session.getSessionFactory().openSession();
        String hql= "select count(position) from LectorsEntity where department_name= :department_name and position= :position";
        Query query = session.createQuery(hql);
        query.setParameter("department_name", department_name);
        query.setParameter("position","assistant");
        List<LectorsEntity> lectorsEntities = query.list();

        return lectorsEntities;
    }
    public List<LectorsEntity> getEmployeesCount(){
        List<LectorsEntity> lectorsEntities = (List<LectorsEntity>)HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" select count(*) from LectorsEntity ").list();
        return lectorsEntities;
    }
}
