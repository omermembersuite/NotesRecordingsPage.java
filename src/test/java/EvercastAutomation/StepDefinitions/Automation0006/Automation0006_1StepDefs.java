package EvercastAutomation.StepDefinitions.Automation0006;

import EvercastAutomation.Pages.RecordSessionOnHiddenBarPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0006_1StepDefs {

    RecordSessionOnHiddenBarPage recordSessionOnHiddenBarPage=new RecordSessionOnHiddenBarPage();

    @When("user should able to click Record Session on hidden bar")
    public void user_should_able_to_click_Record_Session_on_hidden_bar() {
        BrowserUtils.wait(2);
        recordSessionOnHiddenBarPage.RecordSessionOnHiddenBar.click();
        Assert.assertNotNull(recordSessionOnHiddenBarPage.RecordSessionOnHiddenBar.isDisplayed());
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Start Recording")
    public void user_should_be_able_to_see_Start_Recording() {
        System.out.println("Code will come");
    }

    @When("user should be able to click Start on Start Recording")
    public void user_should_be_able_to_click_Start_on_Start_Recording() {
        BrowserUtils.wait(2);
        Assert.assertNotNull(recordSessionOnHiddenBarPage.RecordSessionOnHiddenBar.isDisplayed());
        recordSessionOnHiddenBarPage.StartButtonOnRecordingPage.click();
        BrowserUtils.wait(3);
    }

    @When("user should be able to click Stop Recording session on hidden bar")
    public void user_should_be_able_to_click_Stop_Recording_session_on_hidden_bar() {
            BrowserUtils.wait(2);
            recordSessionOnHiddenBarPage.StopRecordingButtonOnHiddenBar.click();
            BrowserUtils.wait(2);

    }


    @Then("user should be able to see Record Stopped warning")
    public void user_should_be_able_to_see_Record_Stopped_warning() {
        System.out.println("User see");
    }

}
