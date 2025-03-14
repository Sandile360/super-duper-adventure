package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By btn_logout = By.xpath("//a[@class='nav-link text-primary-emphasis']");
    By btn_delete = By.xpath("/html/body/section[1]/table/tbody/tr/td[7]/a");

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
