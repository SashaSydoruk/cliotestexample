package clioonline.dk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }




    public void inputLogin(String login) {
         driver.findElement(By.cssSelector(".input[type=text]")).sendKeys(login);
    }

    public void inputPassword(String password) {
        driver.findElement(By.cssSelector(".input[type=password]")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    public void checkLogInBySchool() {
        WebElement selectinstitution = driver.findElement(By.className("main-page-box-header"));
        String getshcool = selectinstitution.getText();
        Assert.assertEquals("Select institution", getshcool);

    }


}
