package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    WebDriver driver;
    By btn_logout = By.xpath("//a[contains(text(),'Log Out')]");
    By btn_delete = By.xpath("//a[@class='btn btn-danger']");

//    By btn_delete = By.xpath("//td[6]/a[@class='btn btn-danger']");;

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
