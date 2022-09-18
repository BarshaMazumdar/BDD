@Demofeature
Feature: Demo1 features

  @ResourcestabTesting
  Scenario Outline: Resource tab test link
    Given user navigates to the application
    When user clicks on links "<linkName>"
    Then validate the outcomes
    
Examples:
|linkName|
|Resources|



  
