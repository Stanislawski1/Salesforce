package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

   public HomePage(WebDriver driver) {
       super(driver);
    }

   public LoginPage open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home");
        return new  LoginPage(driver);
   }
  public HomePage isPageOpened() {
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".uiImage")));
       return this;
   }
}