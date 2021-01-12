package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreOnHiddenBarPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'More')]")
    public WebElement MoreButtonOnButtonHiddenBar;

    @FindBy(xpath = "//span[contains(text(),'Device')]")
    public WebElement DeviceSelectionOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'EBS')]")
    public WebElement EBSStreamKeysOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Screenshare')]")
    public WebElement ScreenShareOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Browser')]")
    public WebElement BrowserStreamOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Get support')]")
    public WebElement GetSupportOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Room access')]")
    public WebElement RoomAccessOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Room settings')]")
    public WebElement RoomSettingsOnMoreButton;

    @FindBy(xpath = "//span[contains(text(),'Record')]")
    public WebElement RecordSessionOnMoreButton;


}
