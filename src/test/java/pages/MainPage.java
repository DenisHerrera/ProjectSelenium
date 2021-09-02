package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import util.Locator;

import java.util.concurrent.TimeUnit;

public class MainPage extends Locator {

    private int sizeListCustomers = 0;

    public void loadRegistrationPage(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
    }

    public void registerCustomer(){
        driver.findElement(firstNameField).sendKeys("Diego");
        driver.findElement(lastNameField).sendKeys("Peres");
        driver.findElement(codePostalField).sendKeys("0000");
        driver.findElement(addCustomerButton).click();

    }

    public void verifyRegister(){
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertNotEquals(null,driver.switchTo().alert());
        alert.accept();
    }

    public void loadOpenAccountPage(){
        driver.findElement(openAccountButton).click();
    }

    public void addAccount(){
        driver.findElement(listUser).click();
        driver.findElement(dollarAccount).click();
        driver.findElement(processButton).click();

    }
    public  void loadCustomerPage(){
        driver.findElement(showCustButton).click();
    }

    public void searchCustomer(){
        mountElements();
        driver.findElement(searchCustomerField).sendKeys("Diego");
    }

    public void deleteCustomer(){
        driver.findElement(deleteButton).click();
    }

    private void mountElements(){
        sizeListCustomers = driver.findElements(By.xpath("//tr[@class = 'ng-scope']")).size();
        System.out.println(sizeListCustomers);
    }

    public void verifyDelete(){
        driver.findElement(searchCustomerField).clear();
        Assert.assertNotEquals(sizeListCustomers,driver.findElements(By.xpath("//tr[@class = 'ng-scope']")).size());
    }

    public void loadMainPage(){
        driver.findElement(buttonHome).click();
    }


}

