package Tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);

    @Test
    public void loginTestPositive (){

        // Given
        loginPage.open();

        // When
        loginPage.loginAs(User.standard_user.name(), User.secret_sauce.name());

        // Then
        assertTrue(inventoryPage.InventoryList.isDisplayed());
    }

    @Test
    public void loginTestLocked (){

        // Given
        loginPage.open();

        // When
        loginPage.loginAs(User.locked_out_user.name(), User.secret_sauce.name());

        // Then
        assertTrue(loginPage.errorMessage().contains("locked out"));
    }
}
