package driver.platform;

import driver.DriverProvider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AlmosaferIosDriverProvider implements DriverProvider {
    @Override
    public AppiumDriver<? extends WebElement> get() {
        return null;
    }
}
