Feature: Facebook Login

Scenario: With valid credentials user enters the login page

Given user is the facebook login page
When to check the validity of the page "skjdc"
Then user enters the username "rengasourav@gmail.com"
Then user enters the password "JINGU1989"
And user clicks the submit button
