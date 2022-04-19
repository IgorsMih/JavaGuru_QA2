package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BonusTaskOfPain {

    @Test
    public void seleniumHomework() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://220.lv/");

        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(By.xpath("//ul[@class='menu submenu ']")).findElement(By.id("department-4579"));
        action.moveToElement(element1).click().perform();


//        driver.findElement(By.xpath("//div[@class='image-wrap']")).click();


//        driver.findElement(By.xpath("//ul[@class='menu submenu ']/li[12]")).findElement(By.xpath("//a[@data-cy='menu-item']"));


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
