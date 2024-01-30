package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public final SelenideElement CheckoutButton = $("[data-test='checkout']");
    public final SelenideElement ItemDescription = $("div.cart_list div.inventory_item_name");

    public void Checkout(){
        CheckoutButton.click();
    }

    public String GetDescription(){
        return ItemDescription.text();
    }

}
