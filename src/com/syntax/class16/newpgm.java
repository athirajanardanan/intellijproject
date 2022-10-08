package com.syntax.class16;
//Create a method that will take a String as a parameter and returns reversed String.
       // Method should be available to all classes within your project and accessible by class name.

public class newpgm {
    public String rev(String str)
    {
        String strrev=" ";
        for(int i=str.length()-1;i>=0;i-- )
        {
            strrev=strrev+str.charAt(i);
        }
        return strrev;

    }
    public static void main(String[] args)
    {
        newpgm obj=new newpgm();
       String str2= obj.rev("hello");
       System.out.println(str2);
    }
}
