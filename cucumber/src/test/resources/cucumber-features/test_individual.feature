Feature: Facturation for individual
    An individual must pay their taxes

    Scenario: An individual buys satin
        Given satin costs 4 euros per meter
        When an individual buys 10 meters
        Then the cost should be 48.00 euros