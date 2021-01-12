package EvercastAutomation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecordSessionOnHiddenBarPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Record Session')]")
    public WebElement RecordSessionOnHiddenBar;

    @FindBy(xpath = "//span[contains(text(),'Start')]")
    public WebElement StartButtonOnRecordingPage;

    @FindBy(xpath = "//span[contains(text(),'Stop Record')]")
    public WebElement StopRecordingButtonOnHiddenBar;

}
