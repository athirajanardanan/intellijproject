package com.syntax.class16;

public class vowels {
    private String vowels(String str)
    {
        String str2=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='a'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                str2=str2+str.charAt(i);
            }
        }
        return str2;
    }
    public static void main(String[] args)
    {
        vowels obj=new vowels();
        System.out.println(obj.vowels("apple"));
    }
}
