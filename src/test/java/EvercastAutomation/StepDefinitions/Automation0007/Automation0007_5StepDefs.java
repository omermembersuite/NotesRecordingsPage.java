package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Pages.RoomSettingsPageOnMore;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_5StepDefs {


    MoreOnHiddenBarPage moreOnHiddenBarPage= new MoreOnHiddenBarPage();
    RoomSettingsPageOnMore roomSettingsPageOnMore=new RoomSettingsPageOnMore();

    @When("user should be able to click Room Settings on more section")
    public void user_should_be_able_to_click_Room_Settings_on_more_section() {
        BrowserUtils.wait(2);
        moreOnHiddenBarPage.RoomSettingsOnMoreButton.click();
        BrowserUtils.wait(3);
    }

    @Then("user should be able to see Room setup and Permissions")
    public void user_should_be_able_to_see_Room_setup_and_Permissions() {
        Assert.assertTrue(roomSettingsPageOnMore.RoomSetUpOnRoomSettings.isDisplayed());
        Assert.assertTrue(roomSettingsPageOnMore.PermissionsOnRoomSettings.isDisplayed());
        BrowserUtils.wait(2);
    }

    @When("user should be able to click permissions")
    public void user_should_be_able_to_click_permissions() {
        roomSettingsPageOnMore.PermissionsOnRoomSettings.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see This is an upcoming on permissions")
    public void user_should_be_able_to_see_This_is_an_upcoming_on_permissions() {
        Assert.assertEquals("This is an upcoming feature.",roomSettingsPageOnMore.PermissionMessageOnRoomSettings.getText());

    }

    @Then("user should be able to save on room settings on more")
    public void user_should_be_able_to_save_on_room_settings_on_more() {
        roomSettingsPageOnMore.SaveButtonOnRoomSettings.click();
        BrowserUtils.wait(2);
    }
}
