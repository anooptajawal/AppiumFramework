package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

interface DriverProvider {
    AppiumDriver<? extends WebElement> get() throws MalformedURLException;
}
