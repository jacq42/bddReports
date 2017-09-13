Feature: AggregatedCustomerDataCreatedOrUpdatedEvent
 
@AggregatedCustomerDataCreatedOrUpdatedEvent
Scenario: An aggregated customer that is new and updated, sends an event
    Given an aggregated customer data
    And a CreateCustomer command
    When the command is send to the aggregate
    Then there is an AggregatedCustomerDataCreatedOrUpdatedEvent