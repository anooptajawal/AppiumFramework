package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class androidpageobject {
    public androidpageobject(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "action_sticky_textview")
    public WebElement continueBtn;

    @AndroidFindBy(id = "navigationButtonIcon")
    public WebElement burgerMenu;

}
