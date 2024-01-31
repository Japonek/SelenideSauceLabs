package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutOne {
    public final SelenideElement ContinueCheckoutButton = $("[data-test='continue']");
    public final SelenideElement CheckoutOneFirstName = $("[data-test='firstName']");
    public final SelenideElement CheckoutOneLastName = $("[data-test='lastName']");
    public final SelenideElement CheckoutOneZIP = $("[data-test='postalCode']");


    public void ContinueCheckout(){
        ContinueCheckoutButton.click();
    }

    public void FillInformation(String firstName, String lastName, String zip){
        CheckoutOneFirstName.setValue(firstName);
        CheckoutOneLastName.setValue(lastName);
        CheckoutOneZIP.setValue(zip);
    }

}
