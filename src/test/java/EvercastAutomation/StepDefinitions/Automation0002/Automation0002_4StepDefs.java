package EvercastAutomation.StepDefinitions.Automation0002;

import EvercastAutomation.Pages.TextFSizePage;
import EvercastAutomation.Pages.TextPage;
import EvercastAutomation.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Automation0002_4StepDefs {

    TextPage textPage=new TextPage();
    TextFSizePage textFSizePage=new TextFSizePage();

    @When("user should able to click Text on draw tool")
    public void user_should_able_to_click_Text_on_draw_tool() {
        BrowserUtils.wait(2);
        textPage.clickTextOnDrawTool();
        BrowserUtils.wait(2);
    }

    @When("user should be able to click Font Size on Text")
    public void user_should_be_able_to_click_Font_Size_on_Text() {
        textFSizePage.FontSizesOnTextOnDrawTool.click();
        BrowserUtils.wait(2);



    }

    @Then("user should be able to click tenpx")
    public void user_should_be_able_to_click_tenpx() {
        BrowserUtils.clickWithJS(textFSizePage.px10FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click twelvepx")
    public void user_should_be_able_to_click_twelvepx() {
        BrowserUtils.clickWithJS(textFSizePage.px12FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click fourteenpx")
    public void user_should_be_able_to_click_fourteenpx() {
        BrowserUtils.clickWithJS(textFSizePage.px14FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click eighteenpx")
    public void user_should_be_able_to_click_eighteenpx() {
        BrowserUtils.clickWithJS(textFSizePage.px18FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click twentyfourpx")
    public void user_should_be_able_to_click_twentyfourpx() {
        BrowserUtils.clickWithJS(textFSizePage.px24FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click thirtytwopx")
    public void user_should_be_able_to_click_thirtytwopx() {
        BrowserUtils.clickWithJS(textFSizePage.px32FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click fourtyeightpx")
    public void user_should_be_able_to_click_fourtyeightpx() {
        BrowserUtils.clickWithJS(textFSizePage.px48FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click sixtyfourpx")
    public void user_should_be_able_to_click_sixtyfourpx() {
        BrowserUtils.clickWithJS(textFSizePage.px64FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click eightypx")
    public void user_should_be_able_to_click_eightypx() {
        BrowserUtils.clickWithJS(textFSizePage.px80FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

    @Then("user should be able to click twelvehundpx")
    public void user_should_be_able_to_click_twelvehundpx() {
        BrowserUtils.clickWithJS(textFSizePage.px120FontSizesOnTextOnDrawTool);
        BrowserUtils.wait(1);
    }

}
