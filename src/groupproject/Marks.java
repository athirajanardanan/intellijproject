package groupproject;
//We have to calculate the average of marks
//   obtained in three subjects by student A and by
       // student B. Create class 'Marks' with an abstract
//method 'getPercentage' that will be returning
    //    the average percentage of marks. Provide
      //  implementation of abstract method in classes
        //'A' and 'B'. The constructor of student A takes the
       // marks in three subjects as its parameters and
       // the marks in four subjects as its parameters for
       // student B. Test your code


 abstract public class Marks {
   abstract double getPercentage();

}
class A extends Marks
{
    double m1;
    double m2;
    double m3;
    double avg;

    public A(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    double getPercentage()
    {
        avg=(m1+m2+m3)/3;
        return avg;
    }
}
class B extends Marks
{
    double m1;
    double m2;
    double m3;

    double m4;
    double avg;

    public B(double m1, double m2, double m3,double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4=m4;
    }
    double getPercentage()
    {
        avg=(m1+m2+m3+m4)/4;
        return avg;
    }

}
class Test
{
    public static void main(String[] args)
    {
        A obj=new A(90,87,89.5);
        System.out.println("Average marks of student 1 is:="+(obj.getPercentage()));
        B obj1=new B(89,85,78,95);
        System.out.println("Average marks of student 2 is:="+(obj1.getPercentage()));
    }
}