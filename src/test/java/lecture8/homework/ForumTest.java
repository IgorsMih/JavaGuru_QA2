package lecture8.homework;

import lecture8.homework.Pages.ForumBasePage;
import lecture8.homework.Pages.ForumHomePage;
import lecture8.homework.Pages.ForumLoginPage;
import org.junit.Test;

public class ForumTest {

    ForumBasePage forumBasePage = new ForumBasePage();
    ForumHomePage forumHomePage = new ForumHomePage();
    ForumLoginPage forumLoginPage = new ForumLoginPage();

    @Test
    public void forumTest1() {
        forumBasePage.openChromeByUrl("https://www.forumcinemas.lv/");
//        homePagePom.openPageByCategory("dogs");
//        dogsPagePom.validatePageUrl();
//        dogsPagePom.setPrice("1000", "");
//        dogsPagePom.setAge("1", "12");
//        dogsPagePom.validateAge("1", "12");
//        dogsPagePom.selectRegion("Riga");
//        dogsPagePom.pressMekletButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        forumBasePage.closeChrome();
    }

}
