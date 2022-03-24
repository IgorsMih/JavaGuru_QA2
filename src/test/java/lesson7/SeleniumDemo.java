package lesson7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    @Test
    public void firstSeleniumTest() {
//        Configure path to driver location
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
//        Configure system for driver location in system
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
//        Create driver object using path from system location
        ChromeDriver driver = new ChromeDriver();
//        Open url using newly created object
        driver.get("https://www.1a.lv/");
//        Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
