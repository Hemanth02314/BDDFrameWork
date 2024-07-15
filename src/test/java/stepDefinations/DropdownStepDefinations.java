package stepDefinations;


import browserControl.webConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownPage;

public class DropdownStepDefinations extends webConnector {
        DropdownPage dropdownPageObjects = new DropdownPage();

        // @Given("the user navigates to home page")
        public void the_user_navigate_to_home_page() {
            //  driver.get(ConstantUtils.BASE_URL);
        }

        @Then("the user must see the {int} options in the dropdown box")
        public void the_user_must_see_the_options_in_the_dropdown_box(int count) {
            dropdownPageObjects.checkNumberOfOptions(count);
        }
        @When("the user select {string} option from the dropdown")
        public void the_user_select_option_from_the_dropdown(String dropdown) throws InterruptedException {
            dropdownPageObjects.selectOptionFromDropdown(dropdown);
            Thread.sleep(3000);
        }
        @Then("the user should see {string} option is selected in the dropdown")
        public void the_user_should_see_option_is_selected_in_the_dropdown(String selectdropdown) throws InterruptedException {
            dropdownPageObjects.checkSelectedOption(selectdropdown);
            Thread.sleep(3000);
        }
    }

