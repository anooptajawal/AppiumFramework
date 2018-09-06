package testngpkg;

import AppiumDriver.DesiredCapabilityAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TajawalTest extends DesiredCapabilityAndroid {
    private String buttonText = "Continue";

    @Test
    public void selectPOS() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement element = (MobileElement) driver.findElementById("action_sticky_textview");
        String text = element.getText();

        // Assert actual text on button is equal to expected
        Assert.assertEquals(text, buttonText);

        // Click the continue button
        driver.findElementById("action_sticky_textview").click();

        //Open the side menu
        driver.findElementById("burger").click();

    }

}
