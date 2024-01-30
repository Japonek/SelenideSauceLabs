package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {
    public final SelenideElement InventoryList = $("#inventory_container");
    public final SelenideElement ShoppingCart = $("#shopping_cart_container");
    public final SelenideElement InventoryListAddBackpackButton = $("[data-test='add-to-cart-sauce-labs-backpack']");

    public void addItemToCart() {
        InventoryListAddBackpackButton.click();
    }

    public String getItemsCount(){
        return ShoppingCart.text();
    }
}
