package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageFactory extends BasePage {

    @FindBy(id = "username")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "Login")
    WebElement loginButton;


    public LoginPageFactory(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage open() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return null;
    }

    public BasePage isPageOpened() {
        return null;
    }

    public void login(String user, String password) {
        usernameField.sendKeys(user);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public LoginPageFactory negativeLogin(String user, String password) {
        usernameField.sendKeys(user);
        passwordField.sendKeys(password);
        loginButton.click();
        return this;
    }
}