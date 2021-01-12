package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.BrowserUtils;
import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawOnDrawToolPage extends BasePage{

    public DrawOnDrawToolPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@data-testid='drawtool-icon-pencil']")
    public WebElement DrawIconDrawTool;

    @FindBy(xpath = "//*[@class='MuiSlider-root MuiSlider-colorSecondary']")
    public WebElement DrawIconSizeCircle;

    @FindBy(xpath = "//button[@data-testid='side-drawer-pin-button']")
    public WebElement PinToolOnDrawTool;

    //
    @FindBy(xpath = "//button[@data-testid='side-drawer-pinned-button']")
    public WebElement UnPinnedToolOnDrawTool;

    @FindBy(xpath = "//button[@data-testid='side-drawer-close-button']")
    public WebElement closeButtonOnDrawTool;


    public void PinnedDrawTool(){
        BrowserUtils.clickWithJS(PinToolOnDrawTool);
    }

}
