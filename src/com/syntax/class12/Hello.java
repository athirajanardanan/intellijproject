package com.syntax.class12;
import java.util.Scanner;

public class Hello {
    void print(String country)
    {
        if(country.equalsIgnoreCase("canada"))
        {
            System.out.println("Bonjour means hello here");
        }
       else if(country.equalsIgnoreCase("india"))
        {
            System.out.println("Namaste means hello here");
        }
      else  if(country.equalsIgnoreCase("Indonesia"))
        {
            System.out.println("Selamat siang means hello here");
        }
        else if(country.equalsIgnoreCase("spain"))
        {
            System.out.println("Hola means hello here");
        }
        else
        {
            System.out.println("Sorry.Unknown for "+ country);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a country name?");
        String con=scan.next();
        Hello obj=new Hello();
        obj.print(con);
    }

}
