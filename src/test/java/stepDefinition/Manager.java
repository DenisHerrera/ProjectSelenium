package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.testng.Assert;
import pages.MainPage;

public class Manager {

    private MainPage managerPage = new MainPage();

    @Given("The customer registration page is loaded")
    public void the_customer_registration_page_is_loaded() {
        managerPage.loadRegistrationPage();
    }

    @When("Manager fills required fields too add a new customer")
    public void manager_fills_required_fields_too_add_a_new_customer() {
        managerPage.registerCustomer();
    }

    @Then("Manager will see a popup with the confirmation of register")
    public void manager_will_see_a_popup_with_the_confirmation_of_register() {
        managerPage.verifyRegister();
    }

    @Given("The open account page is loaded")
    public void the_open_account_page_is_loaded() {
        managerPage.loadOpenAccountPage();
    }
    @When("Manager selects options to add new account")
    public void manager_selects_options_to_add_new_account() {
        managerPage.addAccount();
    }
    @Then("Manager will see a popup with the confirmation of account created")
    public void manager_will_see_a_popup_with_the_confirmation_of_account_created() {
        managerPage.verifyRegister();
    }


    @Given("The customers page is loaded")
    public void the_customers_page_is_loaded() {
        managerPage.loadCustomerPage();
    }
    @When("Manager searches an account to delete")
    public void manager_searches_an_account_to_delete() {
        managerPage.searchCustomer();
        managerPage.deleteCustomer();
    }
    @Then("Account deleted not will see in list of customers")
    public void account_deleted_not_will_see_in_list_of_customers() {
        managerPage.verifyDelete();
        managerPage.loadMainPage();
    }

}
