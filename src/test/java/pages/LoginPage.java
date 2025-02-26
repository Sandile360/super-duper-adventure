package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By userEmail = By.name("email");
    By userPassword = By.name("password");
    By btn_login = By.name("login_user");

    By btn_logout = By.xpath("//a[@class='nav-link text-primary-emphasis']");

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

        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(btn_login).click();

        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
