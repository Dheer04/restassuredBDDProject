Feature: Verify created new users
  Scenario: Create new user with valid details
    Given : I hit the url for creating a user
    When : I pass the name and job
    Then : verify the response code 200
