Feature: Test the login functionality of OrangeHRM

Scenario Outline: Test the valid login

Given user is on login page
When user enters <uname> and <pswd>
And click on login button
Then user should land on home page

Examples:
| uname 	| pswd 			|
| admin 	| admin123 	|
| admin1 	| admin123 	|