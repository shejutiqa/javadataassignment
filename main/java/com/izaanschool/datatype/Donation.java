package com.izaanschool.datatype;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        Scanner don=new Scanner(System.in);
        System.out.println("donor");

        String amount=don.nextLine();
        System.out.println(" amount");

        String donationdate=don.nextLine();
        System.out.println(" donation date");

        String name=don.nextLine();
        don.close();
        System.out.println("donor");
        System.out.println("amount");
        System.out.println("donation date");
    }



}
