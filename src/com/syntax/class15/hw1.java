package com.syntax.class15;

public class hw1 {
   // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.
    int sum(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        hw1 obj=new hw1();
        int[] a={1,2,3,4,5};
        int total=obj.sum(a);
        System.out.println(total);
    }
}
