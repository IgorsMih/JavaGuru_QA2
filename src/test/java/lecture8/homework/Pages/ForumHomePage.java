package lecture8.homework.Pages;

import org.openqa.selenium.By;

public class ForumHomePage extends ForumBasePage {

    private final By toLoginPage = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");

    public void openPageByCategory() {
            driver.findElement(toLoginPage).click();
    }

}