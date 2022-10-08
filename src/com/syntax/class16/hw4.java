package com.syntax.class16;

public class hw4 {

    void put()
    {
        String str="Hello";
      String  str1=str.replaceAll("[^'e','o']"," ");
        System.out.println(str1);
    }
    public static void main(String[] args)
    {
        hw4 obj=new hw4();
        obj.put();
    }

}
