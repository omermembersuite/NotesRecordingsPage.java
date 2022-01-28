package MemberSuite.Pages;

import MemberSuite.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Allow')]")
    public WebElement allowCookies;

    @FindBy(xpath = "(//img[@data-test='profile-icon'])[2]")
    public WebElement profileButton;

    @FindBy(xpath = "(//*[contains(text(),' Login')])[2]")
    public WebElement loginOnProfile;

    @FindBy(id = "fca60cdf-f709-4cf5-923a-8ee5ef9f9987")
    public WebElement usernameInput;

    @FindBy(id = "3d20b1e6-cdb1-44f9-8344-5533735084c7")
    public WebElement passwordInput;

    @FindBy(id = "3c8f8aec-1300-49f4-8a81-eb7849b6df12")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='profile-body ng-star-inserted']//div[@class='active ng-star-inserted']")
    public WebElement tuesdayCooper;

    @FindBy(xpath = "//*[contains(text(),'Home')]")
    public WebElement homeOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='Events']")
    public WebElement eventsOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='Community']")
    public WebElement communityOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='Shop']")
    public WebElement shopOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='Donations']")
    public WebElement donationsOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='Certifications']")
    public WebElement certificationsOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='831 new form']")
    public WebElement newFormOnMainPage;

    @FindBy(xpath = "//span[normalize-space()='new form link']")
    public WebElement newFormLinkOnMainPage;

    @FindBy(xpath = "//nav-cart[@class='cart-icon']//span[@class='icon-cart']")
    public WebElement cartOnMainPage;

    @FindBy(xpath = "//img[@class='logo-2']")
    public WebElement logoOnMainPage;

    @FindBy(xpath = "//h1[normalize-space()='Welcome!']")
    public WebElement welcomeOnMainPage;




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
