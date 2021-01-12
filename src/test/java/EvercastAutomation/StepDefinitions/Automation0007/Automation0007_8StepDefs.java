package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.GetSupportOnMorePage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation0007_8StepDefs {

    GetSupportOnMorePage getSupportOnMorePage=new GetSupportOnMorePage();

    @When("user should be able to click Get support on more")
    public void user_should_be_able_to_click_Get_support_on_more() {

        BrowserUtils.wait(3);
        getSupportOnMorePage.GetSupportOnMore.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be switch to chat screen")
    public void user_should_be_switch_to_chat_screen() {
        System.out.println("Code will come");
    }

    @When("user should be able to click chat on new frame on chat screen")
    public void user_should_be_able_to_click_chat_on_new_frame_on_chat_screen() {
        System.out.println("Code will come");
    }

    @Then("user should be able to fill name on chat screen")
    public void user_should_be_able_to_fill_name_on_chat_screen() {
        System.out.println("Code will come");
    }

    @Then("user should be able to fill email on chat screen")
    public void user_should_be_able_to_fill_email_on_chat_screen() {
        System.out.println("Code will come");
    }

    @Then("user should be able to fill message on chat screen")
    public void user_should_be_able_to_fill_message_on_chat_screen() {
        System.out.println("Code will come");
    }

}
