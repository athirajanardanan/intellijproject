package class19;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    //ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String name;
    int emp_id;
    int salary;
    String address;
    Teacher() {
    }


     Teacher(String name, int emp_id, int salary, String address) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
        this.address = address;

    }
    void display()
    {
        System.out.println("name:="+name+"\n"+"Employee id:="+emp_id+"\n"+"Salary:="+salary+"\n"+"Address:="+address);
    }
}
class Chemistry extends Teacher {
    String subject;

    Chemistry(String name, int emp_id, int salary, String address, String subject) {
        super(name, emp_id, salary, address);
        this.subject = subject;
    }

    void display1() {
        super.display();
        System.out.println("Subject:=" + subject);
    }
}
    class Maths extends Teacher
    {
        String subject;
        Maths(String name,int emp_id,int salary,String address,String subject)
        {
            super(name,emp_id,salary,address);
            this.subject=subject;
        }
        void display1() {
            super.display();
            System.out.println("Subject:=" + subject);
        }

}
    class Piano extends Teacher
    {
        String subject;
        Piano(String name,int emp_id,int salary,String address,String subject)
        {
            super(name,emp_id,salary,address);
            this.subject=subject;
        }
        void display1() {
            super.display();
            System.out.println("Subject:=" + subject);
        }

    }
    class Test {
        public static void main(String[] args) {
            Teacher obj = new Teacher("Athira", 101, 500000, "54 robson court");
            obj.display();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Chemistry obj1 = new Chemistry("Sarath", 102, 100000, "Vyshnavam", "Chemistry");
            obj1.display1();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Maths obj2 = new Maths("Saketh", 103, 5000000, "Thiruvonam", "Maths");
            obj2.display1();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Piano obj3 = new Piano("Surya", 103, 4500000, "Thiruvonam", "Piano");
            obj3.display1();
        }
    }


