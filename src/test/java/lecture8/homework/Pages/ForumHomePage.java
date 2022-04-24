package lecture8.homework.Pages;

import org.openqa.selenium.By;

public class ForumHomePage extends ForumBasePage {

    private final By toLoginPage = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");
    private final By toProfilePage = By.xpath("//a[@class='navbar-link']");

    public void openLoginPage() {
            driver.findElement(toLoginPage).click();
    }

    public void openProfilePage() {
        driver.findElement(toProfilePage).click();
    }

}