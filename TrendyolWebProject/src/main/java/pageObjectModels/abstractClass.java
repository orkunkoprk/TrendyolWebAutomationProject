package pageObjectModels;

import cucumber.api.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.Set;

public class abstractClass {
    private WebDriver driver = Driver.getDriver();

    public void clickFunction(WebElement clickElement) throws InterruptedException {
        Thread.sleep(1111);
        clickElement.click();
        Thread.sleep(1111);
    }
    public void sendKeysFunction(WebElement sendKeysElement, String value1) throws InterruptedException {
        Thread.sleep(500);
        sendKeysElement.sendKeys(value1);
    }
    public void selectFunction(WebElement dropdown, String value2) throws InterruptedException {
        Thread.sleep(500);
        Select select = new Select(dropdown);
        select.selectByVisibleText(value2);
    }
    public void assetionFunction(WebElement actual, String value) throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertEquals(actual.getText(),value);
        Thread.sleep(4000);
    }
    public void actionFuntion(WebElement actualElement) throws InterruptedException {
        Thread.sleep(500);
        Actions actions = new Actions(driver);
        actions.moveToElement(actualElement).build().perform();

    }
    public void newWindow() throws InterruptedException {
        Thread.sleep(1000);
        String firstWin=driver.getWindowHandle();
        String firstWinURL=driver.getCurrentUrl();
        System.out.println("Başlangıç pencerem: "+firstWinURL);
        Thread.sleep(1000);
        Set<String> windowAllWindows=driver.getWindowHandles();
        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }
        Thread.sleep(500);
        System.out.println("Şu anki pencerem: "+driver.getCurrentUrl());
    }

}


