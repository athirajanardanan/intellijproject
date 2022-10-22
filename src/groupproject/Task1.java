package groupproject;


public class Task1 {
    //Create an Interface 'Shape' with undefined
    //methods as calculateArea and
    //calculatePerimeter. Create 2 classes Circle &
    //Square that implements functionality defined in
    //the Shape Interface. Test your code.
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.calculateArea(6.5);
        obj.calculatePerimeter(9);

        Square obj2=new Square();
        obj2.calculateArea(8);
        obj2.calculatePerimeter(11);
    }
}
interface Shape{
    void calculateArea(double a);
    void calculatePerimeter(int b);
}
class Circle implements Shape{
double area;
    @Override
    public void calculateArea(double a) {
        area=3.14*a*a;
        System.out.println("The area of circle with radius "+a+" is equal to := "+area);
    }

    @Override
    public void calculatePerimeter(int b) {
        double perimeter=2*3.14*b;
        System.out.println("The perimeter of circle with radius "+b+" is:= "+perimeter);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("The area of square with length "+a+" is:= "+(a*a));
    }

    @Override
    public void calculatePerimeter(int b) {
        System.out.println("The perimeter of square with length "+b+" is:="+(4*b));
    }
}
