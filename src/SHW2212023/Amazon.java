package SHW2212023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(2000);

        String title=driver.getTitle();
        System.out.println(title);
        String URL=driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();






    }
}
