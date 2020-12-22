package EvercastAutomation.StepDefinitions;

import EvercastAutomation.Pages.ExistingRoomPage;
import EvercastAutomation.Pages.GoLivePage;
import EvercastAutomation.Pages.LoginPage;
import EvercastAutomation.Utilities.BrowserUtils;
import EvercastAutomation.Utilities.ConfigurationReader;
import EvercastAutomation.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class GoLiveStepDefinitions {

    LoginPage loginPage= new LoginPage();
    GoLivePage goLivePage= new GoLivePage();
    ExistingRoomPage existingRoomPage=new ExistingRoomPage();

    @When("User is on the Login page")
    public void user_is_on_the_Login_page() {
        System.out.println("Login Page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(3);



    }
    @Then("User enters username")
    public void user_enters_username() {
        loginPage.usernameInput();
    }

    @Then("User enters password")
    public void user_enters_password() {
        loginPage.passwordInput();
    }

    @Then("User click on Log in button")
    public void user_click_on_Log_in_button() {
        loginPage.login();

    }

    @When("user should be able to login into existing room")
    public void user_should_be_able_to_login_into_existing_room() {
        BrowserUtils.waitForPageToLoad(5);
        existingRoomPage.EnterExistingRoom1();
    }

    @Then("user should be able to see Welcome to the Lobby on the page")
    public void user_should_be_able_to_see_Welcome_to_the_Lobby_on_the_page() {
        BrowserUtils.wait(2);
        String Welcome= "Welcome to the Lobby";
        Assert.assertEquals(Welcome, goLivePage.WelcomeLobbyonGoLive.getText());
        System.out.println("Verifying Page subtitle: "+ Welcome);

    }


    @Then("user should be able to click disable microphone")
    public void user_should_be_able_to_click_disable_microphone() {
        BrowserUtils.waitForClickablility(goLivePage.microphoneBeforeGoLive,2);
        Assert.assertNotNull(goLivePage.microphoneBeforeGoLive);
        goLivePage.disableMicBeforeGo();

    }

    @Then("user should be able to click disable camera")
    public void user_should_be_able_to_click_disable_camera() {
        BrowserUtils.waitForVisibility(goLivePage.camBeforeGoLive,3);
        Assert.assertNotNull(goLivePage.camBeforeGoLive);
        goLivePage.disableCameraBeforeGo();

    }

    @When("user should be able to Open device selection before go live")
    public void user_should_be_able_to_Open_device_selection_before_go_live() {
        Assert.assertNotNull(goLivePage.OpenDeviceSelectionBeforeGo);
        goLivePage.DeviceSelectionBeforeGo();

    }

    @Then("user should be able to see Device Selection before go live")
    public void user_should_be_able_to_see_Device_Selection_before_go_live() {
        System.out.println("Device Selection");


    }

    @Then("user should be able to choose low webcam quality before go live")
    public void user_should_be_able_to_choose_low_webcam_quality_before_go_live() {
        BrowserUtils.wait(1);
        goLivePage.LowWebcamBeforeGo();

    }

    @Then("user should be able to choose medium webcam quality before go live")
    public void user_should_be_able_to_choose_medium_webcam_quality_before_go_live() {
        BrowserUtils.wait(1);
        goLivePage.MedWebcamBeforeGo();

    }

    @Then("user should be able to choose high webcam quality before go live")
    public void user_should_be_able_to_choose_high_webcam_quality_before_go_live() {
        BrowserUtils.wait(1);
        goLivePage.HighWebcamBeforeGo();

    }

    @Then("user should be able to close camera on device selection before go live")
    public void user_should_be_able_to_close_camera_on_device_selection_before_go_live() {
        System.out.println("Pass");

    }

    @Then("user should be able to close microphone on device selection before go live")
    public void user_should_be_able_to_close_microphone_on_device_selection_before_go_live() {
        System.out.println("Pass");


    }

    @Then("user should be able to close Audio output on device selection before go live")
    public void user_should_be_able_to_close_Audio_output_on_device_selection_before_go_live() {
        System.out.println("Pass");

    }

    @Then("user should be able to save device selection before go live")
    public void user_should_be_able_to_save_Device_Selection_before_go_live() {
        BrowserUtils.wait(2);
        goLivePage.SaveButtonOnOpDevBefGo();

    }




}
