package Project2152023;

public class WebDriverTester {
    public static void main(String[] args) {

        RemoteWebDriver [] browswers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
     for (RemoteWebDriver browser:browswers){
         browser.open();
         browser.close();
         browser.getTitle();
         browser.getScreenshot();
         browser.navigate();
     }
    }
}
