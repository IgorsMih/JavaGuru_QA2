@SsLv
@Cars
Feature: Test ss.lv cars page filtering and validates it

  Scenario: Open cars page and change price, year, engine and color
    Given Open HomePage
    And Open Cars category
    And Validate that CarsPage is open
    When Set Cars min price to 6000 and max price 10000
    And Set year from 2001
    And Change min engine to 2.0
    And Change max engine to 3.0
    And Change color to Balta with value 6318
    Then Press submit button
