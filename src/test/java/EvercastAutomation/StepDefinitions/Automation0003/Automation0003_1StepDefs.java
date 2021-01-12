package EvercastAutomation.StepDefinitions.Automation0003;

import EvercastAutomation.Pages.ButtonHiddenBarPage;
import EvercastAutomation.Pages.NotesRecordingsPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Automation0003_1StepDefs {

    ButtonHiddenBarPage buttonHiddenBarPage= new ButtonHiddenBarPage();
    NotesRecordingsPage notesRecordingsPage=new NotesRecordingsPage();

    @When("user should be able to click Notes&Recordings on button bar")
    public void user_should_be_able_to_click_Notes_Recordings_on_button_bar() {
        BrowserUtils.wait(3);
        buttonHiddenBarPage.NotesRecordingsOnButtonHiddenBar.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to see Chat, Notes on Notes & Recordings")
    public void user_should_be_able_to_see_Chat_Notes_on_Notes_Recordings() {
       Assert.assertTrue(notesRecordingsPage.ChatWordOnNotesRecording.isDisplayed());
       Assert.assertTrue(notesRecordingsPage.NotesWordOnNotesRecording.isDisplayed());
    }

    @Then("user should be able to see Write a message here. Press Enter to submit")
    public void user_should_be_able_to_see_Write_a_message_here_Press_Enter_to_submit() {
        Assert.assertTrue(notesRecordingsPage.WriteMessageContentOnNotesRecording.isDisplayed());
    }

    @Then("user should be able to click Chat area")
    public void user_should_be_able_to_click_Chat_area() {
        BrowserUtils.wait(2);
        Assert.assertNotNull(notesRecordingsPage.ChatOnNotesRecording);
        notesRecordingsPage.ChatOnNotesRecording.click();
        BrowserUtils.wait(2);
    }


    @When("user should be able to click Notes on Notes & Recordings")
    public void user_should_be_able_to_click_Notes_on_Notes_Recordings() {
        Assert.assertNotNull(notesRecordingsPage.NotesWordOnNotesRecording.isDisplayed());
        notesRecordingsPage.NotesWordOnNotesRecording.click();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to see This is an upcoming feature.")
    public void user_should_be_able_to_see_This_is_an_upcoming_feature() {

        Assert.assertEquals("This is an upcoming feature.", notesRecordingsPage.UpcomingFeatureContentOnNotesRecording.getText());
    }

}
