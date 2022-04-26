package lecture10.homework.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class ForumBasePage {

    public static ChromeDriver driver;

    public void openChromeByUrl(String url){
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome(){
        driver.quit();
    }

}
