package Demoqaa;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Elements{
    static WebDriver driver;

    public void element() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AM64\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }

    public void webtables(){
        driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Anitha");
        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("M");
        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("anitha@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"age\"]")).sendKeys("23");
        driver.findElement(By.xpath("//input[@id=\"salary\"]")).sendKeys("30000");
        driver.findElement(By.xpath("//input[@id=\"department\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
    }

    public  void buttons() {
        JavascriptExecutor jre = ((JavascriptExecutor) driver);
        jre.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//li[@id=\"item-4\"]")).click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
        action.doubleClick(doubleClick).perform();
        System.out.println(doubleClick.getText());
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Actions action1 = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
        action1.contextClick(rightClick).perform();
        System.out.println(rightClick.getText());
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        Actions action2 = new Actions(driver);
        WebElement click = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
        click.click();
        System.out.println(click.getText());
    }
    public void links()  {
        JavascriptExecutor jr1 = ((JavascriptExecutor) driver);
        jr1.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("//li[@id=\"item-5\"]")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.switchTo().window(driver.getWindowHandle());
        System.out.println(driver.getTitle());
         driver.navigate().back();
        JavascriptExecutor jre = ((JavascriptExecutor) driver);
        jre.executeScript("window.scrollBy(0,450)", "");
    }
}
