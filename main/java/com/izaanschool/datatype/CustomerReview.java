package com.izaanschool.datatype;

import java.util.Scanner;

public class CustomerReview {
    public static void main(String[] args) {
        Scanner cr=new Scanner(System.in);
        System.out.println("product");

        String rating=cr .nextLine();
        System.out.println("rating");

        String comments=cr.nextLine();
        System.out.println("comments");

        String name  =cr.nextLine();
        cr.close();
        System.out.println("product:" +"shop");
        System.out.println("rating:"+"8 out of 10");
        System.out.println("comments:"+"best");


    }
}
