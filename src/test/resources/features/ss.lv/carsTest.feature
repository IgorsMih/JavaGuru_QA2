@SsLv
@Cars
Feature: Test ss.lv cars page filtering and validates it

  Scenario: Open cars page and change price, year, engine and color
    Given Open HomePage
    And Open Cars category
    And Validate that CarsPage is open
    When Set min price to 6000 and max price to 10000
    And Set year from  2001
    And Change max engine to 3.0
    And Change color to Balta
    Then Press submit button
