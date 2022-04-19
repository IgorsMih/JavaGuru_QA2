package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeleniumTask1 {

    @Test
    public void firstSeleniumTest() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("mtd_300")).click();
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("https://www.ss.com/lv/animals/dogs/");

        Select dogType = new Select(driver.findElements(By.className("filter_sel")).get(1));
        dogType.selectByValue("riga_f");
// Find element age and enter some data
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
// Find element meklet button by xpath
        driver.findElement(By.xpath("//input[@class='b s12']")).click();
// Get textbox text
        String ageText = driver.findElement(By.id("f_o_1276_min")).getAttribute("value");
        assertThat(ageText).isEqualTo("1");

//        driver.findElement(By.cssSelector("input[class = 'b s12']")).click();
        driver.findElement(By.xpath("//input[@class = 'b s12']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
