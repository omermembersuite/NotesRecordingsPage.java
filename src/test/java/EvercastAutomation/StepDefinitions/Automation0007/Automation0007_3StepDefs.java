package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.DeviceSelectionOnMorePage;
import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_3StepDefs {

    MoreOnHiddenBarPage moreOnHiddenBarPage=new MoreOnHiddenBarPage();
    DeviceSelectionOnMorePage deviceSelectionOnMorePage= new DeviceSelectionOnMorePage();
    @When("user should be able to click Device selection on more section")
    public void user_should_be_able_to_click_Device_selection_on_more_section() {
        BrowserUtils.wait(1);
        moreOnHiddenBarPage.DeviceSelectionOnMoreButton.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Device selection on more")
    public void user_should_be_able_to_see_Device_selection_on_more() {
        Assert.assertNotNull(deviceSelectionOnMorePage.audioListOnMoreOptions);
        Assert.assertNotNull(deviceSelectionOnMorePage.cameraListOnMoreOptions);
        Assert.assertNotNull(deviceSelectionOnMorePage.micListOnMoreOptions);
    }

    @Then("user should be able to choose low webcam quality on more")
    public void user_should_be_able_to_choose_low_webcam_quality_on_more() {
        deviceSelectionOnMorePage.LowWebcamQualityOnMore.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to choose medium webcam quality on more")
    public void user_should_be_able_to_choose_medium_webcam_quality_on_more() {
        deviceSelectionOnMorePage.MediumWebcamQualityOnMore.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to choose high webcam quality on more")
    public void user_should_be_able_to_choose_high_webcam_quality_on_more() {
        deviceSelectionOnMorePage.HighWebcamQualityOnMore.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to close camera on device selection on more")
    public void user_should_be_able_to_close_camera_on_device_selection_on_more() {
        BrowserUtils.wait(1);
        deviceSelectionOnMorePage.cameraListOnMoreOptions.click();
        BrowserUtils.wait(2);
        deviceSelectionOnMorePage.NoneCameraOnMoreOptions.click();
    }

    @Then("user should be able to close microphone on device selection on more")
    public void user_should_be_able_to_close_microphone_on_device_selection_on_more() {
        BrowserUtils.wait(1);
        deviceSelectionOnMorePage.micListOnMoreOptions.click();
        BrowserUtils.wait(1);
        deviceSelectionOnMorePage.NoneMicOnMoreOptions.click();
    }

    @Then("user should be able to close Audio output on device selection on more")
    public void user_should_be_able_to_close_Audio_output_on_device_selection_on_more() {
        BrowserUtils.wait(1);
        deviceSelectionOnMorePage.audioListOnMoreOptions.click();
        BrowserUtils.wait(1);
        deviceSelectionOnMorePage.NoneAudioOnMoreOptions.click();
    }

    @Then("user should be able to save device selection on more")
    public void user_should_be_able_to_save_device_selection_on_more() {
        BrowserUtils.wait(2);
        deviceSelectionOnMorePage.SaveButtonOnOpenDevSecOnMore.click();
        BrowserUtils.wait(3);
    }
}
