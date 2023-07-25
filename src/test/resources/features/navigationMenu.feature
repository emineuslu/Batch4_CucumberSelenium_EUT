@regression
@navigation
Feature: Navigation Menu Tests

#First Scenario:
#Login as Mike
#Verify that 'Dashboard' text is visible, assert it
#Go to developers menu
#Verify that 'Developers' text is visible

#Second Scenario:
#Login as Sebastian
#Verify that 'Dashboard' text is visible, assert it
#Go to Forms/Input menu
#Verify that 'General Form Elements - Input' text is visible

#Third Scenario:
#Login as John
#Verify that 'Dashboard' text is visible, assert it
#Go to My Profile menu
#Verify that 'User Profile' text is visible

  @mike
  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When Login as Mike
    Then Validate that Dashboard text is visible
    When Go to developers menu
    Then Validate that Developers text is visible

  @sebastian @smoke
  Scenario: Navigation to Forms/Input menu
    Given The user is on the login page
    When Login as Sebastian
    Then Validate that Dashboard text is visible
    When Go to forms-input menu
    Then Validate that General Form Elements - Input text is visible

  @john
  Scenario: Navigation to My Profile Menu
    Given The user is on the login page
    When Login as John
    Then Validate that Dashboard text is visible
    When Go to my profile menu
    Then Verify that User Profile text is visible






