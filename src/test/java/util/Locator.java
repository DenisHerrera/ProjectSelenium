package util;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator  extends BasePage{

    public static By buttonLoginCustomer = (By) driver.findElement(By.xpath("//button[@ng-click='customer()']"));
    public static By buttonHome = (By) driver.findElement(By.xpath("//button[@ng-click='home()']"));
    public static By buttonLoginManage = (By) driver.findElement(By.xpath("//button[@ng-click='manager()']"));
    public static By buttonLogin = (By) driver.findElement(By.xpath("//button[text()='Login']"));
    public static By labelUserName = (By) driver.findElement(By.xpath("//span[@class= 'fontBig ng-binding']"));

}