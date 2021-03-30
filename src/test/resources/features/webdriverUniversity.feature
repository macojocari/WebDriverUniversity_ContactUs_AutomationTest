Feature: Contact us form


  Scenario: Check the message when form is completed with valid data
    Given webdriveruniversity website is displayed
    When I click on CONTACT US
    And I switch to another tab
    When I filled out all fields
      | John | Smith | Jsmith@mail.com | test test test |
    And I clicked on submit button
    Then success message is displayed