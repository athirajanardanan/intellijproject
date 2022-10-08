package com.syntax.class16;

public class hw2 {
    String name;
    int mark1;
    int mark2;
    int mark3;
    int total=0;
    int avg;

    hw2(String name1,int m1,int m2,int m3)
    {
     name=name1;
     mark1=m1;
     mark2=m2;
     mark3=m3;
     total=total+m1+m2+m3;
    }
    void avgGrade()
    {
        avg=total/3;
        System.out.print(avg);

    }
  //  Write a java Class Students that have a constructor which takes students name and
   //     3 subject grades. Inside your class also have a method to Calculate Average Grade.
   // Test Student class for 5 different students with different marks.
   // Your program should print an average mark of each students name.
}
