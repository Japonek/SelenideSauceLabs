package Tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {
    private final LoginPage loginPage = Selenide.page(LoginPage.class);
    private final InventoryPage inventoryPage = Selenide.page(InventoryPage.class);

    @Test
    public void LoginTestPositive (){
        //Given
        loginPage.open();
        //When
        loginPage.loginAs("standard_user","secret_sauce");
        //Then
        assertThat(inventoryPage.InvetoryList.isDisplayed());
    }
}
