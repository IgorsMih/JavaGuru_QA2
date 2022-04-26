@ForumcinemasLv
@ForumLogin
Feature: Test forumcinemas.lv login page filtering and validates it

  Background: Open login page, enter login name and password and submit it
    Given Open Home Page
    And Open Login Page
    When Enter Login Name
    And Enter Password
    Then Press Submit Button

  Scenario: Open profile page, change all parameters, validate and close all pages
    Given Open Profile Page
    When Click Change My Data
    And Enter FirstName and SecondName
    And Enter Mobile Number
    And Enter City Name
    And Select Day of Birthday
    And Select Month of Birthday
    And Select Year of Birthday
    And Select Language
    And Select Gender
    Then Press Apstiprinat Button
    And Validate Name
    And Validate Mobile
    And Validate City
    And Validate Day of Birthday
    And Validate Month of Birthday
    And Validate Year of Birthday
    And Validate language
    And Validate Gender
    And Close All Pages
