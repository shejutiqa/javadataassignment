package com.izaanschool.datatype;

import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        Scanner ev= new Scanner(System.in);
        System.out.println("name");

        String date=ev.nextLine();
        System.out.println("date");
        String location=ev.nextLine();
        System.out.println("location");
        String name=ev.nextLine();
        ev.close();
        System.out.println("name");
        System.out.println("date");
        System.out.println("location");
    }
}
