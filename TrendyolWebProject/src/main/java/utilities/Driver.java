package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
            driver=new ChromeDriver();
        }

        return driver;

    }
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
