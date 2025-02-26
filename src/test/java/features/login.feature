Feature: perform positive and negative login
  Scenario Outline: mock login credentials
    Given user on login page
    When user input valid <userEmail> <password> and confirm
    And admin user input valid <adminEmail> <adminPassword> and confirm
    Then perform login with invalid <invalidEmail> <invalidPassword>

    Examples:
      | userEmail | password | adminEmail | adminPassword | invalidEmail | invalidPassword|
      | kimjade@mail.com | 369121 | brucelee@mail.com | 159753 |  steve@mail.com  |        132546846        |
