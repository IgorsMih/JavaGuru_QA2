package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeleniumHomeworkObligatory {

    @Test
    public void seleniumHomework() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
        driver.findElement(By.xpath("//img[@class='btn-close']")).click();
        driver.findElement(By.xpath("//img[@class='close-btn']")).click();

        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        assertThat(driver.findElement(By.id("search-key")).getAttribute("value")).isEqualTo("tattoo");
        driver.findElement(By.xpath("//input[@class = 'search-button']")).click();

        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
