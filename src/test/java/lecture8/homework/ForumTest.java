package lecture8.homework;

import lecture8.homework.Pages.ForumBasePage;
import lecture8.homework.Pages.ForumHomePage;
import lecture8.homework.Pages.ForumLoginPage;
import lecture8.homework.Pages.ForumProfilePage;
import org.junit.Test;

public class ForumTest {

    ForumBasePage forumBasePage = new ForumBasePage();
    ForumHomePage forumHomePage = new ForumHomePage();
    ForumLoginPage forumLoginPage = new ForumLoginPage();
    ForumProfilePage forumProfilePage = new ForumProfilePage();

    @Test
    public void forumTest1() {
        forumBasePage.openChromeByUrl("https://www.forumcinemas.lv/");
        forumHomePage.openLoginPage();
        forumLoginPage.enterLoginName("mihejevs.igors@gmail.com");
        forumLoginPage.enterPassword("IM020660");
        forumLoginPage.loginSubmit();
        forumHomePage.openProfilePage();
        forumProfilePage.clickChangeMyData();
        forumProfilePage.inputNames("Igor", "Mihejev");
        forumProfilePage.inputPhone("29111111");
        forumProfilePage.inputCity("Rezekne");
        forumProfilePage.selectDD("7");
        forumProfilePage.selectMonth("7");
        forumProfilePage.selectYear("2000");
        forumProfilePage.selectLanguage("1000");
        forumProfilePage.selectGenderMail();
        forumProfilePage.pressApstiprinatButton();

        forumProfilePage.validateNames("Igor", "Mihejev");
        forumProfilePage.validatePhone("29111111");
        forumProfilePage.validateCity("Rezekne");
        forumProfilePage.validateDD("7");
        forumProfilePage.validateMonth("7");
        forumProfilePage.validateYear("2000");
        forumProfilePage.validateLanguage("1000");
        forumProfilePage.validateMailGenderIsSelected();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        forumBasePage.closeChrome();
    }

}
