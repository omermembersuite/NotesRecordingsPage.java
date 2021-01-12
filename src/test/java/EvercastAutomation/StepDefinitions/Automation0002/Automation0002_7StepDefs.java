package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.StrokeOnDrawPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0002_7StepDefs {
        StrokeOnDrawPage strokeOnDrawPage=new StrokeOnDrawPage();

    @When("user should able to click Stroke on draw tool")
    public void user_should_able_to_click_Stroke_on_draw_tool() {
  //      Assert.assertTrue(strokeOnDrawPage.StrokeWordOnDrawTool.isDisplayed());
        BrowserUtils.wait(1);
        strokeOnDrawPage.StrokeWordOnDrawTool.click();
        BrowserUtils.wait(2);


    }

    @Then("user should be able to click Stroke Arrow")
    public void user_should_be_able_to_click_Stroke_Arrow() {
        Assert.assertTrue(strokeOnDrawPage.StrokeArrowOnStrokePage.isDisplayed());
    }

}
