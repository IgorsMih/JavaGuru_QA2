package lecture8;

import lecture8.pages.BasePage;
import lecture8.pages.CarsPagePom;
import lecture8.pages.DogsPagePom;
import lecture8.pages.HomePagePom;
import org.junit.Test;

public class SeleniumTask1 {

    BasePage basePage = new BasePage();
    HomePagePom homePagePom = new HomePagePom();
    DogsPagePom dogsPagePom = new DogsPagePom();
    CarsPagePom carsPagePom = new CarsPagePom();

    @Test
    public void ssLvTest1() {
        basePage.openChromeByUrl("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("dogs");
        dogsPagePom.validatePageUrl();
        dogsPagePom.setPrice("1000", "");
        dogsPagePom.setAge("1", "12");
        dogsPagePom.validateAge("1", "12");
        dogsPagePom.selectRegion("Riga");
        dogsPagePom.pressMekletButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.closeChrome();
    }

    @Test
    public void ssLvTest2() {
        basePage.openChromeByUrl("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("cars");
        carsPagePom.validatePageUrl();
        carsPagePom.setPrice("6000", "10000");
        carsPagePom.selectYear("2001");
        carsPagePom.selectMaxEngine("3.0");
        carsPagePom.selectColorBalta("6318");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.closeChrome();
    }

}
