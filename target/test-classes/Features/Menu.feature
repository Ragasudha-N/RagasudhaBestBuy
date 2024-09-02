Feature: Menu and Search Functionality

  Scenario: Menu Button Access
    Given the user is on the Best Buy homepage
    When the user locates the menu button
    And the user clicks on the menu button
    Then the menu button should be visible
    And clicking the menu button should display the menu list

  Scenario: Category List Visibility
    Given the user is on the Best Buy homepage
    When the user clicks on the menu button
    Then the list of categories should be visible
    And all categories should be displayed

  Scenario: Category Selection
    Given the user is on the Best Buy homepage
    When the user opens the menu
    And the user clicks on a category (e.g., "Laptops")
    Then items related to the selected category should be displayed

  Scenario: Search Button Access
    Given the user is on the Best Buy homepage
    When the user locates the search button
    And the user clicks on the search button
    Then the search input field should be activated for user input

  Scenario Outline: Search Functionality
    Given the user is on the Best Buy homepage with the search bar visible
    When the user clicks on the search button
    And the user enters a search term "<search_term>"
    And the user presses Enter or clicks the search icon
    Then items related to the search term "<search_term>" should be displayed

    Examples:
      | search_term |
      | iPhone       |
      | Laptop       |
      | Camera       |

  Scenario: Search Result Accuracy
    Given the user has performed a search
    When the user reviews the items displayed
    Then the items should match the search term entered

  #Scenario: No Search Results Handling
    #Given the user is on the homepage with access to the search bar
    #When the user clicks on the search button
    #And the user enters a random term that is unlikely to have results (e.g., "abcdef1234")
    #And the user presses Enter
    #Then a "No results found" message should be displayed

  Scenario: Empty Search Input
    Given the user is on the homepage with access to the search bar
    When the user clicks on the search button
    And the user does not enter any input
    And the user presses Enter or clicks the search icon
    Then  no action should be taken

  Scenario: Invalid Category Handling
    Given the user is on the homepage with the menu open
    When the user attempts to click on an invalid or non-existent category
    Then the application should show an error message or prevent access
