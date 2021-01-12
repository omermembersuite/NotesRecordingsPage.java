package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawAnnotationsPage extends BasePage{

    public DrawAnnotationsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@data-testid='mouse-over-slide']")
    public WebElement buttonHiddenBar;

    @FindBy(xpath = "//*[@data-testid='draw-toggle-button']")
    public WebElement drawToolOnHiddenBar;

    @FindBy(xpath = "//p[contains(text(),'Annotations')]")
    public WebElement drawToolAnnotation;
 //
    @FindBy(xpath = "//span[contains(text(),'Draw')]")
    public WebElement drawWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Shapes')]")
    public WebElement ShapesWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Text')]")
    public WebElement TextWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Color')]")
    public WebElement ColorWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Stroke')]")
    public WebElement StrokeWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Eraser')]")
    public WebElement EraserWordOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Clear All')]")
    public WebElement ClearAllWordDrawTool;





    public void checkAnnotations(){
        System.out.println(drawToolAnnotation.getText());
    }

    public void MenuListOnDrawTool(){

        System.out.println("Here is Menu Items on Draw Tool");
        System.out.println("1."+ drawWordOnDrawTool.getText());
        System.out.println("2."+ ShapesWordOnDrawTool.getText());
        System.out.println("3."+ TextWordOnDrawTool.getText());
        System.out.println("4."+ ColorWordOnDrawTool.getText());
        System.out.println("5."+ StrokeWordOnDrawTool.getText());
        System.out.println("6."+ EraserWordOnDrawTool.getText());
        System.out.println("7."+ ClearAllWordDrawTool.getText());

    }
}
