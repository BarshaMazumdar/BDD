@tag
Feature: Login to my Facebook page

  @tag1
  Scenario Outline: Login Validation
    Given user navigate to login to the url
    When enter email with "<email>"  and enter password with "<password>"
    When click on login button
    Then verify the welcome page
    When click on logout button
    Then verify the default page

    Examples: 
      | email                       | password        |
      | barsaranimazumdar@gmail.com | Secondhome@2022 |
