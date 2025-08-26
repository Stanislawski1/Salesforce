package pages;

import org.openqa.selenium.WebDriver;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.PickList;
import wrappers.TextArea;

public class NewAccountModal extends BasePage{

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String name, String phone, String fax,String site, String website,
                              String number, String Street, String street) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Account Number").write(number);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Site").write(site);
        new Input(driver, "Website").write(website);
        new Checkbox(driver, "VIP Client").select();
        new Checkbox(driver, "VIP Client").select();
        new Checkbox(driver, "TeachMeSkills").select();
        new PickList(driver, "Type").select("Prospect");
        new PickList(driver, "Industry").select("Banking");
        new PickList(driver, "Ownership").select("Public");
        new TextArea(driver,"Billing Street").write(Street);
        new TextArea(driver,"Shipping Street").write(street);
    }
}
