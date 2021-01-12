package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.*;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Automation0002_1StepDefs {

    LoginPage loginPage= new LoginPage();
    GoLivePage goLivePage= new GoLivePage();
    ExistingRoomPage existingRoomPage=new ExistingRoomPage();
    DrawAnnotationsPage drawAnnotationsPage=new DrawAnnotationsPage();
    ButtonHiddenBarPage buttonHiddenBarPage=new ButtonHiddenBarPage();
    DrawOnDrawToolPage drawOnDrawToolPage=new DrawOnDrawToolPage();



    @Then("user should be able to see Annotations")
    public void user_should_be_able_to_see_Annotations() {
        Assert.assertNotNull(drawAnnotationsPage.drawToolAnnotation);


    }

    @When("user should able to click Draw on draw tool")
    public void user_should_able_to_click_Draw_on_draw_tool() {

        BrowserUtils.wait(2);
        drawOnDrawToolPage.DrawIconDrawTool.click();

    }

    @Then("user should be able to see draw size circle")
    public void user_should_be_able_to_see_draw_size_circle() {
        Assert.assertNotNull(drawOnDrawToolPage.DrawIconSizeCircle);
    }

    @Then("user should be able to click pin on tools")
    public void user_should_be_able_to_click_pin_on_tools() {
        Assert.assertNotNull(drawOnDrawToolPage.PinToolOnDrawTool);
        drawOnDrawToolPage.PinnedDrawTool();

    }

    @Then("user should be able to click side drawer pinned tool on tools")
    public void user_should_be_able_to_click_side_drawer_pinned_tool_on_tools() {
        BrowserUtils.wait(1);
        Assert.assertNotNull(drawOnDrawToolPage.UnPinnedToolOnDrawTool);
        drawOnDrawToolPage.UnPinnedToolOnDrawTool.click();
    }

    @Then("user should be able to click close on tools tab")
    public void user_should_be_able_to_click_close_on_tools_tab() {
        BrowserUtils.waitForVisibility(drawOnDrawToolPage.closeButtonOnDrawTool,2);
        Assert.assertNotNull(drawOnDrawToolPage.closeButtonOnDrawTool);
        drawOnDrawToolPage.closeButtonOnDrawTool.click();
    }


}
