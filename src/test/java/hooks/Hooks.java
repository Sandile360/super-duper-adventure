package hooks;

import driverFacrory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    public Hooks(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver setUp(){
        driver = DriverFactory.getDriver("gecko");
        driver.navigate().to("http://kali/apps/login.php");
        return driver;
    }

    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
