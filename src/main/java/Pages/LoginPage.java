package Pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Configuration;


public class LoginPage {

    private final SelenideElement usernameInput = $("[data-test='username']");
    private final SelenideElement passwordInput = $("[data-test='password']");
    private final SelenideElement loginButton = $("[data-test='login-button']");
    private final SelenideElement errorMessageContainer = $("div[class*=error-message-container]");

    public LoginPage open() {
        Selenide.open(Configuration.baseUrl);
        return this;
    }

    public void loginAs(String username  , String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
    }

    public String errorMessage(){
        return errorMessageContainer.text();
    }
}