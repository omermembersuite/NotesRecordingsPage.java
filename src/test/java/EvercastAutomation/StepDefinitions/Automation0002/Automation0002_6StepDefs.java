package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.ColorOnDrawPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0002_6StepDefs {

    ColorOnDrawPage colorOnDrawPage=new ColorOnDrawPage();

    @When("user should able to click Color on draw tool")
    public void user_should_able_to_click_Color_on_draw_tool() {

        BrowserUtils.wait(1);
        colorOnDrawPage.ColorWordOnDrawTool.click();
        Assert.assertTrue(colorOnDrawPage.ColorWordOnDrawTool.isDisplayed());
        BrowserUtils.wait(2);
    }

    @Then("user should be able to click Color Arrow")
    public void user_should_be_able_to_click_Color_Arrow() {
        BrowserUtils.wait(2);
        Assert.assertTrue(colorOnDrawPage.ColorArrowOnColorPage.isDisplayed());
//        colorOnDrawPage.ColorArrowOnColorPage.click();
    }
}
