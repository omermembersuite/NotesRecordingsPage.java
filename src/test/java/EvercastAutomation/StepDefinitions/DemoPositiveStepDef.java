package EvercastAutomation.StepDefinitions;

import EvercastAutomation.Pages.DrawAnnotationsPage;
import EvercastAutomation.Pages.ExistingRoomPage;
import EvercastAutomation.Pages.GoLivePage;
import EvercastAutomation.Pages.LoginPage;
import EvercastAutomation.Utilities.BrowserUtils;
import EvercastAutomation.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoPositiveStepDef {
    LoginPage loginPage= new LoginPage();
    GoLivePage goLivePage= new GoLivePage();
    ExistingRoomPage existingRoomPage=new ExistingRoomPage();
    DrawAnnotationsPage drawAnnotationsPage=new DrawAnnotationsPage();

    @When("user should be able to click go Live!")
    public void user_should_be_able_to_click_go_Live() {
        BrowserUtils.wait(2);
        goLivePage.goLive();
        BrowserUtils.wait(4);
    }
    @Then("user should be able to click botton hidden bar")
    public void user_should_be_able_to_click_botton_hidden_bar() {

        drawAnnotationsPage.buttonHiddenBar.click();
    }

    @When("user should be able to login click draw tool")
    public void user_should_be_able_to_login_click_draw_tool() {
        BrowserUtils.wait(2);
        drawAnnotationsPage.drawToolOnHiddenBar.click();
    }

    @Then("user should be able to see Draw, Shapes, Text, Color, Stroke, Eraser, Clear All")
    public void user_should_be_able_to_see_Draw_Shapes_Text_Color_Stroke_Eraser_Clear_All() {
        drawAnnotationsPage.MenuListOnDrawTool();

    }




}
