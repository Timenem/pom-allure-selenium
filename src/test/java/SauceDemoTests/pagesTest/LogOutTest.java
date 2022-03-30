package SauceDemoTests.pagesTest;

import SauceDemoTests.BaseTest;
import SauseDemo.BasePage;
import SauseDemo.pages.InventoryListPage;
import SauseDemo.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class LogOutTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    BasePage basePage = new BasePage(driver);
    InventoryListPage inventoryListPage = new InventoryListPage(driver);

    @Test
    public void logOut() throws InterruptedException {
        loginPage.open();
        loginPage.fillFields();
        inventoryListPage.clickNavBar();
        TimeUnit.SECONDS.sleep(2);
        inventoryListPage.clickLogOut();
        Assertions.assertEquals("https://www.saucedemo.com/",basePage.getUrl(), "Urls should be equal");
    }
}
