
Feature: Login Function
  
  #Scenario: Valid Login
  #Given User is on Login page
  #When User enters credentials
  #Then User should be navigated to Home page

  #Scenario: Valid Login
  #Given User is on Login page
  #When User enters "tomsmith" and "SuperSecretPassword!"
  #Then User should be navigated to Home page
  
  
  
  Scenario Outline: Valid Login
  Given User is on Login page
  When User enters "<username>" and "<password>"
  Then User should be navigated to Home page
  
  Examples:
  | username | password|
  | tomsmith | SuperSecretPassword! |
  | testuser1 | Welcome123 |
  | testuser2 | Welcome123 |