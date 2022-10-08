package com.syntax.class12;

public class replaceprgm {
    public static void main(String[] args)
    {
        String str="athira Sarath";
       str=str.replace("Sarath","Janardanan");
        System.out.println(str);
        String str3="Hello java world";
       str3= str3.replace("Hello","Hi")+str3.replace("world","family");
       System.out.println(str3);


    }
}
