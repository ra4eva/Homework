package SHW2222023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Gojo");
        driver.findElement(By.name("lastname")).sendKeys("Satoru");
        driver.findElement(By.name("reg_email__")).sendKeys("Gojo@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Gojo@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("SILovejjk");
        driver.findElement(By.id("month")).sendKeys("Dec");
        driver.findElement(By.id("day")).sendKeys("7");
        driver.findElement(By.id("year")).sendKeys("1989");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.quit();








    }
}
