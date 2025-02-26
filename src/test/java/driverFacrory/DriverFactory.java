package driverFacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    protected static WebDriver driver;

    public static WebDriver getDriver(String browser) {

        if(driver == null){
            switch (browser.toLowerCase()){
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "gecko":
                    driver = new FirefoxDriver();
                    break;

                default:
                    throw new RuntimeException("driver not found.");
            }
        }

        return driver;
    }
}
