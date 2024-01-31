package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutTwo {
    public final SelenideElement FinishButton = $("[data-test='finish']");
    public final SelenideElement ItemDescription = $("div.cart_list div.inventory_item_name");

    public void FinishCheckout(){
        FinishButton.click();
    }

}
