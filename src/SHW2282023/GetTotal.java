package SHW2282023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTotal {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        driver.findElement(By.xpath("//input[@id = 'user-message']")).sendKeys("Hai");

        driver.findElement(By.xpath("//button[text()= 'Show Message']")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("10");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        String total = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println(total);


    }
}
