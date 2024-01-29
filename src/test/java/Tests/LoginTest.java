package Tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);

    @Test
    public void loginTestPositive (){

        // Given
        loginPage.open();

        // When
        loginPage.loginAs(User.standard_user.name(), User.secret_sauce.name());

        // Then
        assertThat(inventoryPage.InvetoryList.isDisplayed());
    }
}
