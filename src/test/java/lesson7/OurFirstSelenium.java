package lesson7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurFirstSelenium {

    @Test
    public void firstSelenium() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("250");
        driver.findElement(By.id("f_o_8_max")).sendKeys("500");
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("3");
        driver.findElement(By.cssSelector("input[class = 'b s12']")).click();
//        driver.findElement(By.xpath("//input[@class = 'b s12']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

}
