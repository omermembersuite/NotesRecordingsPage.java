package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeviceSelectionOnMorePage extends BasePage{


    @FindBy(xpath = "//*[@value='262144']")
    public WebElement LowWebcamQualityOnMore;

    @FindBy(xpath = "//*[@value='524288']")
    public WebElement MediumWebcamQualityOnMore;

    @FindBy(xpath = "//*[@value='1048576']")
    public WebElement HighWebcamQualityOnMore;

    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']")
    public WebElement SaveButtonOnOpenDevSecOnMore;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
    public WebElement cameraListOnMoreOptions;

    @FindBy(xpath = "//*[@role='listbox']//*[@data-value='none']")
    public WebElement NoneCameraOnMoreOptions;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
    public WebElement micListOnMoreOptions;

    @FindBy(xpath = "(//*[@role='option'])[1]")
    public WebElement NoneMicOnMoreOptions;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[3]")
    public WebElement audioListOnMoreOptions;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    public WebElement NoneAudioOnMoreOptions;


}
