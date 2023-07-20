Feature: Dashboard Menu Checks

  @c_List
  Scenario: Example-1 for Cucumber List
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | John       |

  @c_Map
  Scenario: Example-2 for Cucumber Map
    Given The user is on the login page
    When The user logs in using following menu
      | username | john@gmail.com |
      | password | John1234.      |
      | name     | John           |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | John       |