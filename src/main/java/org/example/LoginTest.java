package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static Favorites favorites;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        favorites = new Favorites(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfProperties.getProperty("loginpage")); }

    @Test
    public void loginTest() {

        loginPage.clickGoToLogin();

        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        favorites.entryCars();
        favorites.addFavorites();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();

    }
}