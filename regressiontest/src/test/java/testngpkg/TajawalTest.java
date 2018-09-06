package testngpkg;

import AppiumDriver.DesiredCapabilityAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TajawalTest extends DesiredCapabilityAndroid {

    private AndroidDriver driver;
    private WebDriverWait wait;


    @BeforeTest
    private void setUp() throws MalformedURLException {
        driver = capabilities();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    private void selectPOS() {
        String buttonText = "Continue";
        String text = driver.findElementById("action_sticky_textview").getText();

        // Assert actual text on button is equal to expected
        Assert.assertEquals(text, buttonText);

        // Click the continue button
        driver.findElementById("action_sticky_textview").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navigationButtonIcon")));

        //Open the side menu
        driver.findElementById("navigationButtonIcon").click();
    }

    @AfterTest
    private void closeApp() {
        driver.closeApp();
    }

}
