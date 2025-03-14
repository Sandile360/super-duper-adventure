Feature: Delete user from Task Management Dashboard
  Scenario Outline: verify successful delete operation from user and admin
    Given user on login page
    When user input valid <userEmail> <password> and confirm
    And user delete a task

    Examples:
      | userEmail | password  |
      | kimjade@mail.com  | 369121  |
