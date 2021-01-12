package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonHiddenBarPage extends BasePage{

    public ButtonHiddenBarPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@title='Hide Thumbnails']")
    public WebElement HideThumbnailsOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Show Thumbnails']")
    public WebElement ShowThumbnailsOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Disable Microphone']")
    public WebElement DisableMicrophoneOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Disable Camera']")
    public WebElement DisableCameraOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Disable Audio']")
    public WebElement DisableAudioOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Notes & Recordings']")
    public WebElement NotesRecordingsOnButtonHiddenBar;

    @FindBy(xpath = "//button[@title='Enable Fullscreen ']")
    public WebElement EnableFullScreenOnButtonHiddenBar;

    @FindBy(xpath = "//*[@data-testid='record-session-button']")
    public WebElement RecordSessionOnButtonHiddenBar;

    @FindBy(xpath = "//span[contains(text(),'Exit')]")
    public WebElement ExitButtonOnButtonHiddenBar;

    @FindBy(xpath = "//div[@role='presentation']/div[1]")
    public WebElement MoreOnButtonHiddenBar;
}
