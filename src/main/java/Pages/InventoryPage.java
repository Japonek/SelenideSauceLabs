package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class InventoryPage {
    public final SelenideElement InventoryList = $("#inventory_container");
    public final SelenideElement ShoppingCart = $("#shopping_cart_container");

    public void addItemToCart(String item) {
        Selenide.$(format("[data-test='add-to-cart-sauce-labs-%s']",item))
        .click();
    }

    public String getItemsCount(){
        return ShoppingCart.text();
    }

    public void toCheckoutPage(){
        ShoppingCart.click();
    }
}
