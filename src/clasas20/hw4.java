package clasas20;
//Create 1 class with a private method that has 3 overloaded forms.
  //      Then call each overloaded method with specific arguments and observe result
public class hw4 {
    private void sum(int a,int b)
    {

        System.out.println("Sum of "+a+" and "+b+" is:="+(a+b));
    }
    private void sum(int a,int b, int c)
    {
        System.out.println("Sum of "+a+" and "+b+" and "+c+" is:="+(a+b+c));
    }
    private void sum(int a,int b,int c,int d)
    {

        System.out.println("Sum of "+a+" and "+b+" and "+c+" and "+d+" is:="+(a+b+c+d));
    }
    public static void main(String[] args)
    {
        hw4 obj=new hw4();
        obj.sum(2,4);
        obj.sum(2,4,6);
        obj.sum(4,5,6,7);
    }
}
