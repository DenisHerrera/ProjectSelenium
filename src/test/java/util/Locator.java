package util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {

    public static WebDriver driver;

    //Main page
    public static By buttonLoginCustomer = By.xpath("//button[@ng-click='customer()']");
    public static By buttonHome = By.xpath("//button[@ng-click='home()']");
    public static String buttonLoginManage = "//button[@ng-click='manager()']";

    //Login customer
    public static By selectUserName = By.xpath("//option[text()='Harry Potter']");
    public static By buttonLogin = By.xpath("//button[text()='Login']");

    //Customer page
    public static By labelUserName = By.xpath("//span[@class= 'fontBig ng-binding']");
    public static String numberAccount = "(//div[@class= 'center']/strong)[1]";
    public static String balance = "(//div[@class= 'center']/strong)[2]";
    public static String currency = "(//div[@class= 'center']/strong)[3]";
    public static String transactionButton = "(//div[@class= 'center']/strong)[1]";
    public static By depositButton = By.xpath("//button[@ng-click='deposit()']");
    public static By withdrawButton = By.xpath("//button[@ng-click='withdrawl()']");
    public static String logoutButton = "//button[@ng-click='byebye()']";

    //Transaction Page
    public static String firstTransaction = "//tr[@id='anchor0']";
    public static String backButton = "//button[@ng-click='back()']";
    public static String resetButton = "//button[@ng-click='reset()']";

    //Deposit page
    public static By fieldAmountDeposit = By.xpath("//input[@type='number']");
    public static By depositAmountButton = By.xpath("//button[text()='Deposit']");
    public static By depositSuccessful = By.xpath("//span[text()='Deposit Successful']");

    //Withdraw
    public static By fieldAmountWithdraw = By.xpath("//input[@ng-model='amount']");
    public static By withdrawAmountButton = By.xpath("//button[text()='Withdraw']");
    public static By transactionSuccessfulMassage = By.xpath("//span[text()='Transaction successful']");
    public static By transactionError = By.xpath("//span[text()='Transaction Failed. You can not withdraw amount more than the balance.']");


    //Manager page
    public static String addCustButton = "//button[@ng-click='addCust()']";
    public static By openAccountButton = By.xpath("//button[@ng-click='openAccount()']");
    public static By showCustButton = By.xpath("//button[@ng-click='showCust()']");

    //Add customer page
    public static By firstNameField = By.xpath("//input[contains(@placeholder,'First Name')]") ;
    public static By lastNameField = By.xpath("//input[@ng-model='lName']");
    public static By codePostalField = By.xpath("//input[@ng-model='postCd']");
    public static By addCustomerButton = By.xpath("//button[text()='Add Customer']");

    //Add account
    public static By listUser= By.xpath("//option[text()='Diego Peres']");
    public static By dollarAccount = By.xpath("(//select[@id = 'currency']/option)[2]");
    public static By poundAccount = By.xpath("(//select[@id = 'currency']/option)[3]") ;
    public static By rupeeAccount = By.xpath("(//select[@id = 'currency']/option)[4]");
    public static By processButton = By.xpath("//button[text()='Process']");

    //All customers
    public static By searchCustomerField = By.xpath("//input[@ng-model = 'searchCustomer']");
    public static By deleteButton = By.xpath("//tr[@class = 'ng-scope']/descendant::button");
}