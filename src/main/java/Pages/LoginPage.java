package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {

    private final SelenideElement usernameInput = Selenide.$x("//*[@id='user-name']");
    private final SelenideElement passwordInput = Selenide.$x("//*[@id='password']");
    private final SelenideElement loginButton = Selenide.$x("//*[@id='login-button']");

    public LoginPage open() {
        Selenide.open("https://www.saucedemo.com/");
        return this;
    }

    public void loginAs(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
    }
}