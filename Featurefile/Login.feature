Feature: Calculating EMI values for Loan Amounts

  Scenario: Succesfully Getting Amount values from carloan page
    Given the user navigates to carloan page
    When user enter the values in all search boxes
    And user clicks month icon
    Then user should print Loan EMI

  Scenario: Successfully  Getting an EMI Table From HomeLoanPage
    Given the user navigates to Homeloan page
    When user enter the values in search boxes
    Then user should print a table

  Scenario: successfully validating the checkboxes and sliders
    Given the user navigates to the EMILoan page
    When user checks the checkboxes and sliders are working
    Then user checks the year and month checkboxes are working
    Then user checks the year and month sliders are working
