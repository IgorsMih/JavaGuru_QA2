package lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsPagePom extends BasePage {

    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By yearMin = By.id("f_o_18_min");
    private final By yearMax = By.id("f_o_18_max");
    private final By engineMin = By.id("f_o_15_min");
    private final By engineMax = By.id("f_o_15_max");
    private final By colorBalta = By.id("f_o_17");
    private final By mekletButton = By.xpath("//input[@class='b s12']");
    private final String baseUrl = "https://www.ss.com/lv/transport/cars/";

    public void validatePageUrl() {
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(baseUrl);
    }

    public void setPrice(String min, String max) {
        driver.findElement(priceMin).sendKeys(min);
        driver.findElement(priceMax).sendKeys(max);
    }

    public void selectYearMin(String year) {
        Select minYear = new Select(driver.findElement(yearMin));
        if ("2001".equals(year)) {
            minYear.selectByValue("2001");
        } else {
            minYear.selectByValue("1937");
        }
    }

    public void selectYearMax(String year) {
        Select maxYear = new Select(driver.findElement(yearMax));
        if ("2010".equals(year)) {
            maxYear.selectByValue("2010");
        } else {
            maxYear.selectByValue("1937");
        }
    }

    public void selectMinEngine(String engine) {
        Select minEngine = new Select(driver.findElement(engineMin));
        if ("2.0".equals(engine)) {
            minEngine.selectByValue("2.0");
        } else {
            minEngine.selectByValue("0.1");
        }
    }

    public void selectMaxEngine(String engine) {
        Select maxEngine = new Select(driver.findElement(engineMax));
        if ("3.0".equals(engine)) {
            maxEngine.selectByValue("3.0");
        } else {
            maxEngine.selectByValue("0.1");
        }
    }

    public void selectColorBalta(String color) {
        Select colorBlt = new Select(driver.findElement(colorBalta));
        if ("6318".equals(color)) {
            colorBlt.selectByValue("6318");
        } else {
            colorBlt.selectByValue("137");
        }
    }
    public void pressMekletButton() {
        driver.findElement(mekletButton).click();
    }

    public void validatePrice(String min, String max) {
        pressMekletButton();
        String priceMinText = driver.findElement(priceMin).getAttribute("value");
        assertThat(priceMinText).isEqualTo(min);
        String priceMaxText = driver.findElement(priceMax).getAttribute("value");
        assertThat(priceMaxText).isEqualTo(max);
    }

}
