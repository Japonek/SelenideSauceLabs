package Tests;

import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutTests {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);
    private final CartPage cartPage = Selenide.page(CartPage.class);

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

}
