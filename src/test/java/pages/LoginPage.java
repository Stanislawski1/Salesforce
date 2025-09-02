package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By USERNAME_INPUT = By.xpath("//*[@id='username']");
    private final By PASSWORD = By.xpath("//*[@id='password']");
    private final By LOGIN_BUTTON = By.xpath("//*[@id='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    public HomePage login(String user, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_INPUT));
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD));
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return  new HomePage(driver);
    }
}
