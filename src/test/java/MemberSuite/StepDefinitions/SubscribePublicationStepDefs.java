package MemberSuite.StepDefinitions;

import MemberSuite.Pages.ShopPage;
import MemberSuite.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class SubscribePublicationStepDefs {

    ShopPage shopPage=new ShopPage();


    @Then("user should be able to click shop")
    public void user_should_be_able_to_click_shop() {
        BrowserUtils.clickWithJS(shopPage.shopOnMain);
        BrowserUtils.wait(2);
    }

    @Then("user should be able to subscribe to a publication")
    public void user_should_be_able_to_subscribe_to_a_publication() {
        BrowserUtils.clickWithJS(shopPage.subscriptionOnShop);
        BrowserUtils.wait(2);
    }

    @Then("user should be able to one of publications")
    public void user_should_be_able_to_one_of_publications() {
        BrowserUtils.clickWithJS(shopPage.subsToPublication);
     //   shopPage.subsToPublication.click();
        BrowserUtils.wait(2);
    }

    @Then("user should be able to pay existing electronic payment and checkout")
    public void user_should_be_able_to_pay_existing_electronic_payment_and_checkout() {
        shopPage.familyHandymanIncrease.click();
        BrowserUtils.wait(2);
        shopPage.addToCartFamilyHandyman.click();
        BrowserUtils.wait(2);
        shopPage.continueToCartFamilyHandyman.click();
        BrowserUtils.wait(2);
        shopPage.checkoutFamilyHandyman.click();
        BrowserUtils.wait(2);
        BrowserUtils.clickWithJS(shopPage.electronicCheckPayment);
      //  shopPage.electronicCheckPayment.click();
        BrowserUtils.wait(1);
        BrowserUtils.clickWithJS(shopPage.existingAddress);
     //   shopPage.existingAddress.click();
        BrowserUtils.wait(1);
        shopPage.lastCheckOut.click();
        BrowserUtils.wait(3);
        shopPage.okayConfirmation.click();
        BrowserUtils.wait(25);
        shopPage.closeButton.click();
    }




}
