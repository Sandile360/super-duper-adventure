package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    static String actual;

    By userEmail = By.name("email");
    By userPassword = By.name("password");
    By btn_login = By.name("login_user");

    By btn_logout = By.xpath("//a[@class='nav-link text-primary-emphasis']");

//    warning locators
    By error_email = By.xpath("//div[contains(text(),'Email is required.')]");
    By error_password = By.xpath("//div[contains(text(),'Password is required.')]");
    By password_long = By.xpath("//div[contains(text(),'Passwords must be exactly 6 characters long.')]");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void positiveLogin(String email, String password){
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(btn_login).click();
    }

    public void performLogout(){
        driver.findElement(btn_logout).click();

    }

    public void negativeLogin(String email, String password){
        driver.findElement(btn_login).click();
        actual = driver.findElement(error_email).getText();
        Assert.assertEquals(actual,"Email is required.");
        actual = driver.findElement(error_password).getText();
        Assert.assertEquals(actual,"Password is required.");

        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(btn_login).click();
        actual = driver.findElement(error_password).getText();
        Assert.assertEquals(actual,"Password is required.");

        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(btn_login).click();
        actual = driver.findElement(password_long).getText();
        Assert.assertEquals(actual,"Passwords must be exactly 6 characters long.");

    }
}
