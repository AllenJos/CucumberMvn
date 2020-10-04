Feature: Login feature
This feature includes scenarios that would validate the following logins
1. Admin Login
2. linda.anderson
3. Negative login

Background: 
Given i am able to navigate to login page

#Scenario: Admin Login
#Given i am able to navigate to login page
#When i update the username as "Admin"
#And i update the password "admin123"
#And i click on the login button
#Then i should see the username as "Welcome Linda"
#
#Scenario: linda.anderson Login
#Given i am able to navigate to login page
#When i update the username as "linda.anderson"
#And i update the password "linda.anderson"
#And i click on the login button
#Then i should see the username as "Welcome Linda"

Scenario Outline: Login with different users
When i update the username as "<user>"
And i update the password as "<password>"
And i click on the login button
Then i should see the username as "<name>"

Examples:
|user           |password       |name         |
|linda.anderson |linda.anderson	|Welcome Linda|
|linda.anderson |linda.anderson	|Welcome Linda|

Scenario: Negative Login
When i update the username as "allen"
And i update the password as "allen"
And i click on the login button
Then i should see the error message as "Invalid credentials"