package com.oleh.services;
import com.oleh.dao.DepartmentDao;

import java.util.*;

public class DepartmentsService {
    private DepartmentDao departmentDao = new DepartmentDao();

    public List<DepartmentDao> findAllDepartments(){
        return departmentDao.findAll();
    }
    public List<DepartmentDao> getHead(String name){

        return departmentDao.getHead(name);
    }
}
