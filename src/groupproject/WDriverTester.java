package groupproject;

public class WDriverTester {
    public static void main(String[] args) {

        RemoteWebDriver[] webDriver = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};


        for (RemoteWebDriver webdriver : webDriver) {

            System.out.println(webdriver.getTitle());
            webdriver.navigate();
            webdriver.open();
            webdriver.getScreenshot();
            webdriver.close();
        }

    }
}
