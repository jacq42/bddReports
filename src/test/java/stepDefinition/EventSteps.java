package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Gegebensei;
import cucumber.api.java.de.Und;
import cucumber.api.java.de.Wenn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import de.jkrech.testing.AggregatedCustomerData;
import de.jkrech.testing.AggregatedCustomerDataCreatedOrUpdatedEvent;
import de.jkrech.testing.CreateCustomerCommand;

public class EventSteps {

    private AggregatedCustomerData aggregatedCustomerData;

    private Object command;
    private Object actualEvent;

    @Given("^an aggregated customer data$")
    @Gegebensei("^ein existierender aggregierter kunde$")
    public void an_aggregated_customer_data() throws Exception {
        this.aggregatedCustomerData = new AggregatedCustomerData();
    }

    @And("^a CreateCustomer command$")
    @Und("^ein CreateCustomer Command$")
    public void a_CreateCustomer_command() throws Exception {
        this.command = new CreateCustomerCommand();
    }

    @When("^the command is send to the aggregate$")
    @Wenn("^der Command zum Aggregat gesendet wird$")
    public void the_command_is_send_to_the_aggregate() throws Exception {
        actualEvent = aggregatedCustomerData.call(command);
    }

    @Then("^there is an AggregatedCustomerDataCreatedOrUpdatedEvent$")
    @Dann("^wird ein AggregatedCustomerDataCreatedOrUpdatedEvent gesendet")
    public void there_is_an_AggregatedCustomerDataCreatedOrUpdatedEvent() throws Exception {
        Assert.assertTrue(actualEvent instanceof AggregatedCustomerDataCreatedOrUpdatedEvent);
    }

}
