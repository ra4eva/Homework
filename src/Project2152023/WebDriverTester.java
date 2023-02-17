package Project2152023;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] browswers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
     for (WebDriver browser:browswers){
         browser.open();
         browser.close();
         browser.getTitle();
       /*  browser.navigate method is not avaiable */
     }
    }
}
