package class23;


//Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
         //  closeBrowser(), maximizeWindow(), findElement().
       // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{
    public void openBrowser()
    {
        System.out.println("Hello welcome to chrome!!!");
    }
    public void closeBrowser()
    {
        System.out.println("Good bye chrome!!See you again");
    }
    public void maximizeWindow()
    {
        System.out.println("By clicking maximize you can see fully");
    }
    public void findElement()
    {
        System.out.println("Using findElement feature you can search for an element");
    }
}
class FirefoxDriver implements WebDriver{
    public void openBrowser()
    {
        System.out.println("Hello welcome to firefox!!!");
    }
    public void closeBrowser()
    {
        System.out.println("Good bye firefox!!See you again");
    }
   public void maximizeWindow()
    {
        System.out.println("By clicking maximize you can see fully");
    }
    public void findElement()
    {
        System.out.println("Using findElement feature you can search for an element");
    }
}
class test
{
    public static void main(String[] args)
    {
        ChromeDriver obj=new ChromeDriver();
        obj.closeBrowser();
        obj.findElement();
        obj.openBrowser();
        obj.maximizeWindow();
        FirefoxDriver obj1=new FirefoxDriver();
        obj1.closeBrowser();
        obj1.findElement();
        obj1.openBrowser();
        obj1.maximizeWindow();

    }
}
