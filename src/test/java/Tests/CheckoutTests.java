package Tests;

import Pages.*;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutTests {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);
    private final CartPage cartPage = Selenide.page(CartPage.class);
    private final CheckOutOne checkOutOne = Selenide.page(CheckOutOne.class);
    private final CheckOutTwo checkOutTwo = Selenide.page(CheckOutTwo.class);
    private final CheckOutComplete checkOutComplete = Selenide.page(CheckOutComplete.class);

    @Test
    public void checkOutDescriptionTest (){

        // Given
        loginPage.open()
                 .loginAs(User.standard_user.name(), User.secret_sauce.name());

        // When
        inventoryPage.addItemToCart("backpack");
        inventoryPage.toCheckoutPage();

        // Then
        assertTrue(cartPage.GetDescription().contains("Backpack"));
    }

    @Test
    public void shouldBeAbleToBuyItem (){

        // Given
        loginPage.open()
                .loginAs(User.standard_user.name(), User.secret_sauce.name());
        inventoryPage.addItemToCart("backpack");
        inventoryPage.toCheckoutPage();
        cartPage.Checkout();
        // When
        checkOutOne.FillInformation(User.Joe.name(),User.Smith.name(),User.XXYYY.name());
        checkOutOne.ContinueCheckout();
        checkOutTwo.FinishCheckout();
        // Then
        assertTrue(checkOutComplete.BackHomeButton.isDisplayed());
        assertTrue(checkOutComplete.getCheckoutCompleteHeader().contains("Thank you for your order"));

    }

}
