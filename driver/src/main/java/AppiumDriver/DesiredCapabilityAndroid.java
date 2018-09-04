package AppiumDriver;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class DesiredCapabilityAndroid {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //Platform Name
        capabilities.setCapability("platformName", "Android");

        //Automation Name -> Appium OR UIAutomator2
        capabilities.setCapability("automationName", "Appium");

        // For running the tests on a real device. To run on emulator hardcode the emulator name in value
        capabilities.setCapability("deviceName", "Android device");

        // Reset on each test run
        capabilities.setCapability("noReset", false);

        //Accept any OS level Alerts on execution
        capabilities.setCapability("autoAcceptAlerts", true);

        //App Package Name
        capabilities.setCapability("appPackage", "com.travel.almosafer.debug");

        //App Activity Name
        capabilities.setCapability("appActivity", "com.tajawal.splash.SplashActivity");

        //Initialize the driver and start session with the capabilities mentioned
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
    }
}
