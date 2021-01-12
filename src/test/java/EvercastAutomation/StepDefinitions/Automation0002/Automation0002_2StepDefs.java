package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.ShapesToolPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0002_2StepDefs {

    ShapesToolPage shapesToolPage=new ShapesToolPage();

    @When("user should able to click Shapes on draw tool")
    public void user_should_able_to_click_Shapes_on_draw_tool() {
        BrowserUtils.wait(1);
        shapesToolPage.clickShapesOnDrawTool();
    }

    @Then("user should be able to see Shape size circle")
    public void user_should_be_able_to_see_Shape_size_circle() {
        Assert.assertNotNull(shapesToolPage.ShapesSliderCircleOnDrawTool);
    }

    @Then("user should be able to see Line, Arrow, Dash, Circle, Square")
    public void user_should_be_able_to_see_Line_Arrow_Dash_Circle_Square() {
        Assert.assertNotNull(shapesToolPage.LineWordOnShapesOnDrawTool);
        Assert.assertNotNull(shapesToolPage.ArrowWordOnShapesOnDrawTool);
        Assert.assertNotNull(shapesToolPage.DashWordOnShapesOnDrawTool);
        Assert.assertNotNull(shapesToolPage.CircleWordOnShapesOnDrawTool);
        Assert.assertNotNull(shapesToolPage.SquareWordOnShapesOnDrawTool);
        BrowserUtils.waitForVisibility(shapesToolPage.ArrowWordOnShapesOnDrawTool,2);
        shapesToolPage.ShapesMenuListOnShapesOnDrawTool();
    }

    @Then("user should be able to click Line on shapes")
    public void user_should_be_able_to_click_Line_on_shapes() {
        BrowserUtils.waitForClickablility(shapesToolPage.LineOnShapesOnDrawTool,1);
        Assert.assertNotNull(shapesToolPage.LineOnShapesOnDrawTool);
        shapesToolPage.LineOnShapesOnDrawTool.click();
    }

    @Then("user should be able to click Arrow on shapes")
    public void user_should_be_able_to_click_Arrow_on_shapes() {
        BrowserUtils.waitForClickablility(shapesToolPage.ArrowOnShapesOnDrawTool,1);
        Assert.assertNotNull(shapesToolPage.ArrowOnShapesOnDrawTool);
        shapesToolPage.ArrowOnShapesOnDrawTool.click();
    }

    @Then("user should be able to click Dash on shapes")
    public void user_should_be_able_to_click_Dash_on_shapes() {
        BrowserUtils.waitForClickablility(shapesToolPage.DashOnShapesOnDrawTool,1);
        Assert.assertNotNull(shapesToolPage.DashOnShapesOnDrawTool);
        shapesToolPage.DashOnShapesOnDrawTool.click();
    }

    @Then("user should be able to click Circle on shapes")
    public void user_should_be_able_to_click_Circle_on_shapes() {
        BrowserUtils.waitForClickablility(shapesToolPage.CircleOnShapesOnDrawTool,1);
        Assert.assertNotNull(shapesToolPage.CircleOnShapesOnDrawTool);
        shapesToolPage.CircleOnShapesOnDrawTool.click();
    }

    @Then("user should be able to click Square on shapes")
    public void user_should_be_able_to_click_Square_on_shapes() {
        BrowserUtils.waitForClickablility(shapesToolPage.SquareOnShapesOnDrawTool,1);
        Assert.assertNotNull(shapesToolPage.SquareOnShapesOnDrawTool);
        shapesToolPage.SquareOnShapesOnDrawTool.click();

    }
}
