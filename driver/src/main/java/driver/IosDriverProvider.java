package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

class IosDriverProvider implements DriverProvider {
    public IosDriverProvider(String url, AppType appType) {

    }

    @Override
    public AppiumDriver<? extends WebElement> get() {
        return null;
    }
}
