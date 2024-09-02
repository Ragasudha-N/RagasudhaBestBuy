Feature: Menu and Search Functionality
Background:
When I click on bestbuy link
Then I have to select the country

  Scenario: Menu Button Access
    Given I am  on the Best Buy homepage
     When I locate the menu button
    And I user clicks on the menu button
    Then the menu button should be visible
   


  
#Scenario: Category Selection
    #Given I am on the Best Buy homepage
    #When I  click the menu
    #And I click on the  categorylist (e.g., "Laptops")
    #Then items related to the selected category should be displayed
  
  Scenario: Appliance sale event
  Given I am on the Best Buy homepage
   When I  click the menu
   And I click  appliances
   Then I click major appliances
   And I click on Aplliance sale event
   Then Top deals message is displayed.
   
  
  
  Scenario:Brand search
  Given I am on the Best Buy Homepage
  When I click on the menu button
  Then click Brands link
  And click on the "<Brand >" brand name
    
  
  
  Scenario Outline: Search Functionality
    Given I land the Best Buy homepage with the search bar visible
    When I user clicks on the input field and clears it.
    And I enter a product for  search  "<search_term>"
    And I  click the search icon
    Then items related to the search term "<search_term>" should be displayed

    Examples:
      | search_term |
      | iPhone       |
      | Laptop       |
      | Camera       |

  #Scenario: Search Result Accuracy
    #Given I has performed a search
    #When I review the items displayed
    #Then the items should match the search term entered


  Scenario: Invalid search items for specific character
    Given I am on the homepage with access to the search bar
    When I click on the search button
    And I  enter special characters like"<invalid>"input
    Then  no responses found message should be displayed
        Examples:
      | invalid      |
      | ^            |
      | (            |
      | )            |
      |\             |
      |[]            |

