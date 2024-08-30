Feature: Menu Functionality

  # Scenario to verify menu button visibility and functionality
  Scenario: Menu Button Visibility and Functionality
    Given the user is on the Best Buy homepage or relevant page with a menu
    When the user locates and clicks the menu button
    Then the menu button should be visible and easily identifiable
    And the menu should expand or slide out to display the menu items

  # Scenario to verify menu items display and navigation
  Scenario: Menu Items Display and Navigation
    Given the user is on the Best Buy homepage or relevant page with a menu
    When the user clicks the menu button
    And the user observes the menu items displayed
    And the user clicks on a category link within the menu
    Then the menu should display a list of product categories and/or other relevant items
    And the user should be navigated to the page displaying products or information related to the selected category

  # Scenario Outline to verify menu responsiveness and accessibility
  Scenario Outline: Menu Responsiveness and Accessibility
    Given the user is on the Best Buy homepage or relevant page with a menu
    When the user opens the Best Buy website on a "<device>" device
    And the user clicks the menu button
    And the user uses a screen reader to navigate to the menu button
    Then the menu should display correctly and be functional on the "<device>" device
    And the menu and its items should be accessible and correctly announced by the screen reader

    Examples:
      | device  |
      | desktop |
      | tablet  |
      | mobile  |

  # Scenario to verify menu search functionality
  Scenario: Menu Search Functionality
    Given the user is on the Best Buy homepage or relevant page with a menu
    When the user clicks the menu button
    And the user uses the search bar or search functionality within the menu
    Then search results relevant to the search query should be displayed

  # Scenario to verify menu close functionality and load time
  Scenario: Menu Close Functionality and Load Time
    Given the user is on the Best Buy homepage or relevant page with an expanded menu
    When the user clicks outside the menu or clicks the close button (if present)
    And the user measures the time taken for the menu to close or display
    Then the menu should close and return to its collapsed state
    And the menu should load and display within an acceptable time frame (e.g., less than 2 seconds)

  # Scenario to verify menu navigation path and logged-in vs. guest users
  Scenario: Menu Navigation Path and Logged-In vs. Guest Users
    Given the user is on the Best Buy homepage or relevant page with a menu
    When the user logs in to a user account
    And the user clicks the menu button and observes the menu items
    And the user logs out
    And the user clicks the menu button again
    And the user selects a category and subcategory
    Then the URL should match the expected URL for the selected category
