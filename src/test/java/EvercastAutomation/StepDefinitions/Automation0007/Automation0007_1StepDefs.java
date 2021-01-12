package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_1StepDefs {

    MoreOnHiddenBarPage moreOnHiddenBarPage=new MoreOnHiddenBarPage();

    @When("user should able to click More on the hidden bar")
    public void user_should_able_to_click_More_on_the_hidden_bar() {
        BrowserUtils.wait(2);
        Assert.assertNotNull(moreOnHiddenBarPage.MoreButtonOnButtonHiddenBar);
        moreOnHiddenBarPage.MoreButtonOnButtonHiddenBar.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Room access, Device Selection, EBS Stream keys, Room Settings, Screenshare, Browser stream, Get Support")
    public void user_should_be_able_to_see_Room_access_Device_Selection_EBS_Stream_keys_Room_Settings_Screenshare_Browser_stream_Get_Support() {
        Assert.assertEquals("Device selection", moreOnHiddenBarPage.DeviceSelectionOnMoreButton.getText());
        Assert.assertEquals("EBS stream keys", moreOnHiddenBarPage.EBSStreamKeysOnMoreButton.getText());
        Assert.assertEquals("Screenshare", moreOnHiddenBarPage.ScreenShareOnMoreButton.getText());
        Assert.assertEquals("Browser stream", moreOnHiddenBarPage.BrowserStreamOnMoreButton.getText());
        Assert.assertEquals("Get support", moreOnHiddenBarPage.GetSupportOnMoreButton.getText());
    }
}
