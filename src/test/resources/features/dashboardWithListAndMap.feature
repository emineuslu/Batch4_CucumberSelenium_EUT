@c_listAndMap
Feature: Dashboard Menu Checks

  Background:
    Given The user is on the login page

  @c_List
  Scenario: Example-1 for Cucumber List
    #Given The user is on the login page
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
    #Given The user is on the login page
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

    # Class Task f1
    # go to web page
    # login with user credentials
    # navigates to my Profile menu
    # see following menu Overview,Edit Profile,Add Experience,Add Education,Change Password
  @c_task_f1
  Scenario: Example-3 for Task
    #Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    And The user navigates to "John" and "My Profile" sub menu
    Then The user should be able to see following subMenu
      | Overview         |
      | Edit Profile     |
      | Add Experience   |
      | Add Education    |
      | Change Passwords |

    # Class Task f2 HW
    # go to web page -> https://demoqa.com/
    # verify that user see following menu list elements, forms,...

    #day 5 Class Task f3
    # example 2 with scenario outline
    # use 3 different user credentials
  @c_dataTable_S_outline
  Scenario Outline: Example-2 for "<name>" with Scenario  Outline
    When The user logs in using following menu
      | username | <userEmail> |
      | password | <password>  |
      | name     | <name>      |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | <name>     |
    Examples:
      | userEmail        | password  | name         |
      | mike@gmail.com   | mike1234  | mike         |
      | john@gmail.com   | John1234. | John         |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy |



