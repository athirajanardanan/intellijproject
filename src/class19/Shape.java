package class19;

//Write program:
       // Shape class has a constructor that takes the radius and has a subclass as  circle class.
       // In circle class create a method to calculate the area of circle. Test your code


public class Shape {
int radius;


public Shape(int radius)
{
    this.radius=radius;
}

}
class circle extends Shape
{

    double area;
    circle(int radius)
    {
        super(radius);
    }
    void area() {
        area=3.14*radius*radius;
        System.out.println("Area of a circle with radius "+radius+" is equalt to:= "+area);

    }
}
class circle2
{
    public static void main(String[] args)
    {
        circle c=new circle(3);
        c.area();

    }
}
