package AppiumDriver;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class test {
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	String nodejsPath = "/usr/local/bin/node";
	String appiumjsPath = "/Users/anoopambunhi/node_modules/appium/build/lib/main.js";

	@BeforeClass
	public void AppiumInitialization() {
		builder = new AppiumServiceBuilder();
		builder.usingDriverExecutable(new File(nodejsPath));
		builder.withAppiumJS(new File(appiumjsPath));
		builder.withIPAddress("127.0.0.1");
		builder.usingAnyFreePort();
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "info");

		service = AppiumDriverLocalService.buildService(builder);
	}

	@Test
	public void startAppiumService() {
		service.start();
		System.out.println("Appium Service Started");
		System.out.println("Test Execution Started");
	}

	@AfterClass
	public void stopAppiumService() {
		System.out.println("Stopping Appium Server.........");
		service.stop();
		System.out.println("Appium server Stopped");
	}
}
