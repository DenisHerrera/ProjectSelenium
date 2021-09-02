package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerActions;

public class Customer{

    private CustomerActions action = new CustomerActions();

    @Given("Login page as customer is loaded")
    public void login_page_as_customer_is_loaded() {
        action.loginPageLoad();
    }
    @When("User selects his username to login")
    public void user_selects_his_username_to_login() {
        action.login();
    }

    @Then("User will see a scream to manage their accounts")
    public void user_will_see_a_scream_to_manage_their_accounts() {
        action.loginWithCustomer();
    }

    @Given("The section for deposit is loaded")
    public void the_section_for_deposit_is_loaded() {
        action.sectionDepositLoad();
    }
    @When("User enters amount to deposit")
    public void user_enters_amount_to_deposit(){
        action.addAmountDeposit();
    }

    @Then("User will see a message confirming the deposit")
    public void user_will_see_a_message_confirming_the_deposit() {
        action.confirDeposit();
    }

    @Given("The section for withdraw is loaded")
    public void the_section_for_withdraw_is_loaded() {
        action.withdrawPageLoad();
    }

    @When("User enter amount to withdraw")
    public void user_enter_amount_to_withdraw() throws InterruptedException {
        action.enterAmountWithdraw();
    }

    @Then("User will see a massage confirming the withdraw")
    public void user_will_see_a_massage_confirming_the_withdraw() {
        action.confirmWithdraw();
    }

}
