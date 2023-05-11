package com.izaanschool.datatype;

import java.util.Scanner;
public class Charity {
    public static void main(String[]args){
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter name ");

        String name= ch.nextLine();
        System.out.println(" mission  ");

        String mission =ch.nextLine();
        System.out.println("donations ");

        String donation= ch.nextLine();
        ch.close();

        System.out.println("Name: " + name);
        System.out.println("mission: " + mission);
        System.out.println("donation: " +donation );
    }
}




