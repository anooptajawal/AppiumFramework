package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iospageobject {
    public iospageobject(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @FindBy(id = "action_sticky_textview")
    public WebElement continueBtn;
}
