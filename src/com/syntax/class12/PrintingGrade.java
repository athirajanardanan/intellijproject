package com.syntax.class12;
import java.util.Scanner;

public class PrintingGrade {
    void print(int score)
    {
        if(score>=90)
        {
            System.out.println("Grade is A");
        }
        else if(score>=80)
        {
            System.out.println("Grade is B");
        }
        else if(score>=70)
        {
            System.out.println("Grade is C ");
        }
        else if(score>=50)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("grade is F!!try hard");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        PrintingGrade obj=new PrintingGrade();
        System.out.println("Please enter you score to get your grade?");
        int mark=input.nextInt();
        obj.print(mark);

    }
}
