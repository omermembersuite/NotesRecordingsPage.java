package EvercastAutomation.Pages;

import EvercastAutomation.Utilities.ConfigurationReader;
import EvercastAutomation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@name='email']")
    public WebElement evercastemail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement evercastpassword;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement SignInButton;

    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     *
     * @param emailforevercast
      @param passwordforevercast
     */
    public void loginAct(String emailforevercast, String passwordforevercast) {
        evercastemail.sendKeys(emailforevercast);
        evercastpassword.sendKeys(passwordforevercast);

    }

    public void usernameInput(){
        evercastemail.sendKeys(ConfigurationReader.getProperty("evercastusername"));
    }

    public void passwordInput(){
        evercastpassword.sendKeys(ConfigurationReader.getProperty("evercastpassword"));
    }

    public void login() {
        SignInButton.click();
    }

    public void login(String role) {
        String emailforevercast = ConfigurationReader.getProperty("evercastusername").toString();
        String evercastpassword = ConfigurationReader.getProperty("evercastpassword").toString();

        switch (role) {
            case "QAE":
                emailforevercast = ConfigurationReader.getProperty("evercastusername");
                break;
            case "SQAE":
                emailforevercast = ConfigurationReader.getProperty("evercastqaseniors");
                break;
            case "QAManager":
                emailforevercast = ConfigurationReader.getProperty("evercastmanagers");
                break;
            default:
                throw new RuntimeException("Invalid role!");
        }
        login();
    }

}
