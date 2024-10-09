Feature: Free crm Login Feature

# without exapmles keyword

#Scenario: Free CRM Login Test_Scenario

#Given user is already on login page
#When title of login page is Free CRM
#When user enters "jaghas" and "5aXgX53x@DYTy"
#And click on login button
#Then user is on homepage
#Then close the browser




# With Examples keyword

Scenario Outline: Free CRM Login Test_Scenario

Given user is already on login page
When title of login page is Free CRM
When user enters "<username>" and "<password>"
And click on login button
Then user is on homepage
Then close the browser

Examples:

     | username | password  |
     | jaghas   | 5aXgX53x@DYTy  |
     | tom      | test123   | 
 