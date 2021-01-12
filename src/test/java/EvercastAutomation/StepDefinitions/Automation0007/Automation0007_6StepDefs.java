package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Pages.ScreenShareOnMorePage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_6StepDefs {

    MoreOnHiddenBarPage moreOnHiddenBarPage=new MoreOnHiddenBarPage();
    ScreenShareOnMorePage screenShareOnMorePage=new ScreenShareOnMorePage();

    @When("user should be able to click Screenshare on more section")
    public void user_should_be_able_to_click_Screenshare_on_more_section() {
        BrowserUtils.wait(2);
        moreOnHiddenBarPage.ScreenShareOnMoreButton.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Screenshare settings")
    public void user_should_be_able_to_see_Screenshare_settings() {
        Assert.assertTrue(screenShareOnMorePage.ScreenshareSettingOnMore.isDisplayed());
    }

    @Then("user should be able to choose foureightp screenshare quality")
    public void user_should_be_able_to_choose_foureightp_screenshare_quality() {
        System.out.println("Select method will come");
    }

    @Then("user should be able to choose seventwop screenshare quality")
    public void user_should_be_able_to_choose_seventwop_screenshare_quality() {
        System.out.println("Select method will come");
    }

    @Then("user should be able to choose onehundeightyp screenshare quality")
    public void user_should_be_able_to_choose_onehundeightyp_screenshare_quality() {
        System.out.println("Select method will come");
    }

    @Then("user should be able to close screenshare settings")
    public void user_should_be_able_to_close_screenshare_settings() {
        BrowserUtils.wait(2);
        screenShareOnMorePage.closeBarOnScreenShareOnMoreButton.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Stop Screenshare on more section")
    public void user_should_be_able_to_click_Stop_Screenshare_on_more_section() {
     //   screenShareOnMorePage.StopScreenshareSettingOnMore.click();


    }
}
