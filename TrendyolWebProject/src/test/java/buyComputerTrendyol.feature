Feature: E-Trade Page

  Background:
    Given  Go to trendyol website
    And Click cookies
    And Action to Elctronic button

    Scenario Outline: to buy Computer
      And Click Computer
      And Click to Apple for filter
      And Click to Macbook PRO
      And Assert to New window
      And Assert to installments
      And Add to basket
      And Go to basket
      And Continue to not register
      And Enter to emailll"<email>"
      And Enter to firstname "<firstname>"
      And Enter to lastname "<lastname>"
      And Select to city
      And Select to district
      And Select to street
      And Enter to adress "<adress>"
      And Enter to adress handline "<adresshandline>"
      And Click to save button
      And Assert to tel fail mesage
      And  Click to information text
      When Close to pop-up
      Then Back to landing page

      Examples:
        | email | firstname | lastname | adress | adresshandline |
        |o@gmail.com |Orkun |Köprek |İstiklal Mahallesi 40036 sokak no 3 |Ev |




