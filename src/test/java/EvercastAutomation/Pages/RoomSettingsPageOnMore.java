package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomSettingsPageOnMore extends BasePage{


    @FindBy(xpath = "//span[contains(text(),'Room setup')]")
    public WebElement RoomSetUpOnRoomSettings;

    @FindBy(xpath = "//span[contains(text(),'Permissions')]")
    public WebElement PermissionsOnRoomSettings;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement SaveButtonOnRoomSettings;

    @FindBy(xpath = "(//h1[@class= 'under-construction-title'])[2]")
    public WebElement PermissionMessageOnRoomSettings;
}
