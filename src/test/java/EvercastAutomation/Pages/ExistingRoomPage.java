package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.BrowserUtils;
import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingRoomPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement ExistingRoom1;

    /*

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement MuiButton;


    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement ExistingRoom1;

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement ExistingRoom1;

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement ExistingRoom1;

    @FindBy(xpath = "//div[contains(text(),'11-23-14')]")
    public WebElement ExistingRoom1;


     */

    public ExistingRoomPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }



    public void EnterExistingRoom1(){
//      waitUntilLoaderMaskDisappear();
       BrowserUtils.waitForClickablility(ExistingRoom1,15);
        ExistingRoom1.click();
    }
}
