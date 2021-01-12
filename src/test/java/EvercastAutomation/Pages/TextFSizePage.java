package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextFSizePage {
    public TextFSizePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//*[@class='MuiList-root MuiList-padding'])[3]")
    public WebElement FontSizesSelectorOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Font Size')]")
    public WebElement FontSizesOnTextOnDrawTool;

    //   //span[contains(text(),'10px')]
    @FindBy(xpath = "(//li[@role='menuitem'])[12]")
    public WebElement px10FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'12px')]")
    public WebElement px12FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'14px')]")
    public WebElement px14FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'18px')]")
    public WebElement px18FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'24px')]")
    public WebElement px24FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'32px')]")
    public WebElement px32FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'48px')]")
    public WebElement px48FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'64px')]")
    public WebElement px64FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'80px')]")
    public WebElement px80FontSizesOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'120px')]")
    public WebElement px120FontSizesOnTextOnDrawTool;




}
