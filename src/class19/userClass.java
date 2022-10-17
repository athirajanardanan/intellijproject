package class19;
//Write program: userClass  that has a constructor
       // that initializes instance variable name and mobile number.
       // Create a subclass  userInfo that will have user address variable and it also being
      //  initialized through constructor call. Print users name, mobile number and address in userDetails method.
       // Test your code
public class userClass {
    String name;
    long mobile_number;

   public userClass(String name,long mobile_number)
    {
        this.name=name;
        this.mobile_number=mobile_number;

    }
}
class userInfo extends userClass{
    String userAddress;
   public userInfo(long number,String name,String userAddress) {
        super(name,number);
        this.userAddress = userAddress;
    }
    void userDetails()
    {
       System.out.println("Name:="+name);
       System.out.println("Mobile number:="+mobile_number);
       System.out.println("Address is:="+userAddress);
    }

}
class user
{
    public static void main(String[] args)
    {
        userInfo obj=new userInfo(613323,"athira","54 robson court kanata");
        obj.userDetails();
    }
}
