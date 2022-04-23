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
        forumHomePage.openPageByCategory();
        forumLoginPage.enterLoginName("mihejevs.igors@gmail.com");
        forumLoginPage.enterPassword("IM020660");
        forumLoginPage.loginSubmit();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        forumBasePage.closeChrome();
    }

}
