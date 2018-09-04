package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class DriverFactory {
    private final String url;
    private final PlatformType platformType;
    private final AppType appType;

    public DriverFactory(String url, PlatformType platformType, AppType appType) {
        this.url = url;
        this.platformType = platformType;
        this.appType = appType;
    }

    public AppiumDriver<? extends WebElement> get() throws MalformedURLException {
        switch (platformType) {

            case ANDROID:
                return new AndroidDriverProvider(url, appType).get();
            case IOS:
                return new IosDriverProvider(url, appType).get();
            default:
                throw new IllegalArgumentException("Unknown platform type");
        }
    }
}
