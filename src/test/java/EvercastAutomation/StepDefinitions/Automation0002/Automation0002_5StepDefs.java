package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.TextPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Automation0002_5StepDefs {

    TextPage textPage= new TextPage();
    @Then("user should be able to click Bold on Text")
    public void user_should_be_able_to_click_Bold_on_Text() {
        BrowserUtils.wait(2);
        textPage.BoldWordOnTextOnDrawTool.click();
        BrowserUtils.wait(2);
        Assert.assertTrue(textPage.BoldWordOnTextOnDrawTool.isDisplayed());
        Assert.assertTrue(textPage.BoldWordOnTextOnDrawTool.isEnabled());
    }

    @Then("user should be able to click Italicize")
    public void user_should_be_able_to_click_Italicize() {
        Assert.assertTrue(textPage.ItalicizeWordOnTextOnDrawTool.isDisplayed());
        textPage.ItalicizeWordOnTextOnDrawTool.click();
        BrowserUtils.wait(2);
    }
}
