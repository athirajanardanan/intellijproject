package com.syntax.class1;
import java.util.Scanner;
public class reverseusingcharat {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string?");
        String str=input.next();
        char[] ch=str.toCharArray();
        System.out.print("Reverse is:=");
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }

    }
}
