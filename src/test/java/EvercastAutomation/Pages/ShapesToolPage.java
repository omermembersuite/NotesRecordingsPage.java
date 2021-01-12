package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShapesToolPage extends BasePage {

    public ShapesToolPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//div[@data-testid='menu-item-with-submenu-icon']//*)[3]")
    public WebElement ShapesOnDrawTool;

    @FindBy(xpath = "//*[@class='MuiBox-root jss119 size-slider-filled-circle']")
    public WebElement ShapesSliderCircleOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Line')]")
    public WebElement LineWordOnShapesOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Arrow')]")
    public WebElement ArrowWordOnShapesOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Dash')]")
    public WebElement DashWordOnShapesOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Circle')]")
    public WebElement CircleWordOnShapesOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Square')]")
    public WebElement SquareWordOnShapesOnDrawTool;


    @FindBy(xpath = "//*[@data-testid='drawtool-icon-line']")
    public WebElement LineOnShapesOnDrawTool;

    @FindBy(xpath = "//*[@data-testid='drawtool-icon-arrow']")
    public WebElement ArrowOnShapesOnDrawTool;

    @FindBy(xpath = "//*[@data-testid='drawtool-icon-dash']")
    public WebElement DashOnShapesOnDrawTool;

    @FindBy(xpath = "//*[@data-testid='drawtool-icon-ellipse']")
    public WebElement CircleOnShapesOnDrawTool;

    @FindBy(xpath = "//*[@data-testid='drawtool-icon-rectangle']")
    public WebElement SquareOnShapesOnDrawTool;


    public void clickShapesOnDrawTool(){
        ShapesOnDrawTool.click();
    }

    public void ShapesMenuListOnShapesOnDrawTool(){

        System.out.println("Here is Shapes Items on Shapes on Draw Tool");
        System.out.println("1."+ LineWordOnShapesOnDrawTool.getText());
        System.out.println("2."+ ArrowWordOnShapesOnDrawTool.getText());
        System.out.println("3."+ DashWordOnShapesOnDrawTool.getText());
        System.out.println("4."+ CircleWordOnShapesOnDrawTool.getText());
        System.out.println("5."+ SquareWordOnShapesOnDrawTool.getText());


    }

}
