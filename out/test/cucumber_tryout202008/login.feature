Feature: Test a successful login

  Scenario: Successful login

    Given A cloud login page
    When When I login with a valid user id and password
    Then the login will be successful