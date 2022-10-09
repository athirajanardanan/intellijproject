package class19;

public class A1 {
    // Write program to inherit class A
    //  that has method printF which is static and call or reuse that method into class B
     static void printF() {
        System.out.println("Method inside parent class");
    }
}
class B1 extends A1
{
void put()
{
    super.printF();
    System.out.println("Method inside child class");
}

}
class Main
{
    public static void main(String[] args)
    {
       B1 obj= new B1();
       obj.put();

    }

}
