# language: de
Funktionalität: AggregatedCustomerDataCreatedOrUpdatedEvent DE

@AggregatedCustomerDataCreatedOrUpdatedEventDE
Szenario: Beim Erstellen eines Kunden wird ein Event gesendet
    Gegeben sei ein existierender aggregierter kunde
    Und ein CreateCustomer Command
    Wenn der Command zum Aggregat gesendet wird 
    Dann wird ein AggregatedCustomerDataCreatedOrUpdatedEvent gesendet
    