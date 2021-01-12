package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomAccessOnMorePage extends BasePage{


    @FindBy(xpath = "//div[@class='MuiBox-root jss147 default-dialog-header-title']")
    public WebElement RoomAccessWordOnRoomAccess;

    @FindBy(xpath = "(//button[@type='button'])[17]")
    public WebElement RoomAccessLinkToShareOnRoomAccess;

    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement InvitePeopleEmailAddress;

    @FindBy(xpath = "(//button[@type='submit'])")
    public WebElement AddEmailOnRoomAccess;

    @FindBy(xpath = "(//button[@aria-label='delete invite'])")
    public WebElement RemoveEmailOnRoomAccess;

    @FindBy(xpath = "(//button[@data-testid='default-dialog-header-close-button'])")
    public WebElement CloseBarOnRoomAccess;





}
