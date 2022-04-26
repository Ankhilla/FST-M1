
@TagsExample
Feature: Basic syntax of a Feature file
  I want to use this template for my feature file

  @First
  Scenario:This is to testing 1
    Given User opens a file
    When User performs an action
    Then Do Action for First scenario

  @Second
  Scenario:This is to testing 2
    Given User opens a file
    When User performs an action
    Then Do Action for Second scenario

  @Thirt
  Scenario:This is to testing 3
    Given User opens a file
    When User performs an action
    Then Do Action for  Third scenario


  Scenario:This is to testing 4
    Given User opens a file
    When User performs an action
    Then Do Action for the First scenario

  Scenario: Opening a webpage using Selenium
    Given User is on Google Home Page
    When User types in Cheese and hits ENTER
    Then Show how many search results were shown
    And Close the browser










