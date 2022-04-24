package lecture8.homework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class ForumProfilePage extends ForumBasePage {

    private final By goToChangeMyData = By.xpath("//a[@class='margin-bottom-quarter inline-block']");
    private final By firstName = By.id("inputFirstName");
    private final By secondName = By.id("inputLastName");
    private final By mobile = By.id("inputMobile");
    private final By cityIn = By.id("inputCity");
    private final By ddSelect = By.id("bdDay");
    private final By monthSelect = By.id("bdMonth");
    private final By yearSelect = By.id("bdYear");
    private final By langSelect = By.id("preferredLanguage");
    private final By genderMailSelect = By.id("genderMale");
    private final By apstiprinatButton = By.xpath("//button[@class='btn btn-primary']");

    public void clickChangeMyData() {
        driver.findElement(goToChangeMyData).click();
    }

    public void inputNames(String fName, String sName) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(secondName).clear();
        driver.findElement(secondName).sendKeys(sName);
    }

    public void inputPhone(String phone) {
        driver.findElement(mobile).clear();
        driver.findElement(mobile).sendKeys(phone);
    }

    public void inputCity(String city) {
        driver.findElement(cityIn).clear();
        driver.findElement(cityIn).sendKeys(city);
    }

    public void selectDD(String dd) {
        Select ddd = new Select(driver.findElement(ddSelect));
        if ("7".equals(dd)) {
            ddd.selectByValue("7");
        } else {
            ddd.selectByValue("1");
        }
    }

    public void selectMonth(String month) {
        Select newMonth = new Select(driver.findElement(monthSelect));
        if ("7".equals(month)) {
            newMonth.selectByValue("7");
        } else {
            newMonth.selectByValue("1");
        }
    }

    public void selectYear(String year) {
        Select newYear = new Select(driver.findElement(yearSelect));
        if ("2000".equals(year)) {
            newYear.selectByValue("2000");
        } else {
            newYear.selectByValue("1912");
        }
    }

    public void selectLanguage(String lang) {
        Select newLang = new Select(driver.findElement(langSelect));
        if ("Angļu".equals(lang)) {
            newLang.selectByVisibleText("Angļu");
        } else {
            newLang.selectByVisibleText("Latviešu");
        }
    }

    public void selectGenderMail() {
        driver.findElement(genderMailSelect).click();
    }

    public void pressApstiprinatButton() {
        driver.findElement(apstiprinatButton).submit();
    }

    public void validateNames(String fName, String sName) {
        assertThat(driver.findElement(firstName).getAttribute("value")).isEqualTo(fName);
        assertThat(driver.findElement(secondName).getAttribute("value")).isEqualTo(sName);
    }

    public void validatePhone(String phone) {
        assertThat(driver.findElement(mobile).getAttribute("value")).isEqualTo(phone);
    }

    public void validateCity(String city) {
        assertThat(driver.findElement(cityIn).getAttribute("value")).isEqualTo(city);
    }

    public void validateDD(String dd) {
        assertThat(driver.findElement(ddSelect).getAttribute("value")).isEqualTo(dd);
    }

    public void validateMonth(String month) {
        assertThat(driver.findElement(monthSelect).getAttribute("value")).isEqualTo(month);
    }

    public void validateYear(String year) {
        assertThat(driver.findElement(yearSelect).getAttribute("value")).isEqualTo(year);
    }

    public void validateLanguage(String lang) {
        assertThat(driver.findElement(langSelect).getAttribute("value")).isEqualTo(lang);
    }

    public void validateMailGenderIsSelected() {
        assertThat(driver.findElement(genderMailSelect).isSelected()).isTrue();
    }

}
