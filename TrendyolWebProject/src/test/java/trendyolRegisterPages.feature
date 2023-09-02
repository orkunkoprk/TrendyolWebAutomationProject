Feature: Register Page

  Background:
    Given  Go to trendyol website


  Scenario: with google account
    And Click cookies
    And  Action to login button
    And Click register button
    And Click with Google register button
    And Enter to email "o.koprek@gmail.com"
    And Click to continue buttonnn
    And Assert to fail account message

  Scenario: with facebook account
    And  Action to login button
    And Click register button
    And Click with Facebook register button
    And Enter to emaill "o@gmail.com"
    And Enter to password "12345"
    And Click to login button
    And Assert to fail account messagee

  Scenario Outline: with register
    And  Action to login button
    And Click register button
    And Write to email "<email>"
    And Write to password "<password>"
    And Select to woman or man
    And Click buttons
    When Click to register button
    Then Assert to fail account mesageee

    Examples:
      | email | password |
      |koprek.o@gmail.com|12345|
      |orkun.k@gmail.com|54321|



