package com.oleh.dao;
import com.oleh.utils.HibernateSessionFactoryUtil;
import java.util.List;

public class DepartmentDao {
    public List<DepartmentDao> getHead(String name){
        List<DepartmentDao> department_head = (List<DepartmentDao>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from DepartmentsEntity where name ="+"'"+name+"'").list();
   return department_head;
    }
public List<DepartmentDao> findAll(){
    List<DepartmentDao>departments= (List<DepartmentDao>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery(" from DepartmentsEntity AS name").list();
return departments;
}
}
