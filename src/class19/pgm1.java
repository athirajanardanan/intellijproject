package class19;

public class pgm1 {
    String name;
    pgm1()
    {
System.out.println("Hii");
    }

    public pgm1(String name) {
        this.name = name;
    }
}
class pgm2 extends pgm1
{
    pgm2() {
        super();
    }

}
class t1
{
    public static void main(String[] args)
    {
        pgm2 obj=new pgm2();
    }
}
