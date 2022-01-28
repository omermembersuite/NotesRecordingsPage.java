package MemberSuite.Pages;

import MemberSuite.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonationPage extends BasePage{

    @FindBy(xpath = "(//*[contains(text(),'Donations')])[1]")
    public WebElement donationsOnMain;

    @FindBy(xpath = "//div[contains(text(),'Make a Donation')]")
    public WebElement makeDonation;

    @FindBy(xpath = "//div[contains(text(),'View My Giving History')]")
    public WebElement viewGivingHistory;

    @FindBy(xpath = "//h2[normalize-space()='My Giving History']")
    public WebElement givingHistoryOnView;

    @FindBy(xpath = "//span[normalize-space()='Last Year']")
    public WebElement lastYearonView;

    @FindBy(xpath = "//span[normalize-space()='Total']")
    public WebElement totalOnView;

    @FindBy(xpath = "//span[normalize-space()='Gift #']")
    public WebElement giftOnView;

    @FindBy(xpath = "//span[normalize-space()='Gift Fund']")
    public WebElement giftFundOnView;

    @FindBy(xpath = "//span[normalize-space()='Gift Amount']")
    public WebElement giftAmountOnView;

    @FindBy(xpath = "//span[normalize-space()='Gift Date']")
    public WebElement giftDateOnView;

    @FindBy(xpath = "//span[normalize-space()='Type']")
    public WebElement typeOnView;

    @FindBy(xpath = "(//i[@class='icon-arrow-up arrow ng-star-inserted'])[1]")
    public WebElement giftArrowOnView;

    @FindBy(xpath = "(//i[@class='icon-arrow-up arrow ng-star-inserted'])[2]")
    public WebElement giftFundArrowOnView;

    @FindBy(xpath = "(//i[@class='icon-arrow-up arrow ng-star-inserted'])[3]")
    public WebElement giftAmountArrowOnView;

    @FindBy(xpath = "(//i[@class='icon-arrow-up arrow ng-star-inserted'])[4]")
    public WebElement giftDateArrowOnView;

    @FindBy(xpath = "(//i[@class='icon-arrow-up arrow ng-star-inserted'])[5]")
    public WebElement giftTypeArrowOnView;

    @FindBy(xpath ="//h2[normalize-space()='My Open Pledges and Recurring Gifts']")
    public WebElement openPledgesOnView;

    @FindBy(xpath = "//label[@for='mat-radio-8-input']//div[@class='mat-radio-outer-circle']")
    public WebElement funnyMoneyFundExample;

    @FindBy(xpath = "//div[contains(text(),'$5.00')]")
    public WebElement fivedollarDonation;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement streetOne;

    @FindBy(xpath = "//input[@id='mat-input-2']")
    public WebElement streetTwo;

    @FindBy(xpath = "//input[@id='mat-input-3']")
    public WebElement city;

    @FindBy(xpath = "//mat-select[@id='mat-select-0']")
    public WebElement state;

    @FindBy(xpath = "//span[normalize-space()='Georgia']")
    public WebElement georgiaState;

    @FindBy(xpath = "//input[@id='mat-input-4']")
    public WebElement zipCode;

    @FindBy(xpath = "//mat-select[@id='mat-select-5']//div[@class='mat-select-value']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='mat-input-5']")
    public WebElement creditCard;

    @FindBy(xpath = "//input[@id='mat-input-6']")
    public WebElement nameOnCreditCard;

    @FindBy(xpath = "//mat-select[@id='mat-select-2']")
    public WebElement expMonth;

    @FindBy(xpath = "//span[normalize-space()='05']")
    public WebElement mayExpireMonth;

    @FindBy(xpath = "//mat-select[@id='mat-select-3']")
    public WebElement expYear;

    @FindBy(xpath = "//span[normalize-space()='26']")
    public WebElement tweentysixExpireYear;

    @FindBy(xpath = "//input[@id='mat-input-7']")
    public WebElement securityCode;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement continueOnDonation;

    @FindBy(xpath = "//button[normalize-space()='Process Donation']")
    public WebElement processDonation;

    @FindBy(xpath = "//*[normalize-space()='Donation Successful']")
    public WebElement donationSuccessful;

    @FindBy(xpath = "//div[@class='message ng-star-inserted']")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//button[normalize-space()='Close']")
    public WebElement closeButtonOnDonation;

    public DonationPage() {
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
