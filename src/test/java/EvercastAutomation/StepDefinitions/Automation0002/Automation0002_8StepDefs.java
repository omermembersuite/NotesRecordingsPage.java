package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.BasePage;
import EvercastAutomation.Pages.ClearAllOnDrawPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0002_8StepDefs {
    ClearAllOnDrawPage clearAllOnDrawPage=new ClearAllOnDrawPage();

    @When("user should able to click Clear All on draw tool")
    public void user_should_able_to_click_Clear_All_on_draw_tool() {
        BrowserUtils.wait(1);
        Assert.assertTrue(clearAllOnDrawPage.ClearAllOnDrawTool.isDisplayed());
        clearAllOnDrawPage.ClearAllOnDrawTool.click();
        BrowserUtils.wait(1);

    }

    @Then("user should be able to see verify message from clear All")
    public void user_should_be_able_to_see_verify_message_from_clear_All() {
        Assert.assertTrue(clearAllOnDrawPage.VerifyClearAllMessage.isDisplayed());
        BrowserUtils.wait(2);
    }

    @Then("user should be able to click yes on clear all tab")
    public void user_should_be_able_to_click_yes_on_clear_all_tab() {
        Assert.assertNotNull(clearAllOnDrawPage.ApproveClearAllMessage.isDisplayed());
        clearAllOnDrawPage.ApproveClearAllMessage.click();
        BrowserUtils.wait(2);
    }
}
