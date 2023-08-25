
@PhaseOne
Feature: Tasks Management
 
@SmokeTest
Scenario: Create a Tasks
  Given User is on CRM Home page
  When User create a new Tasks
  
 @RegressionTest
 Scenario: Update a Tasks
  Given User is on CRM Home page
  When User update a Tasks


 Scenario: Deletee a Tasks
  Given User is on CRM Home page
  When User Delete new Tasks