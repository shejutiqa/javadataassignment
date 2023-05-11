package com.izaanschool.datatype;

import java.util.Scanner;
public class ChatRoom {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.println("name ");

        String participants= pr.nextLine();
        System.out.println("participants ");

        String messages =pr.nextLine();
        System.out.println("messages ");

        String donation= pr.nextLine();
        pr.close();

        System.out.println("Name:" + "living" );
        System.out.println("participants: " +"you" );
        System.out.println("messages: " + "missing");
    }
}




