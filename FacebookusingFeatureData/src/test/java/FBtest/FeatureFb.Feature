Feature: Facebook Login
Scenario Outline: With valid credentials user enters the login page

Given user is the facebook login page
Then user enters the username "<username>"
Then user enters the password "<password>"
And user clicks the submit button

Examples:
|username|password|
|rengasourav@gmail.com|JINGU1989|

@tags1
Scenario: With valid credentials user enters the login page
Given user is the facebook login page
Then user enters the username "rengasourav@gmail.com"
Then user enters the password "JINGU1989"
And user clicks the submit button




