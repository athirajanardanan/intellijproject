package com.syntax.class12;
import java.util.Scanner;

public class Palindrome {
    void check(String str) {
        StringBuilder str1 = new StringBuilder(str);
        if (str1.reverse().toString().equalsIgnoreCase(str)) {
            System.out.println("The given string " +"'"+ str+ "'" + " is palindrome");
        } else {
            System.out.println("The given string " +"'" +str+ "'" + " is not palindrome");
        }
    }
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a String?");
            String st=input.nextLine();
            Palindrome obj=new Palindrome();
            obj.check(st);

        }
}
