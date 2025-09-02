package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

public class NewAccountModal extends BasePage{

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public NewAccountModal createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Account Number").write(account.getNumber());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Site").write(account.getSite());
        new Input(driver, "Website").write(account.getWebsite());
        new Checkbox(driver, "VIP Client").select();
        new Checkbox(driver, "TeachMeSkills").select();
        new PickList(driver, "Type").select("Prospect");
        new PickList(driver, "Industry").select("Banking");
        new PickList(driver, "Ownership").select("Public");
        new TextArea(driver,"Billing Street").write(account.getStreet());
        new TextArea(driver,"Shipping Street").write(account.getStreet());
        return this;
    }

    public NewAccountModal open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    public NewAccountModal clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        return this;
    }

    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='SaveEdit']")));
        return this;
    }
}
