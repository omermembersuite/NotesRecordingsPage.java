package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesRecordingsPage extends BasePage{

    public NotesRecordingsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@id='tab-0']")
    public WebElement ChatOnNotesRecording;

    @FindBy(xpath = "//*[contains(text(),'Chat')]")
    public WebElement ChatWordOnNotesRecording;

    @FindBy(xpath = "//*[contains(text(),'Notes')]")
    public WebElement NotesWordOnNotesRecording;

    @FindBy(xpath = "//*[@name='content']")
    public WebElement WriteMessageContentOnNotesRecording;

    //h1[@class='under-construction-title']

    @FindBy(xpath = "//h1[@class='under-construction-title']")
    public WebElement UpcomingFeatureContentOnNotesRecording;





}
