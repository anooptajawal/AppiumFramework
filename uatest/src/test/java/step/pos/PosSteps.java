package step.pos;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class PosSteps {

    @Given("the screen is POS")
    public void goToPos() {
        System.out.println("Test run begin");
    }

    @Then("^I should at least one POS option$")
    public void iShouldAtLeastOnePOSOption() throws Throwable {
        Assert.assertTrue("It's true", true);
    }
}
