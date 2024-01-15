package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class InventoryPage {
    public final SelenideElement InvetoryList = Selenide.$x("//*[@class='inventory_container']");
}
