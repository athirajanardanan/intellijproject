package groupproject;
/*Create a Class Car that would have the
        following fields: carPrice and color and method
        calculateSalePrice() which should be returning
        a price of the car.
        Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
        implementation of calculateSalePrice() method
        in which returned price is calculated as
        following: if weight>2000 then returned price
        car should include 10% discount, otherwise 20%
        discount.
        The Sedan class has field as length and also
        does it is own implementation of
        calculateSalePrice(): if length of sedan is >20
        feet then returned car price should include 5%
        discount, otherwise 10% discount*/

public class Car {
    double carPrice;
    String colour;

    public Car(double carPrice, String colour) {
        this.carPrice = carPrice;
        this.colour = colour;
    }

    double calculateSalePrice()
    {
      System.out.println("Price of the car is:="+carPrice);
      return carPrice;
    }

}
class Truck extends Car{

    double weight;
    double discount=0;

    public Truck(double carPrice, String colour, double weight) {
        super(carPrice, colour);
        this.weight = weight;
    }
    double calculateSalePrice()
    {
        if(weight>2000)
        {
           discount=carPrice*.10;
            System.out.print("Price of the car with a 10% discount  is:=");
            return discount;
        }
        else{
            discount=carPrice*.20;
            System.out.print("Price of the with a 20% discount  car is:=");
            return discount;
        }

    }
}
class Sedan extends Car{

    double length;
    double discount;

    public Sedan(double carPrice, String colour, double length) {
        super(carPrice, colour);
        this.length= length;
    }
    double calculateSalePrice()
    {
        if(length>20)
        {
            discount=carPrice*.5;
            System.out.print("Price of the car with a 5% discount is:=");
            return discount;
        }
        else{
            discount=carPrice*.10;
            System.out.print("Price of the car with a 10% discount is:=");
            return discount;
        }

    }
}
class testCode
{
    public static void main(String[] args)
    {
        Car obj=new Car(200000,"white");
        obj.calculateSalePrice();
        Truck obj1=new Truck(256778,"Blue",3400);
        System.out.println(obj1.calculateSalePrice());
        Sedan obj3=new Sedan(23456,"Black",34);
       System.out.println(obj3.calculateSalePrice());

    }
}
