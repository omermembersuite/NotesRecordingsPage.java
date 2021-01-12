package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Pages.RoomAccessOnMorePage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_2StepDefs {

    MoreOnHiddenBarPage moreOnHiddenBarPage=new MoreOnHiddenBarPage();
    RoomAccessOnMorePage roomAccessOnMorePage =new RoomAccessOnMorePage();
    @When("user should be able to click Room access on more section")
    public void user_should_be_able_to_click_Room_access_on_more_section() {
        BrowserUtils.wait(1);
        moreOnHiddenBarPage.RoomAccessOnMoreButton.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to see Room access")
    public void user_should_be_able_to_see_Room_access() {
//        Assert.assertTrue(roomAccessOnMorePage.RoomAccessWordOnRoomAccess.isDisplayed());
    }

    @Then("user should be able to see Room link to share")
    public void user_should_be_able_to_see_Room_link_to_share() {
    //    roomAccessOnMorePage.RoomAccessLinkToShareOnRoomAccess.click();
        BrowserUtils.wait(1);

    }

    @When("user should be able to click on Invite People")
    public void user_should_be_able_to_click_on_Invite_People() {
        BrowserUtils.wait(1);
        roomAccessOnMorePage.InvitePeopleEmailAddress.sendKeys("usernameevercast@gmail.com");
    }

    @Then("user should be able to click on add on room access")
    public void user_should_be_able_to_click_on_add_on_room_access() {
        BrowserUtils.wait(2);
        roomAccessOnMorePage.AddEmailOnRoomAccess.click();
    }

    @Then("user should be able to see Invite Create Successfully")
    public void user_should_be_able_to_see_Invite_Create_Successfully() {
        Assert.assertNotNull(roomAccessOnMorePage.AddEmailOnRoomAccess);
    }

    @Then("user should be able to remove usernameevercast@gmail.com")
    public void user_should_be_able_to_remove_usernameevercast_gmail_com() {
        BrowserUtils.wait(2);
        roomAccessOnMorePage.RemoveEmailOnRoomAccess.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Invite Deleted Successfully")
    public void user_should_be_able_to_see_Invite_Deleted_Successfully() {
        Assert.assertNotNull(roomAccessOnMorePage.RemoveEmailOnRoomAccess);
    }

    @Then("user should be able to close room access on more section")
    public void user_should_be_able_to_close_room_access_on_more_section() {
        BrowserUtils.wait(1);
        roomAccessOnMorePage.CloseBarOnRoomAccess.click();
        BrowserUtils.wait(1);

    }
}
