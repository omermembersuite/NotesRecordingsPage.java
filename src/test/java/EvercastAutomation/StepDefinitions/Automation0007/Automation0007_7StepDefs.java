package EvercastAutomation.StepDefinitions.Automation0007;

import EvercastAutomation.Pages.BrowserStreamOnMorePage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation0007_7StepDefs {

    BrowserStreamOnMorePage browserStreamOnMorePage=new BrowserStreamOnMorePage();
    @When("user should be able to click Browser Stream on more")
    public void user_should_be_able_to_click_Browser_Stream_on_more() {
        BrowserUtils.wait(3);
        browserStreamOnMorePage.BrowserStreamOnMore.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Browser Stream")
    public void user_should_be_able_to_see_Browser_Stream() {
        // System.out.println("Assertion will come");
    }

    @Then("user should be able to Do not use screen share if you ...warning on browser stream")
    public void user_should_be_able_to_Do_not_use_screen_share_if_you_warning_on_browser_stream() {
        //System.out.println("Assertion will come");
    }

    @Then("user should be able to choose default one video source on browser stream")
    public void user_should_be_able_to_choose_default_one_video_source_on_browser_stream() {
       browserStreamOnMorePage.VideoSourceButtonOnBrowserStreamOnMore.click();
       BrowserUtils.wait(2);
       browserStreamOnMorePage.FakeVideoSourceButtonOnBrowserStreamOnMore.click();
       BrowserUtils.wait(2);
    }

    @Then("user should be able to choose default one audio source on browser stream")
    public void user_should_be_able_to_choose_default_one_audio_source_on_browser_stream() {
        browserStreamOnMorePage.AudioSourceButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
        browserStreamOnMorePage.FakeAudioSourceButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to choose foureightyp resolution source on browser stream")
    public void user_should_be_able_to_choose_foureightyp_resolution_source_on_browser_stream() {
        browserStreamOnMorePage.ResolutionButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
        browserStreamOnMorePage.FourEightyResButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to click to start on browser stream")
    public void user_should_be_able_to_click_to_start_on_browser_stream() {
        BrowserUtils.wait(2);
        browserStreamOnMorePage.StartButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see thumbnail of browsershare stream on screen")
    public void user_should_be_able_to_see_thumbnail_of_browsershare_stream_on_screen() {
         //System.out.println("Assert will come");
    }

    @Then("user should be able to click Stop browsershare on more section")
    public void user_should_be_able_to_click_Stop_browsershare_on_more_section() {
        BrowserUtils.wait(2);
        browserStreamOnMorePage.StopButtonOnBrowserStreamOnMore.click();
        BrowserUtils.wait(2);
    }
}
