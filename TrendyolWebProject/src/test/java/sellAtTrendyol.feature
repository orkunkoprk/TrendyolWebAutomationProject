Feature: Sell at Trendyol Page

  Background:
    Given  Go to trendyol website

  Scenario:
    And Click cookies
    And Click to sell at Trendyol
    And Click to apply Pazaryeri
    And Write to Firstname and Lastname "Orkun Köprek"
    And Write to emaill "okoprek@gmail.com"
    And Select to Company Type
    And Select to Cityy
    And Write to tel "309123298"
    And Select to sell type category
    And Write to TC No "14347277151"
    And Select to districtt
    And Click to undertand button
    And Click to Continue button
    And Assert to website
    And Company title name "ANONİM ŞİRKETİ"
    When Vergi kimlik no "12345678910"
    Then Click button

  Scenario Outline:
    And  Click to sell at Trendyol
    And Click to apply Pazaryeri
    And Enter to fullname "<fullName>"
    And Enter to emailll "<email>"
    And Select to Company Type
    And Select to Cityy
    And Enter to tel "<tel>"
    And Select to sell type category
    And Enter to TC No "<tcNo>"
    And Select to districtt
    And Click to undertand button
    And Click to Continue button
    And Assert to website
    And Company title name "<titleName>"
    When Vergi kimlik no "<vkNo>"
    Then Click button

    Examples:
      | fullName | email | tel | tcNo | titleName | vkNo |
      | Orkun Köprek | o@gmail.com | 312089853 | 14347277172 | ANONİM ŞİRKETİ | 123456789987 |
      | Sadettin Köprek | sk@gmail.com | 442089853 | 41347277155 | LIMITED ŞİRKET | 987654389987 |


