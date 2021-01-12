package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorOnDrawPage extends BasePage{

    public ColorOnDrawPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Color')]")
    public WebElement ColorWordOnDrawTool;

    @FindBy(xpath = "(//*[@class='flexbox-fix'])[2]")
    public WebElement ColorArrowOnColorPage;

}
