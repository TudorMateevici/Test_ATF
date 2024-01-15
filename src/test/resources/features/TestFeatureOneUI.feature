@UI
Feature: UI testing

  @TC_1
  Scenario Outline: Successful shopping flow
    Given user access login page
    And user enters credentials: "<username>", "<password>"
    And user reach All Products page
    And user sort items by price low to high
    And user add item(s) to cart
    And user goes to cart(click on cart icon)
    And user performs checkout(click checkout button, enter First Name "<firstname>", Last Name "<lastname>" and Zip "<zip>")
    When user completes the order (click Finish button)
    Then confirmation message is displayed "<message>"


    Examples:
    | username      | password| firstname | lastname | zip | message|
    | standard_user | secret_sauce| Petrica | Cercel | 2023 | Thank you for your order!|

    @TC_2
      Scenario Outline: Not so successful shopping flow
      Given user access login page
      When user enters credentials "<username>", "<password>"
      And user click on Login button
      Then error message is displayed "<message>"

      Examples:
        | username | password | message |
        | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out forever.|
