package lesson7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSAuto {

    @Test
    public void secondSelenium() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/lv/transport/cars/");

        driver.findElement(By.id("f_o_8_min")).sendKeys("10000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("30000");
        Select minYear = new Select(driver.findElement(By.id("f_o_18_min")));
        minYear.selectByValue("2020");
        Select maxYear = new Select(driver.findElement(By.id("f_o_18_max")));
        maxYear.selectByValue("2022");
        Select maxEngine = new Select(driver.findElement(By.id("f_o_15_max")));
        maxEngine.selectByValue("3.0");
        Select colour = new Select(driver.findElement(By.id("f_o_17")));
        colour.selectByValue("6318");
//        driver.findElement(By.cssSelector("input[class = 'b s12']")).click();
        driver.findElement(By.xpath("//input[@class = 'b s12']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

}
