package com.oleh;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.oleh.services.DepartmentsService;
public class Main {
    private static String text;
    private static String command;
    public static void main(String[] args) {
        AI ai = new AI();
        DepartmentsService departmentsService = new DepartmentsService();
        String name;
        text="Biology";
        System.out.println("Hello! PLease send me a command");
        ai.getData();

    }


}
