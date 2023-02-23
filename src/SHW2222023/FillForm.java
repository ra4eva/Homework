package SHW2222023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Gojo");
        driver.findElement(By.id("customer.lastName")).sendKeys("Satoru");
        driver.findElement(By.id("customer.address.street")).sendKeys("Metroploitan Curse Dr");
        driver.findElement(By.id("customer.address.city")).sendKeys("Iwate");
        driver.findElement(By.id("customer.address.state")).sendKeys("Honshu");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("190-0100");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("080-1234-5678");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("JJKStrongest");
        driver.findElement(By.id("customer.password")).sendKeys("GojoGoat");
        driver.findElement(By.id("repeatedPassword")).sendKeys("GojoGoat");
        driver.findElement(By.className("button")).click();

        Thread.sleep(1000);

        driver.quit();
    }
}
