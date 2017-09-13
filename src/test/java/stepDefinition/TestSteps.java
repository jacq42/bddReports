package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import de.jkrech.testing.FancyObject;

public class TestSteps {

    FancyObject fancyObject = new FancyObject();
    int data = 0;

    int actualValue = 3;

    @Given("a value of (\\d+)")
    public void a_value_of(int data) throws Throwable {
        this.data = data;
    }

    @When("the value is multiplied by (\\d+)")
    public void the_value_is_multiplied(int factor) throws Throwable {
        this.actualValue = fancyObject.render(this.data, factor);
    }

    @Then("result is (\\d+)")
    public void result_is_three(int expectedValue) throws Throwable {
        Assert.assertEquals(actualValue, expectedValue);
    }
}
