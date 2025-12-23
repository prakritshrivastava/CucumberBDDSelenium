Feature: Login Test

  @MyTest
  Scenario Outline: Login Page Title

    Given User is on login page
    When User gets title of the page
    Then Title should be "<title>"
    And user logs in successfully

    Examples:
      | title                                  |
      | Test Login \| Practice Test Automation |