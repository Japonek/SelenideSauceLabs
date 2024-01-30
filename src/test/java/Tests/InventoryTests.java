package Tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTests {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);

    @Test
    public void shouldbeAbleToAddItemToCart (){

        // Given
        loginPage.open()
                 .loginAs(User.standard_user.name(), User.secret_sauce.name());

        // When
        inventoryPage.addItemToCart();

        // Then
        assertEquals("1", inventoryPage.getItemsCount());
    }

}
