
package com.syntax.class12;
import java.util.Scanner;

class largerNumber {
    void max(int num1,int num2)
    {
        if(num1>num2)
        {
            System.out.println(num1+" is greater than "+num2);
        }
        else
        {
            System.out.println(num2+" is greater than "+num1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        largerNumber obj1=new largerNumber();
        System.out.println("Enter the first number?");
        int n=scan.nextInt();
        System.out.println("Enter the second number?");
        int n2=scan.nextInt();
        obj1.max(n,n2);

    }
}
