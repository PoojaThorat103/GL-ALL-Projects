Feature: Validating Book API's

  Background: User is a valid user
    Given I am an authorized user for library

  Scenario: Verify if book is being successfully added using AddBookAPI
    Given User have book to add
    When User add this book to the library
    Then Book is sucessfully added in library
    And "Msg" in response body is "successfully added"

