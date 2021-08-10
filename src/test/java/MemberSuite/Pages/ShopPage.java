package MemberSuite.Pages;

import MemberSuite.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends BasePage{


    @FindBy(xpath = "//div[contains(text(),'Shop')]")
    public WebElement shopOnMain;

    @FindBy(xpath = "//div[contains(text(),'Subscriptions')]")
    public WebElement subscriptionOnShop;

    @FindBy(xpath = "//div[contains(text(),'Subscribe to a Publication')]")
    public WebElement subsToPublication;

    @FindBy(id = "subscription-sub-span5-TheFamilyHandymanLBA")
    public WebElement familyHandymanIncrease;

    @FindBy(id = "subscription-sub-button1-TheFamilyHandymanLBA")
    public WebElement addToCartFamilyHandyman;

    @FindBy(id = "subscription-094280ec-bd9d-4fbf-8b83-b8cd209e497d")
    public WebElement continueToCartFamilyHandyman;

    @FindBy(xpath = "//button[@data-test='checkout-button']")
    public WebElement checkoutFamilyHandyman;

    @FindBy(xpath = "//label[@for='mat-radio-7-input']//div[@class='mat-radio-inner-circle']")
    public WebElement electronicCheckPayment;

    @FindBy(xpath = "//label[@for='mat-radio-5-input']//div[@class='mat-radio-inner-circle']")
    public WebElement existingAddress;

    @FindBy(xpath = "//button[normalize-space()='Checkout']")
    public WebElement lastCheckOut;

    @FindBy(xpath = "//button[normalize-space()='Okay']")
    public WebElement okayConfirmation;

    @FindBy(xpath = "//button[normalize-space()='Close']")
    public WebElement closeButton;

    public ShopPage() {
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
