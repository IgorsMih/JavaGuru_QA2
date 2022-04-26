package lecture10.homework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lecture10.homework.pages.ForumBasePage;
import lecture10.homework.pages.ForumHomePage;

public class HomePageStep {

    ForumBasePage forumBasePage = new ForumBasePage();
    ForumHomePage forumHomePage = new ForumHomePage();

    @Given("Open Home Page")
    public void openHomePage() {
        forumBasePage.openChromeByUrl("https://www.forumcinemas.lv/");
    }

    @And("Open Login Page")
    public void openLoginPage() {
        forumHomePage.openLoginPage();
    }

    @Given("Open Profile Page")
    public void openProfilePage() {
        forumHomePage.openProfilePage();
    }

    @And("Close All Pages")
    public void closeAllPages() {
        forumBasePage.closeChrome();
    }
}
