package com.syntax.class1;

public class swappingtwostrings {
    public static void main(String[] args)
    {
        String str1="mother";
        String str2="Father";
        System.out.println("Before swapping:=str1->"+str1+"and str2->"+str2);
        System.out.println("After swapping");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        str1=str1+str2;

        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("str1->"+str1+"and str2->"+str2);
    }
}
