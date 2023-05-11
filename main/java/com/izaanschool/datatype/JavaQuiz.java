package com.izaanschool.datatype;

import java.util.Scanner;
public class JavaQuiz {
    public static void main(String[]args){
        Scanner jq=new Scanner(System.in);
        System.out.println("StudentName:");

        String StudentEmail=jq.nextLine();
        System.out.println("StudentEmail");

        String QuizNumber=jq.nextLine();
        System.out.println("QuizNumber");

        String Quiz  =jq.nextLine();
        jq.close();

        System.out.println("StudentName:"+"sharmin");
        System.out.println("StudentEmail:"+"smr.sharmin@yahoo.com");
        System.out.println("QuizNumber:"+"7");


    }
}
