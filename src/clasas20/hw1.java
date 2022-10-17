package clasas20;
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of
       // Rectangle
      //  Square
       // Box

public class hw1 {
    int length;
    int height;
    int width;


    void area(int length,int width)
    {
        System.out.println("Area of a rectangle with length "+length+" and width "+width+" is equal to:="+(length*width));
    }
    void volume(int length,int width,int height)
    {
        System.out.println("Volume of a box with length "+length+" and width "+width+" and height "+height+" is equal to:="+(length*width*height));
    }
    void area(int length)
    {
        System.out.println("Area of a square with length "+length+" is equal to:="+(length*length));
    }
    public static void main(String[] args)
    {
        hw1 obj=new hw1();
        obj.area(2,4);
        obj.area(2);
        obj.volume(2,4,6);

    }
}
