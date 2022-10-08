package com.syntax.class1;

import java.util.Scanner;

public class myfirstprogram {
    public static void main(String[] args)
    {
        boolean pallindrome;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input?");
        String userInput = sc.next();

        StringBuilder a = new StringBuilder(userInput);
        a.reverse();
        String b = userInput;


        if (a.toString().equals(b)) {
            System.out.println("pallindrome");

        } else {
            System.out.println("not pallindrome");
        }



    }
}
