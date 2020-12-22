package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextPage extends BasePage{

    public TextPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//*[@data-testid='drawtool-icon-text']")
    public WebElement TextOnDrawTool;

    @FindBy(xpath = "//li[@role='menuitem']/span[contains(text(), 'Font Family')]")
    public WebElement FontFamilyWordOnTextOnDrawTool;

    @FindBy(xpath = "//li[@role='menuitem']/span[contains(text(), 'Font Size')]")
    public WebElement FontSizeWordOnTextOnDrawTool;

    @FindBy(xpath = "//li[@role='menuitem']/span[contains(text(), 'Bold')]")
    public WebElement BoldWordOnTextOnDrawTool;

    @FindBy(xpath = "//li[@role='menuitem']/span[contains(text(), 'Italicize')]")
    public WebElement ItalicizeWordOnTextOnDrawTool;



    @FindBy(xpath = "//span[contains(text(),'Font Family')]")
    public WebElement FontFamilyOnTextOnDrawTool;


    @FindBy(xpath = "//*[@style='font-family: Arial;']")
    public WebElement ArialFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Arial Black')]")
    public WebElement ArialBlackFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Arial Narrow')]")
    public WebElement ArialNarrowFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Arial Rounded MT Bold')]")
    public WebElement ArialRoundedMTFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Baskerville')]")
    public WebElement BaskervilleFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Book Antiqua')]")
    public WebElement BookAntiquaFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Brush Script MT')]")
    public WebElement BrushScriptFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Calibri')]")
    public WebElement CalibriFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Calisto')]")
    public WebElement CalistoFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Candara')]")
    public WebElement CandaraFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Century')]")
    public WebElement CenturyFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Consolas')]")
    public WebElement ConsolasFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Copperplate')]")
    public WebElement CopperplateFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Courier New')]")
    public WebElement CurierFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Garamond')]")
    public WebElement GaramondFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Georgia')]")
    public WebElement GeorgiaFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Gill')]")
    public WebElement GillSansFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Goudy')]")
    public WebElement GoudyFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Helvetica')]")
    public WebElement HelveticaFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Impact')]")
    public WebElement ImpactFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Lucida Bright')]")
    public WebElement LucidaBrightFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Lucida Sans')]")
    public WebElement LucidaSansFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Palatino')]")
    public WebElement PalatinoFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Papyrus')]")
    public WebElement PapyrusFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Tahoma')]")
    public WebElement TahomaFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Times')]")
    public WebElement TimesNewRomanFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Trebuchet')]")
    public WebElement TrebuchetFontOnFontFamilyOnTextOnDrawTool;

    @FindBy(xpath = "//span[contains(text(),'Verdana')]")
    public WebElement VerdanaFontOnFontFamilyOnTextOnDrawTool;



}
