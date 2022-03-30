package SauceDemoTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    protected static WebDriver driver;
    public static void setConfig(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeAll
    public static void init(){
        setConfig();
    }


    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}

