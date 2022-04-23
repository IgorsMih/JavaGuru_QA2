package lecture11;

import com.codeborne.selenide.Configuration;
import lecture11.pages.CarsPagePom;
import lecture11.pages.DogsPagePom;
import lecture11.pages.HomePagePom;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class SeleniumTask1 {

    HomePagePom homePagePom = new HomePagePom();
    DogsPagePom dogsPagePom = new DogsPagePom();
    CarsPagePom carsPagePom = new CarsPagePom();


    @Test
    public void ssLvTest() {
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("dogs");
        dogsPagePom.validatePageUrl();
        dogsPagePom.setPrice("1000", "");
        dogsPagePom.setAge("1", "12");
        dogsPagePom.validateAge("1", "12");
        dogsPagePom.selectRegion("Riga");
        dogsPagePom.pressMekletButton();
    }

    @Test
    public void ssLvTest2() {
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.com/lv/");
        homePagePom.openPageByCategory("cars");
        carsPagePom.validatePageUrl();
        carsPagePom.setPrice("6000", "10000");
        carsPagePom.validatePrice("6000", "10000");
        carsPagePom.selectYearMin("2001");
        carsPagePom.selectYearMax("2010");
        carsPagePom.selectMinEngine("2.0");
        carsPagePom.selectMaxEngine("3.0");
        carsPagePom.selectColorBalta("6318");
        carsPagePom.pressMekletButton();
    }

}
