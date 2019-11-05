package com.oleh.services;

import com.oleh.dao.LectorDao;
import com.oleh.entity.LectorsEntity;


import java.util.List;

public class LectorService {
    LectorDao lectorDao = new LectorDao();

public List<LectorsEntity> getEmploeeCout(){
    return lectorDao.getEmployeesCount();
}
public List<LectorsEntity> getAvarageSalary(String name){
    return lectorDao.getAvarageSalary(name);
}
public List<LectorsEntity> getStatistic(String name){
    return lectorDao.getStatisticByDepartment(name);
}
public List<LectorsEntity> getPositionCount(String name){
    return lectorDao.getPositionsCount(name);
}
}
