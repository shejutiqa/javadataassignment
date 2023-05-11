package com.izaanschool.datatype;

import java.util.Scanner;

public class Coupon {
    public static void main(String[]args){
        Scanner cup=new Scanner(System.in);
        System.out.println("code");

         String discountAmount  =cup.nextLine();
         System.out.println("discount amount");

         String expirationDate= cup.nextLine();
         System.out.println("expirtion date");

         String expirationnDate=cup.nextLine();
         cup.close();
          System.out.println("code:"+ "201");
          System.out.println("discount amount:"+"10%");
          System.out.println("expiration date:"+ "03/23");


    }
}
