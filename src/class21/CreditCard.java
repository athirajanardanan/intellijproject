package class21;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    //Create an instance method that will calculate interest based on the given balance.
      //      Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
double balance;
double interest;
CreditCard()
{

}
CreditCard(double balance)
{
    this.balance=balance;
}
void calculateInterest()
{
    interest=balance*(4.5/100);
    System.out.println("interest  is :="+interest+" With a balance of "+balance);
}
}
class Visa extends CreditCard
{

}
class AX extends CreditCard{
    AX(double balance)
    {
        this.balance=balance;
    }
    void calculateInterest()
    {
     interest=balance*(3.5/100);
     System.out.println("Interst provided by AX is:="+interest+"With a balance of "+balance);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        CreditCard obj=new CreditCard(850000);
        AX obj1=new AX(3400000);
        Visa obj2=new Visa();
        obj2.calculateInterest();
        obj.calculateInterest();
        obj1.calculateInterest();
    }
}
