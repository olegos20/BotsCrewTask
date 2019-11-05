package com.oleh;

import com.oleh.dao.DepartmentDao;
import com.oleh.dao.LectorDao;
import com.oleh.services.DepartmentsService;
import com.oleh.services.LectorService;

import java.util.Scanner;

public class AI {
    private String command;

private String name;
DepartmentDao departmentDao;
LectorDao lectorDao;
Scanner scanner = new Scanner(System.in);

    public void getData(){
        DepartmentsService service = new DepartmentsService();
        LectorService lectorService = new LectorService();
        command= scanner.nextLine();
        name= scanner.nextLine();
        command= command+name;
        if(command.equals("Who is head of"+name)){
            System.out.println(service.getHead(name).toString());
        }
        else if(command.equals("Show department statistic"+name)){
            System.out.println(lectorService.getStatistic(name).toString());
        }else if(command.equals("Show employee count")){
            System.out.println(lectorService.getEmploeeCout());
        }else if(command.equals("Show avarage salary for department"+name)){
            System.out.println(lectorService.getAvarageSalary(name));
        }
    }
}