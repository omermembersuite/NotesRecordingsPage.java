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

    @FindBy(id = "fca60cdf-f709-4cf5-923a-8ee5ef9f9987")
    public WebElement usernameInput;

    @FindBy(id = "3d20b1e6-cdb1-44f9-8344-5533735084c7")
    public WebElement passwordInput;

    @FindBy(id = "3c8f8aec-1300-49f4-8a81-eb7849b6df12")
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
