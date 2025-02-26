package driverFacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory {
    WebDriver driver;

    public WebDriver getDriver(String browser) {

        if(driver == null){
            switch (browser.toLowerCase()){
                case "chrome":
                    driver = new ChromeDriver();
                case "firefox":
                    driver = new FirefoxDriver();
                default:
                    throw new RuntimeException("driver not found.");
            }
        }

        return driver;
    }
}
