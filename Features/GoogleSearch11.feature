 
 Feature: Google Search
 Scenario Outline: Simple Search
 
 
 Given I am on a google homepage
 
 
 
 When I enter search "<term>"
 
 
 
 And I click on google search button
 
 
 Then I recieved related search result
 
 Examples:
 | term                |
 | Quality Assurance   |
 | Software testing    |
      