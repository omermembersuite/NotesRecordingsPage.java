package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StrokeOnDrawPage extends BasePage{

    public StrokeOnDrawPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@role='menuitem'])[5]")
    public WebElement StrokeWordOnDrawTool;

    @FindBy(xpath = "(//*[@class='flexbox-fix'])[2]")
    public WebElement StrokeArrowOnStrokePage;
}
