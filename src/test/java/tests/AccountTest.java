package tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import wrappers.Input;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() throws InterruptedException {
        loginPage.open();
        Thread.sleep(2000);
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        newAccountPage.open();
        new Input(driver, "Account Name").write("Stanis");
        newAccountModal.createAccount("QA31", "12", "+91911","12", "youtube.com",
                "Google.com", "QA31", "32");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        newAccountPage.isPageOpened();
    }
}
