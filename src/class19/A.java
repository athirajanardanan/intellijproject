package class19;

public class A {
    // Write program for multilevel inheritance where class C
    // inherits from class B and Class B inherits from Class A.
    String name;
    String hobby;

    void display() {
        System.out.println("My name is :=" + name + ". And my hobby is :=" + hobby);

    }
}
    class B extends A
    {
       String occupation;
       void disp()
       {
           System.out.print("And my occupation is:="+occupation);
       }
    }
    class C extends B{
        int sal;
        void disp2() {
            System.out.print("And salary is :=" + sal);
        }
    }

class D
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.name="Athira";
        obj.hobby="Reading";
        B obj1=new B();
        obj1.occupation="IT";
        C obj2=new C();
        obj2.sal=100;
        obj.display();
        obj1.disp();
        obj2.disp2();




    }
}
