package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By btn_logout = By.xpath("//a[@class='nav-link text-primary-emphasis']");
    By btn_delete = By.xpath("/html[1]/body[1]/section[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void performLogout(){
        driver.findElement(btn_logout).click();

    }

    public void setBtn_delete(){
        driver.findElement(btn_delete).click();
    }
}
