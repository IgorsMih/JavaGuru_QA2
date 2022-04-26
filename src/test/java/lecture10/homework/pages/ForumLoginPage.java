package lecture10.homework.pages;

import org.openqa.selenium.By;

public class ForumLoginPage extends ForumBasePage {

    private final By loginName = By.xpath("//input[@name='userName']");
    private final By loginPassword = By.xpath("//input[@name='password']");
    private final By submitButton = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public void enterLoginName(String name) {
        driver.findElement(loginName).sendKeys(name);
    }

    public void enterPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void loginSubmit() {
        driver.findElement(submitButton).click();
    }

}
