package com.syntax.class12;
import java.util.Scanner;

public class prime {
    void check(int num) {
        int count = 0;

          if (num > 1) {
            for (int i = 1; i<=num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                    if (count == 2) {
                        System.out.println("Entered number " + num + " is prime");
                    }

                else {
                    System.out.println("Entered number " + num + " is not prime");
                }
            }
         else {
            System.out.println("Entered number is not prime");
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter a number?");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        prime obj=new prime();
        obj.check(num);

    }
}


