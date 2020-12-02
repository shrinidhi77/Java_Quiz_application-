package com.quizapplication;
import java.util.Scanner;
public class Player {
    Scanner sc = new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails() {
        System.out.println("Enter the player name:  ");
        name = sc.next();
        System.out.println("Hello "+ name + " for each question there will be a Negative marks, so chose proper answers");
    }

}
