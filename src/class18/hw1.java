package class18;

public class hw1 {
    //Write a Student class   that have instance variables name and address. Create a constructor

   // that will initialize those variables. Print name & address of given  student using displayInfo method
    String name;
    String address;


    public hw1(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayinfo()
    {
        System.out.println("Name:="+name);
        System.out.println("Adddress:="+address);
    }

    public static void main(String[] args)
    {
        new hw1("Athira","54 robsoncourt Kanata").displayinfo();
    }
}

