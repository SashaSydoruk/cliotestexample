package clioonline.dk.tests;

import clioonline.dk.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver driver;
    public static LoginPage loginPage;

    @BeforeClass
    public static void setup() {
        String driverpath = "C:\\";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://abo2.sasha.cliodev.dk/clioonline.abo2/authentication/smlogin?portal=QM");
    }

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        loginPage.inputLogin("myclio");
        loginPage.inputPassword("myclio");
        loginPage.clickLoginButton();
        loginPage.checkLogInBySchool();
    }


}
