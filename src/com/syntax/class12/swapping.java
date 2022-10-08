package com.syntax.class12;

public class swapping {
    public static void main(String[] args) {
        String str1 = "python";
        String str2 = "Java";
        str1 = str1 + str2;
        str2 = str1.replace(str2, "");
        str1 = str1.replace(str2, "");
        System.out.println(str1);
        System.out.println(str2);
    }
}
