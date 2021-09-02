package pages;

import org.testng.Assert;
import util.Locator;

public class CustomerActions extends Locator {

    public void loginPageLoad(){
        driver.findElement(buttonLoginCustomer).click();
    }

    public void login(){
        driver.findElement(selectUserName).click();
        driver.findElement(buttonLogin).click();
    }

    public void loginWithCustomer(){
        String userName = driver.findElement(labelUserName).getText();
        Assert.assertEquals(userName,"Harry Potter");
    }

    public void sectionDepositLoad(){
        driver.findElement(depositButton).click();
    }

    public void addAmountDeposit(){
        driver.findElement(fieldAmountDeposit).sendKeys("100");
        driver.findElement(depositAmountButton).click();
    }

    public void confirDeposit(){
        boolean deposit = driver.findElement(depositSuccessful).isDisplayed();
        Assert.assertEquals(true,deposit);
    }

    public void withdrawPageLoad(){
        driver.findElement(withdrawButton).click();
    }

    public void enterAmountWithdraw() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(fieldAmountWithdraw).sendKeys("50");
        driver.findElement(withdrawAmountButton).click();
    }

    public void confirmWithdraw(){
        String seccessful = driver.findElement(transactionSuccessfulMassage).getText();
        Assert.assertEquals("Transaction successful", seccessful);
        driver.close();
        driver.quit();
    }
}
