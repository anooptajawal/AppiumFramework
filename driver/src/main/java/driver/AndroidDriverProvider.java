package driver;

import driver.platform.AlmosaferAndroidDriverProvider;
import driver.platform.TajawalAndroidDriverProvider;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

class AndroidDriverProvider implements DriverProvider {
    private final String url;
    private final AppType appType;

    public AndroidDriverProvider(String url, AppType appType) {
        this.url = url;

        this.appType = appType;
    }

    @Override
    public AppiumDriver<? extends WebElement> get() throws MalformedURLException {
        switch (appType) {
            case TAJAWAL:
                return new TajawalAndroidDriverProvider(url).get();
            case ALMOSAFER:
                return new AlmosaferAndroidDriverProvider(url).get();
            default:
                throw new IllegalArgumentException("Unknown app type");
        }
    }
}
