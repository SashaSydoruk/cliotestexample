package clioonline.dk;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class FirstTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        String driverpath = "C:\\";
        System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://abo2.sasha.cliodev.dk/clioonline.abo2/authentication/smlogin?portal=QM");
    }
     @Test
     public void userLogin() {
            WebElement loginField = driver.findElement(By.cssSelector(".input[type=text]"));
            loginField.sendKeys("myclio");
            WebElement passwordField = driver.findElement(By.cssSelector(".input[type=password]"));
            passwordField.sendKeys("myclio");
            WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
            loginButton.click();
            WebElement selectinstitution = driver.findElement(By.className("main-page-box-header"));
            String getschool = selectinstitution.getText();
            Assert.assertEquals("Select institution", getschool);
     }

     @AfterClass
     public static void tearDown() {


     }
}
*/