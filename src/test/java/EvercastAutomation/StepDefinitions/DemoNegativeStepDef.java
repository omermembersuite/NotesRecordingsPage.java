package EvercastAutomation.StepDefinitions;

import EvercastAutomation.Pages.ExistingRoomPage;
import EvercastAutomation.Pages.GoLivePage;
import EvercastAutomation.Pages.LoginPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoNegativeStepDef {

    LoginPage loginPage= new LoginPage();
    GoLivePage goLivePage= new GoLivePage();
    ExistingRoomPage existingRoomPage=new ExistingRoomPage();



    @When("user should be able to click enable Fullscreen on hiddenbar")
    public void user_should_be_able_to_click_enable_Fullscreen_on_hiddenbar() {
        BrowserUtils.wait(3);
        goLivePage.DemoFullScreenEnable();
    }


    @Then("user should be able to click disable Fullscreen on hiddenbar")
    public void user_should_be_able_to_click_disable_Fullscreen_on_hiddenbar() {
     //  BrowserUtils.waitForVisibility(goLivePage.DemoFullScreen,3);
        Assert.assertNull(goLivePage.DemoFullScreen);
      //  BrowserUtils.wait(2);
//        goLivePage.DemoFullScreenEnable();
//        BrowserUtils.wait(2);
        goLivePage.DemoFullScreenDisable();
        BrowserUtils.wait(2);
    }

}
