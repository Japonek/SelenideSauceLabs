package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutComplete {
    public final SelenideElement BackHomeButton = $("[data-test='back-to-products']");
    public final SelenideElement CompleteHeader = $("h2.complete-header");

    public String getCheckoutCompleteHeader(){
        return CompleteHeader.text();
    }

}
