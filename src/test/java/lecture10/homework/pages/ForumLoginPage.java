package lecture10.homework.pages;

import lecture10.homework.model.UserStatic;
import org.openqa.selenium.By;

public class ForumLoginPage extends ForumBasePage {

    UserStatic userStatic = new UserStatic();
    private final By loginName = By.xpath("//input[@name='userName']");
    private final By loginPassword = By.xpath("//input[@name='password']");
    private final By submitButton = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public void enterLoginName(String name) {
        if ("IMEmail".equals(name)) {
            name = userStatic.getLoginName();
        } else name = "gmail@gmail.com";
        driver.findElement(loginName).sendKeys(name);
    }

    public void enterPassword(String password) {
        if ("IMPSW".equals(password)) {
            password = userStatic.getPassword();
        } else password = "None";
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void loginSubmit() {
        driver.findElement(submitButton).click();
    }

}
