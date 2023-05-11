package com.izaanschool.datatype;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner emp=new Scanner(System.in);
        System.out.println("name");

         String  designation=emp.nextLine();
        System.out.println(" designation");

        String salary=emp.nextLine();
        System.out.println(salary);
         String name=emp.nextLine();
         emp.close();
        System.out.println("name");
        System.out.println("designation");
        System.out.println("salary");


    }
}
