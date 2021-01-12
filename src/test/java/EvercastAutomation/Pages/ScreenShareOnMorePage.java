package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScreenShareOnMorePage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Screenshare')]")
    public WebElement ScreenshareSettingOnMore;

    @FindBy(xpath = "//*[@data-testid='default-dialog-header-close-button']")
    public WebElement closeBarOnScreenShareOnMoreButton;

    @FindBy(xpath = "//div[contains(text(),'Stop Screenshare')]")
    public WebElement StopScreenshareSettingOnMore;

}
