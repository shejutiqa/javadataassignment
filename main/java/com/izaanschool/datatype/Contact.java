package com.izaanschool.datatype;

import java.util.Scanner;
public class Contact {
    public static void main(String[]args){
        Scanner cot=new Scanner (System.in);
        System.out.println("name");

        String email=cot.nextLine();
        System.out.println("email");

        String phoneNumber=cot.nextLine();
        

        cot.close();
         System.out.println("name:"+ "shejuti");
         System.out.println("email:"+"meshejuti@gmail.com");
         System.out.println("phoneNumber:"+ "2816704571");
    }
}
