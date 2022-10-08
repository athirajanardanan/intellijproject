package com.syntax.class16;

public class hw1 {
    String str1;
    String str2;
    //Write a java class that will have a constructor:
    //one with parameters and second without any parameters. Create a separate
    //Test class where you will execute both of the constructors 1 by 1.
    hw1()
    {
        System.out.println("Constructor without parameters!!!!!!!!!!!!!!");
    }
    hw1(String name,String name2)
    {
        str1=name;
        str2=name2;
        System.out.println("Constructor with parameters");
        System.out.println("Passed parameters are:="+str1+" , "+str2);
    }


}
