package File;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        //Define common behavior within parent class and override some of the methods in child classes
        //Define some methods specific to child classes
       // Write example of achieving run time polymorphism

public class Student {

void read()
{
    System.out.println("Hurray I can read");
}
void write()
{
    System.out.println("I can write too!!!!");
}
void play()
{
    System.out.println("My favourite activity is playing with friends");
}
}
class syntaxStudents extends Student
{
    void read()
    {
        System.out.println("I search google for more information ");
    }
    void write()
    {
        System.out.println("Coding is hobby now");
    }
    void programming()
    {
        System.out.println("Java is my favourite language now");
    }
}
class collegeStudent extends Student{
    void read()
    {
        System.out.println("I have to study to get good marks");
    }
    void write()
    {
        System.out.println("I love to write");
    }

    void hangout()
    {
        System.out.println("I love to hangout with friends");

    }
}
class schoolStudent extends Student{
    void read()
    {
        System.out.println("I love books ");
    }
    void homeWork()
    {
        System.out.println("I have lot of homeworks");
    }

    void write()
    {
        System.out.println("I love to write");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Student[] st={new syntaxStudents(),new schoolStudent(),new collegeStudent()};
        for(int i=0;i<st.length;i++)
        {
            st[i].read();
            st[i].write();
        }
        syntaxStudents obj1=new syntaxStudents();
        collegeStudent obj2=new collegeStudent();
        schoolStudent obj3=new schoolStudent();
        obj1.programming();
        obj2.hangout();
        obj3.homeWork();

    }
}