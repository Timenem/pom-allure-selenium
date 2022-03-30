package SauceDemoTests.pagesTest;

import SauceDemoTests.BaseTest;
import SauseDemo.pages.InventoryListPage;
import SauseDemo.pages.LoginPage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class NavBarTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    InventoryListPage inventoryListPage = new InventoryListPage(driver);

    @Test
    public void openAndCloseNavBar() throws InterruptedException {
        /*open and close navbar*/
        loginPage.open();
        loginPage.fillFields();
        inventoryListPage.clickNavBar();
        TimeUnit.SECONDS.sleep(2);
        inventoryListPage.closeNavbar();
    }
}
