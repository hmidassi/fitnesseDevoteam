Feature: Facturation for professional
    A professional doesn't pay taxes

    Scenario: A professional buys satin
        Given satin costs 4 euros per meter
        When a professional buys 10 meters
        Then the cost should be 40.00 euros

    Scenario: A professional buys more than 50 meters of satin
        Given satin costs 4 euros per meter
        When a professional buys 100 meters
        Then the cost should be 380.00 euros

    Scenario: A professional buys more than 250 meters of satin
        Given satin costs 4 euros per meter
        When a professional buys 300 meters
        Then the cost should be 1020.00 euros