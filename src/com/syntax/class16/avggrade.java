package com.syntax.class16;

public class avggrade {
    public static void main(String[] args)
    {
        hw2 athira=new hw2("Athira",90,80,85);
        System.out.print("Average grade of "+athira.name+" is:=");
        athira.avgGrade();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        hw2 sarath=new hw2("Sarath",87,88,85);
        System.out.print("Average grade of "+sarath.name+" is:=");
        sarath.avgGrade();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        hw2 saketh=new hw2("Saketh",90,90,95);
        System.out.print("Average grade of "+saketh.name+" is:=");
        saketh.avgGrade();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        hw2 surya=new hw2("Suryan",80,84,85);
        System.out.print("Average grade of "+surya.name+" is:=");
        surya.avgGrade();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        hw2 aswathy=new hw2("Aswathy",90,80,85);
        System.out.print("Average grade of "+aswathy.name+" is:=");
        aswathy.avgGrade();


    }
}
