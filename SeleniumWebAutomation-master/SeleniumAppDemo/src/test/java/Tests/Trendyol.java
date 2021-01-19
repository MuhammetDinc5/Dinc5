package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Trendyol {

    public WebDriver driver;
    //public WebDriverWait wait;
    @Before
    public void setupDriver(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\cs_mu\\OneDrive\\Masaüstü\\Trendyol-Test-Otomasyon\\geckodriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.trendyol.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }
    @Test
    public void TestSearch() throws InterruptedException {
        // açılan pop-up da seçim yapılır.
        driver.findElement(By.className("homepage-popup-gender")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".i-user-orange.hover-icon")).click();

        driver.findElement(By.id("login-email")).sendKeys("muhammedinc5@gmail.com");
        driver.findElement(By.id("login-password-input")).sendKeys("cimbom1905");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type=submit]")).click();

        driver.findElement(By.className("modal-close")).click();
        driver.findElement(By.className("search-box")).sendKeys("bilgisayar");

        driver.findElement(By.className("search-box")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector("div[data-id='42082065']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Sepete Ekle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sepetim")).click();



        /* Sepetteki ürün adetinin artırılması */
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='ty-numeric-counter-button']")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("i-trash")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn-item.btn-remove")).click();
        Thread.sleep(3000);




    }

}
