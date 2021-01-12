package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserStreamOnMorePage extends BasePage{


    @FindBy(xpath = "//span[contains(text(),'Browser stream')]")
    public WebElement BrowserStreamOnMore;

    @FindBy(xpath = "//span[contains(text(),'Start')]")
    public WebElement StartButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "//span[contains(text(),'Stop')]")
    public WebElement StopButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[1]")
    public WebElement VideoSourceButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@role='option'])[1]")
    public WebElement FakeVideoSourceButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[2]")
    public WebElement AudioSourceButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@role='option'])[1]")
    public WebElement FakeAudioSourceButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@class='MuiFormControl-root MuiFormControl-fullWidth'])[3]")
    public WebElement ResolutionButtonOnBrowserStreamOnMore;

    @FindBy(xpath = "(//*[@role='option'])[3]")
    public WebElement FourEightyResButtonOnBrowserStreamOnMore;



}
