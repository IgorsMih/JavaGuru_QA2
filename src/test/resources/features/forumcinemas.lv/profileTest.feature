@ForumcinemasLv
@ForumLogin
Feature: Test forumcinemas.lv login page filtering and validates it

  Background: Open login page, enter login name and password and submit it
    Given Open Home Page
    And Open Login Page
    When Set Login Name to mihejevs.igors@gmail.com
    And Set Password to IM020660
    Then Press Submit Button

  Scenario: Open profile page, change all parameters, validate and close all pages
    Given Open Profile Page
    When Click Change My Data
    And Set FirstName to Igor and SecondName to Mihejev
    And Set Mobile to 29111111
    And Set City to Rezekne
    And Select Day of Birthday to 7
    And Select Month of Birthday to 7
    And Select Year of Birthday to 2000
    And Select Language to ENG
    And Select Gender
    Then Press Apstiprinat Button
    And Validate Names Igor and Mihejev
    And Validate Mobile 29111111
    And Validate City Rezekne
    And Validate Birthday 7
    And Validate BirthdayM 7
    And Validate BirthdayY 2000
    And Validate Language 1000
    And Validate Gender
    And Close All Pages
