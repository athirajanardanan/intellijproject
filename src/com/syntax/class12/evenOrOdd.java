package com.syntax.class12;
import java.util.Scanner;

public class evenOrOdd {
    void evenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is even!!!");
        }
        else {
            System.out.println(num +" is odd!!!");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number?");
        int n=scan.nextInt();
        evenOrOdd obj=new evenOrOdd();
        obj.evenOdd(n);

    }

}
