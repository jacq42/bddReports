package de.jkrech.testing;

public class AggregatedCustomerData {

    public Object call(Object cmd) {
        if(cmd instanceof CreateCustomerCommand) {
            return new AggregatedCustomerDataCreatedOrUpdatedEvent();
        }
        return null;
    }

}
