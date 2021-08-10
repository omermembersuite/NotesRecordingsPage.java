package MemberSuite.Pages;

import MemberSuite.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Allow')]")
    public WebElement allowCookies;

    @FindBy(xpath = "//profile-chip[@ng-reflect-is-from-mobile='false']//img[@class='profile-image']")
    public WebElement profileButton;

    @FindBy(xpath = "(//*[contains(text(),' Login')])[2]")
    public WebElement loginOnProfile;

    @FindBy(xpath = "(//input[@id='signInFormUsername'])[2]")
    public WebElement usernameInput;

    @FindBy(xpath = "(//input[@id='signInFormPassword'])[2]")
    public WebElement passwordInput;

    @FindBy(xpath = "(//input[@name='signInSubmitButton'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='active ng-star-inserted']//img[@class='switch-profile-user-image activeProfile']")
    public WebElement tuesdayCooper;




    public MainPage() {
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
     * @param username
      @param password
     */




}
