package lecture8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsPagePom extends BasePage {

    private final By priceMin = By.id("f_o_8_min");
    private final By priceMax = By.id("f_o_8_max");
    private final By yearMin = By.id("f_o_18_min");
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

    public void selectYear(String year) {
        Select minYear = new Select(driver.findElement(yearMin));
        minYear.selectByValue("2001");
//        Select dogType = new Select(driver.findElements(filterSel).get(1));
//        if ("2001".equals(region)) {
//            dogType.selectByValue("riga_f");
//        } else {
//            dogType.selectByValue("0");
        }

    public void selectMaxEngine(String engine) {
        Select maxEngine = new Select(driver.findElement(engineMax));
        maxEngine.selectByValue("3.0");
//        Select dogType = new Select(driver.findElements(filterSel).get(1));
//        if ("2001".equals(region)) {
//            dogType.selectByValue("riga_f");
//        } else {
//            dogType.selectByValue("0");
    }

    public void selectColorBalta(String color) {
        Select colour = new Select(driver.findElement(By.id("f_o_17")));
        colour.selectByValue("6318");
//        Select dogType = new Select(driver.findElements(filterSel).get(1));
//        if ("2001".equals(region)) {
//            dogType.selectByValue("riga_f");
//        } else {
//            dogType.selectByValue("0");
    }

    public void pressMekletButton() {
        driver.findElement(mekletButton).click();
    }

}
