package com.syntax.class16;

public class hw3 {
    String name;
    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;


    //Write a java class that have 4 constructors with 4 different
    //access levels of constructors(private,public,default,protected)
    //and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 -
    //from different class inside different package  and observe result.
    hw3() {
        System.out.println("~~~~~~~~~~~~~~Hii default constructor~~~~~~~~~");
    }

    private hw3(String str) {
        name = str;
        System.out.println("Hii private constructor with value of " + str);

    }

    public hw3(String str1, String str2) {
        name1 = str1;
        name2 = str2;
        System.out.println("Hii public constructor with values of " + str1 + str2);

    }

    protected hw3(String str1, String str2, String str3) {
        name3 = str1;
        name4 = str2;
        name5 = str3;
        System.out.println("Hii protected constructor with values of " + str1 + str2 + str3);
    }

    public static void main(String[] args) {
        hw3 obj1 = new hw3();
        hw3 obj2 = new hw3("pvt");
        hw3 obj3 = new hw3("pub1 ", "pub2 ");
        hw3 obj4 = new hw3("prot1 ", "prot2 ", "prot3 ");
    }
}
