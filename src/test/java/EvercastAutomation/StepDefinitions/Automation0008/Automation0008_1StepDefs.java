package EvercastAutomation.StepDefinitions.Automation0008;

import EvercastAutomation.Pages.BasePage;
import EvercastAutomation.Pages.ExitPageOnHiddenBar;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation0008_1StepDefs {

    ExitPageOnHiddenBar exitPageOnHiddenBar=new ExitPageOnHiddenBar();
    @When("user should able to click to Exit on page")
    public void user_should_able_to_click_to_Exit_on_page() {
        BrowserUtils.wait(2);
        exitPageOnHiddenBar.ExitButtonOnHiddenBar.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see do you want leave message")
    public void user_should_be_able_to_see_do_you_want_leave_message() {
        System.out.println("Message will come");
    }

    @Then("user should be able to click yes Exit screen on hidden bar")
    public void user_should_be_able_to_click_yes_Exit_screen_on_hidden_bar() {
        BrowserUtils.wait(2);
        exitPageOnHiddenBar.YesButtonOnExitOnHiddenBar.click();
        BrowserUtils.wait(3);
    }

}
