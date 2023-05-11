package com.izaanschool.datatype;

import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
     Scanner em=new Scanner(System.in);
        System.out.println("sender");

        String recipient=em.nextLine();
        System.out.println("recipient");

        String subject=em.nextLine();
        System.out.println("subject");

        String body=em.nextLine();
        System.out.println("body");
         String name=em.nextLine();
         em.close();
        System.out.println("sender");
        System.out.println("recipient");
        System.out.println("subject");
        System.out.println("body");
    }

}
