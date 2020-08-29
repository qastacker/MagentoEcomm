Feature: Login into application

Scenario Outline: Validating test with valid login credentials
Given Initialize the browser with chrome
And Navigate to "https://elastic-demo.magemint.com/" Site
Then Click on Login link in home page to land on Secure sign in Page
When User enters <Username> and <Password> and logs in
And Close the browser

Examples:
|Username			|Password	|
|test99@gmail.com	|123456		|
|testing@adolmedia.com	|Testing@#123		|
