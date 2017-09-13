package de.jkrech.testing

import spock.lang.Specification

class AggregatedCustomerDataSpec extends Specification {

    def "An aggregated customer that is new and updated, sends an event"() {
        given: "an aggregated customer data"
        AggregatedCustomerData aggregatedCustomerData = new AggregatedCustomerData()

        and: "a CreateRDCustomer command"
        CreateCustomerCommand command = new CreateCustomerCommand()

        when: "the command is send to the aggregate"
        def event = aggregatedCustomerData.call(command)

        then: "there is an AggregatedCustomerDataCreatedOrUpdatedEvent"
        assert event instanceof AggregatedCustomerDataCreatedOrUpdatedEvent
    }
}
