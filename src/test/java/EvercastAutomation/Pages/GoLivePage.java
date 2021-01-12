package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.BrowserUtils;
import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GoLivePage extends BasePage {


    @FindBy(xpath = "//*[@data-testid='microphone-toggle-button']")
    public WebElement microphoneBeforeGoLive;

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement room112314;

    @FindBy(xpath = "//*[@data-testid='camera-toggle-button']")
    public WebElement camBeforeGoLive;

    @FindBy(xpath = "//*[@data-testid='go-live-button']")
    public WebElement GoLiveButton;

    @FindBy(xpath = "//*[@class='lobby-subtitle']")
    public WebElement WelcomeLobbyonGoLive;

    @FindBy(xpath = "//*[@data-testid='open-device-selection-button']")
    public WebElement OpenDeviceSelectionBeforeGo;

    @FindBy(xpath = "//*[@value='262144']")
    public WebElement LowWebcamQualityBeforeGo;

    @FindBy(xpath = "//*[@value='524288']")
    public WebElement MediumWebcamQualityBeforeGo;

    @FindBy(xpath = "//*[@value='1048576']")
    public WebElement HighWebcamQualityBeforeGo;

    @FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']")
    public WebElement SaveButtonOnOpenDevSecBeforeGo;

    @FindBy(xpath = "//*[@title='Enable Fullscreen ']")
    public WebElement DemoFullScreen;

    @FindBy(xpath = "//*[@title='Disable Fullscreen']")
    public WebElement DemoDisableFullScreen;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
    public WebElement cameraListBeforeGoOptions;

    @FindBy(xpath = "//*[@role='listbox']//*[@data-value='none']")
    public WebElement NoneCameraBeforeGoOptions;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
    public WebElement micListBeforeGoOptions;

    @FindBy(xpath = "(//*[@role='option'])[1]")
    public WebElement NoneMicBeforeGoOptions;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[3]")
    public WebElement audioListBeforeGoOptions;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    public WebElement NoneAudioBeforeGoOptions;



    public void noneForCameraBeforeGo(){
        cameraListBeforeGoOptions.click();
        BrowserUtils.wait(2);
        NoneCameraBeforeGoOptions.click();
        BrowserUtils.wait(1);

    }

    public void noneForMicrophoneBeforeGo(){
        micListBeforeGoOptions.click();
        BrowserUtils.wait(2);
        NoneMicBeforeGoOptions.click();
        BrowserUtils.wait(1);

    }

    public void noneForAudioBeforeGo(){
        audioListBeforeGoOptions.click();
        BrowserUtils.wait(2);
        NoneAudioBeforeGoOptions.click();
        BrowserUtils.wait(1);

    }
    public GoLivePage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }

    public void DemoFullScreenEnable(){
        DemoFullScreen.click();
    }
    public void DemoFullScreenDisable(){
        DemoDisableFullScreen.click();
    }

    public void EnterExistingRoom(){
        room112314.click();
    }

    public void disableMicBeforeGo(){
        BrowserUtils.waitForClickablility(microphoneBeforeGoLive,15);
        microphoneBeforeGoLive.click();
    }

    public String WelcomeLobby(){
       return WelcomeLobbyonGoLive.getText();
    }

    public void disableCameraBeforeGo(){
        BrowserUtils.waitForClickablility(camBeforeGoLive,15);
        camBeforeGoLive.click();
    }

    public void goLive(){
        BrowserUtils.waitForVisibility(GoLiveButton,12);
        GoLiveButton.click();
    }


    public void DeviceSelectionBeforeGo(){
        BrowserUtils.waitForVisibility(OpenDeviceSelectionBeforeGo,12);
        OpenDeviceSelectionBeforeGo.click();
    }

    public void LowWebcamBeforeGo(){
        BrowserUtils.wait(2);
        LowWebcamQualityBeforeGo.click();
    }

    public void MedWebcamBeforeGo(){

        MediumWebcamQualityBeforeGo.click();
    }

    public void HighWebcamBeforeGo(){

        HighWebcamQualityBeforeGo.click();
    }

    public void SaveButtonOnOpDevBefGo(){

        SaveButtonOnOpenDevSecBeforeGo.click();
    }

}
