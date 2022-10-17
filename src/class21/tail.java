package class21;

public class tail {
    String name;
    int age;
    String lastname;
    int ex;
    int sal;
    public tail(String name, int age, int sal,String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
        this.sal=sal;
        System.out.println(name+age+lastname+sal);
    }
tail(String lname,String name,int sal,int ag,int ex)
{
    this(name,ag,sal,lname);
    this.ex=ex;;
    System.out.println(name+lname+ag+ex+sal);
}
public static void main(String[] args)
{
    tail obj=new tail("Athi",32,450000,"janardanan");
    tail obj1=new tail("sarath","saketh",378888,32,12);
}


}
