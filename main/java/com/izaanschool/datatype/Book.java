package com.izaanschool.datatype;

import java.util.Scanner;
public class Book {
    public static void main(String[]args){
        Scanner book = new Scanner(System.in);
        System.out.println("title");

        String  author =book.nextLine();
        System.out.println("author");

        String ISBN =book.nextLine();
        System.out.println("ISBN");


        System.out.println("title:" + "");
        System.out.println("author:"+ "");
        System.out.println("ISBN:" + "");
    }
}
