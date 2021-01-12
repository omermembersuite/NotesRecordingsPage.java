package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.TextPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Automation0002_3StepDefs {

    TextPage textPage= new TextPage();

    @When("user should be able to click Text on draw tool")
    public void user_should_be_able_to_click_Text_on_draw_tool() {
        BrowserUtils.wait(1);
        textPage.clickTextOnDrawTool();
        BrowserUtils.wait(1);
    }

    @Then("user should be able to see Font Family, Font Size, Bold, Italicize")
    public void user_should_be_able_to_see_Font_Family_Font_Size_Bold_Italicize() {
        textPage.InsideTextonText();
    }

    @When("user should be able to click Font Family on Text")
    public void user_should_be_able_to_click_Font_Family_on_Text() {
        BrowserUtils.wait(1);
        textPage.FontFamilyOnTextOnDrawTool.click();
        BrowserUtils.wait(1);
        textPage.FontFamilySelectorOnFontFamily.click();
        BrowserUtils.wait(1);

    }

    @Then("user should be able to see List of Font Family")
    public void user_should_be_able_to_see_List_of_Font_Family() {
        System.out.println("List is Coming");

    }

    @Then("user should be able to click Arial")
    public void user_should_be_able_to_click_Arial() {
        // textPage.ArialFontOnFontFamilyOnTextOnDrawTool.click();
        // BrowserUtils.clickWithJS(textPage.ArialFontOnFontFamilyOnTextOnDrawTool);
     // BrowserUtils.wait(1);

    }

    @Then("user should be able to click Arial Black")
    public void user_should_be_able_to_click_Arial_Black() {
//        BrowserUtils.clickWithJS(textPage.ArialBlackFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Arial Narrow")
    public void user_should_be_able_to_click_Arial_Narrow() {
//        BrowserUtils.clickWithJS(textPage.ArialNarrowFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Arial Rounded MT Bold")
    public void user_should_be_able_to_click_Arial_Rounded_MT_Bold() {
//        BrowserUtils.clickWithJS(textPage.ArialRoundedMTFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Baskerville")
    public void user_should_be_able_to_click_Baskerville() {
//        BrowserUtils.clickWithJS(textPage.BaskervilleFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Book Antiqua")
    public void user_should_be_able_to_click_Book_Antiqua() {
//        BrowserUtils.clickWithJS(textPage.BookAntiquaFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Brush Script MT")
    public void user_should_be_able_to_click_Brush_Script_MT() {
//        BrowserUtils.clickWithJS(textPage.BrushScriptFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Calibri")
    public void user_should_be_able_to_click_Calibri() {
       BrowserUtils.clickWithJS(textPage.CalibriFontOnFontFamilyOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Calisto MT")
    public void user_should_be_able_to_click_Calisto_MT() {
//        BrowserUtils.clickWithJS(textPage.CalistoFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Candara")
    public void user_should_be_able_to_click_Candara() {
//        BrowserUtils.clickWithJS(textPage.CandaraFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Century Gothic")
    public void user_should_be_able_to_click_Century_Gothic() {
//        BrowserUtils.clickWithJS(textPage.CenturyFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Consolas")
    public void user_should_be_able_to_click_Consolas() {
//        BrowserUtils.clickWithJS(textPage.ConsolasFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Copperplate")
    public void user_should_be_able_to_click_Copperplate() {
//        BrowserUtils.clickWithJS(textPage.CopperplateFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Courier New")
    public void user_should_be_able_to_click_Courier_New() {
//        BrowserUtils.clickWithJS(textPage.CurierFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Garamond")
    public void user_should_be_able_to_click_Garamond() {
//        BrowserUtils.clickWithJS(textPage.GaramondFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Georgia")
    public void user_should_be_able_to_click_Georgia() {
//        BrowserUtils.clickWithJS(textPage.GeorgiaFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Gill Sans")
    public void user_should_be_able_to_click_Gill_Sans() {
//        BrowserUtils.clickWithJS(textPage.GillSansFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Goudy Old Style")
    public void user_should_be_able_to_click_Goudy_Old_Style() {
//        BrowserUtils.clickWithJS(textPage.GoudyFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Helvetica")
    public void user_should_be_able_to_click_Helvetica() {
//        BrowserUtils.clickWithJS(textPage.HelveticaFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Impact")
    public void user_should_be_able_to_click_Impact() {
//        BrowserUtils.clickWithJS(textPage.ImpactFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Lucida Bright")
    public void user_should_be_able_to_click_Lucida_Bright() {
//        BrowserUtils.clickWithJS(textPage.LucidaBrightFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Lucida Sans Typewriter")
    public void user_should_be_able_to_click_Lucida_Sans_Typewriter() {
//        BrowserUtils.clickWithJS(textPage.LucidaSansFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Palatino")
    public void user_should_be_able_to_click_Palatino() {
//        BrowserUtils.clickWithJS(textPage.PalatinoFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Papyrus")
    public void user_should_be_able_to_click_Papyrus() {
//        BrowserUtils.clickWithJS(textPage.PapyrusFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Tahoma")
    public void user_should_be_able_to_click_Tahoma() {
//        BrowserUtils.clickWithJS(textPage.TahomaFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Times New Roman")
    public void user_should_be_able_to_click_Times_New_Roman() {
//        BrowserUtils.clickWithJS(textPage.TimesNewRomanFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Trebuchet MS")
    public void user_should_be_able_to_click_Trebuchet_MS() {
//        BrowserUtils.clickWithJS(textPage.TrebuchetFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }

    @Then("user should be able to click Verdana")
    public void user_should_be_able_to_click_Verdana() {
//        BrowserUtils.clickWithJS(textPage.VerdanaFontOnFontFamilyOnTextOnDrawTool);
//        BrowserUtils.wait(1);
    }
}
