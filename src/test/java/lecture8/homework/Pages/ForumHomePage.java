package lecture8.homework.Pages;

import org.openqa.selenium.By;

public class ForumHomePage extends ForumBasePage {

    private final By categoryIenakt = By.className("btn btn-login btn-default");

    public void openPageByCategory(String category) {
        if ("dogs".equals(category)) {
            driver.findElement(categoryIenakt).click();

        }

    }
}