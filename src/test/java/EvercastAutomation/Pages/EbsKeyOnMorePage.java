package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbsKeyOnMorePage extends BasePage{


    @FindBy(xpath = "//a[contains(text(),'downloaded')]")
    public WebElement downloadedLinkOnEbsOnMoreButton;

    @FindBy(xpath = "//a[contains(text(),'click')]")
    public WebElement clickHereOnEbsOnMoreButton;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorTextSecondary']")
    public WebElement InstalledEbsMessageOnEbsOnMoreButton;

    @FindBy(xpath = "//div[contains(text(), 'EBS Keys')]")
    public WebElement EBSKeysMesOnEbsOnMoreButton;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall'])[1]")
    public WebElement ServerNameCopyLinkOnEbsOnMoreButton;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement ServerNameVerifyOnEbsOnMoreButton;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall'])[2]")
    public WebElement ServerRoomCopyLinkOnEbsOnMoreButton;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall'])[3]")
    public WebElement StreamKeyCopyLinkOnEbsOnMoreButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement StreamKeyButtonEbsOnMoreButton;

    @FindBy(xpath = "//*[@data-testid='default-dialog-header-close-button']")
    public WebElement closeBarOnEbsOnMoreButton;

}
