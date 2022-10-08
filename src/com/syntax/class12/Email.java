package com.syntax.class12;

public class Email {
    String email(String str1,String str2,String str3)
    {
        String email=str1+str2+"@"+str3+".com";
        return email;

    }
    public static void main(String[] args)
    {
        System.out.print("My Email ID is:=");
        Email obj=new Email();
        System.out.println(obj.email("athira","sarath","gmail"));

    }
}
