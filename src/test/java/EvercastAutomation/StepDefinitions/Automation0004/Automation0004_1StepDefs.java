package EvercastAutomation.StepDefinitions.Automation0004;

import EvercastAutomation.Pages.ButtonHiddenBarPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0004_1StepDefs {

    ButtonHiddenBarPage buttonHiddenBarPage= new ButtonHiddenBarPage();


    @When("user should be able to click Hide Thumbnails")
    public void user_should_be_able_to_click_Hide_Thumbnails() {
        BrowserUtils.wait(2);
        buttonHiddenBarPage.HideThumbnailsOnButtonHiddenBar.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to click Show Thumbnails")
    public void user_should_be_able_to_click_Show_Thumbnails() {
        buttonHiddenBarPage.ShowThumbnailsOnButtonHiddenBar.click();
        BrowserUtils.wait(2);

    }

    @Then("user should be able to see Thumbnails element")
    public void user_should_be_able_to_see_Thumbnails_element() {
//        Assert.assertTrue(buttonHiddenBarPage.HideThumbnailsOnButtonHiddenBar.isDisplayed());
    }

}
