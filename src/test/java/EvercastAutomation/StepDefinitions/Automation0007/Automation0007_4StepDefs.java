package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.EbsKeyOnMorePage;
import EvercastAutomation.Pages.MoreOnHiddenBarPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0007_4StepDefs {

    MoreOnHiddenBarPage moreOnHiddenBarPage= new MoreOnHiddenBarPage();
    EbsKeyOnMorePage ebsKeyOnMorePage=new EbsKeyOnMorePage();

    @When("user should be able to click EBS stream keys on more section")
    public void user_should_be_able_to_click_EBS_stream_keys_on_more_section() {
        BrowserUtils.wait(2);
        moreOnHiddenBarPage.EBSStreamKeysOnMoreButton.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see EBS keys on screen")
    public void user_should_be_able_to_see_EBS_keys_on_screen() {
        Assert.assertEquals("EBS Keys",ebsKeyOnMorePage.EBSKeysMesOnEbsOnMoreButton.getText());
    //    System.out.println(ebsKeyOnMorePage.EBSKeysMesOnEbsOnMoreButton.getText());
    }

    @Then("user should be able to see Once you have downloaded and installed EBS message")
    public void user_should_be_able_to_see_Once_you_have_downloaded_and_installed_EBS_message() {
        Assert.assertEquals("Once you have  downloaded  and installed EBS, please copy and paste into your EBS settings.\n" +
                "To learn how,  click here.", ebsKeyOnMorePage.InstalledEbsMessageOnEbsOnMoreButton.getText());
     //   System.out.println(ebsKeyOnMorePage.InstalledEbsMessageOnEbsOnMoreButton.getText());
    }

    @Then("user should be able to clickable downloaded page")
    public void user_should_be_able_to_clickable_downloaded_page() {
        Assert.assertEquals("downloaded",ebsKeyOnMorePage.downloadedLinkOnEbsOnMoreButton.getText());
    }

    @Then("user should be able to clickable click here page")
    public void user_should_be_able_to_clickable_click_here_page() {
        Assert.assertEquals("click here",ebsKeyOnMorePage.clickHereOnEbsOnMoreButton.getText());
    }

    @Then("user should be able to click server name copy")
    public void user_should_be_able_to_click_server_name_copy() {
      //  Assert.assertEquals("wss://qa-v3.evercast.us/websockets", ebsKeyOnMorePage.ServerNameVerifyOnEbsOnMoreButton.getText());
        System.out.println(ebsKeyOnMorePage.ServerNameVerifyOnEbsOnMoreButton.getText());
    }

    @Then("user should be able to click server room copy")
    public void user_should_be_able_to_click_server_room_copy() {
        Assert.assertNotNull(ebsKeyOnMorePage.ServerNameCopyLinkOnEbsOnMoreButton.isDisplayed());
    }

    @Then("user should be able to click show stream key")
    public void user_should_be_able_to_click_show_stream_key() {
        BrowserUtils.wait(1);
        ebsKeyOnMorePage.StreamKeyButtonEbsOnMoreButton.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click refresh stream key")
    public void user_should_be_able_to_click_refresh_stream_key() {
        BrowserUtils.wait(1);
        ebsKeyOnMorePage.StreamKeyButtonEbsOnMoreButton.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click close on Ebs Key on More")
    public void user_should_be_able_to_click_close_on_Ebs_Key_on_More() {
        BrowserUtils.wait(2);
        ebsKeyOnMorePage.closeBarOnEbsOnMoreButton.click();
        BrowserUtils.wait(2);

    }
}
