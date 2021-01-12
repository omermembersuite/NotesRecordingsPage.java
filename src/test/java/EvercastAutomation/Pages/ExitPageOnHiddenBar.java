package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExitPageOnHiddenBar extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Exit')]")
    public WebElement ExitButtonOnHiddenBar;

    @FindBy(xpath = "//span[contains(text(),'YES')]")
    public WebElement YesButtonOnExitOnHiddenBar;
}
