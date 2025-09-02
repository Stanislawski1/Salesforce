package tests;

import dto.Account;
import dto.AccountFactory;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test(invocationCount = 3)
    public void checkCreateAccount() throws InterruptedException {
        Account account = AccountFactory.getAccount("Prospect", "Banking", "Public");
        loginStep.auth("tborodich@tms.sandbox", "Password003!");
        accountStep.createAccount(account);
    }
}
