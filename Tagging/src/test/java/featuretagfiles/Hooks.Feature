Feature: Hooks in Cucumber

Scenario: Add customer
Given User in add customer page
When user fills the deatils
And user added

Scenario: edit customer
Given User in edit customer page
When user deatils updates
And user updated

Scenario: delete customer
Given User in delete customer page
When user deletes the deatils
And user deleted