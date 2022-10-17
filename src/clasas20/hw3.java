package clasas20;

public class hw3 {
    static void display()
    {
        System.out.println("Method without arguments");
    }
   static void display(String s)
    {
     System.out.println("Hii Iam inside a method with one argument "+s);
    }
    static void display(int a,int b)
    {
        System.out.println("Iam inside a method with 2 arguments and they are "+a+" and "+b);
    }
    public static void main(String[] args)
    {
        hw3.display();
        hw3.display("hello");
        hw3.display(2,4);
    }
}
