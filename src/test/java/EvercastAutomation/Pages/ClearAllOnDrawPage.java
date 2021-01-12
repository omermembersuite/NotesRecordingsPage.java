package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearAllOnDrawPage extends BasePage{

    public ClearAllOnDrawPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@role='menuitem'])[7]")
    public WebElement ClearAllOnDrawTool;

    @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2'])")
    public WebElement VerifyClearAllMessage;

    @FindBy(xpath = "(//*[@class='MuiButton-label'])[4]")
    public WebElement ApproveClearAllMessage;

}
