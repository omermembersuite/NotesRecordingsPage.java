package EvercastAutomation.StepDefinitions.Automation0001;

import EvercastAutomation.Pages.*;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Automation0001_2StepDefs {

    LoginPage loginPage= new LoginPage();
    GoLivePage goLivePage= new GoLivePage();
    ExistingRoomPage existingRoomPage=new ExistingRoomPage();
    DrawAnnotationsPage drawAnnotationsPage=new DrawAnnotationsPage();
    ButtonHiddenBarPage buttonHiddenBarPage=new ButtonHiddenBarPage();

    @Then("user should be able to click button hidden bar")
    public void user_should_be_able_to_click_button_hidden_bar() {
        BrowserUtils.waitForClickablility(drawAnnotationsPage.buttonHiddenBar, 6);
        drawAnnotationsPage.buttonHiddenBar.click();
        Assert.assertTrue(drawAnnotationsPage.buttonHiddenBar.isDisplayed());
    }

    @Then("user should be able to see Leave, Enable Microphone, Enable Camera, Enable Audio, Draw Tool, Notes&Recordings, Hide Thumbnails, Enable Fullscreen, Record Session, More")
    public void user_should_be_able_to_see_Leave_Enable_Microphone_Enable_Camera_Enable_Audio_Draw_Tool_Notes_Recordings_Hide_Thumbnails_Enable_Fullscreen_Record_Session_More() {

        Assert.assertNotNull(buttonHiddenBarPage.DisableAudioOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.EnableFullScreenOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.DisableCameraOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.HideThumbnailsOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.DisableMicrophoneOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.NotesRecordingsOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.MoreOnButtonHiddenBar);
        Assert.assertNotNull(drawAnnotationsPage.drawToolOnHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.RecordSessionOnButtonHiddenBar);
        Assert.assertNotNull(buttonHiddenBarPage.ExitButtonOnButtonHiddenBar);

    }
}
