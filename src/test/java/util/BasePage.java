package util;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver;

    public BasePage(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
