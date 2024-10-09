Feature: Deal data creation

Scenario: Free CRM new contact deals Test_Scenario

Given user is already on login page
When title of login page is Free CRM
When user enters username and password
| jaghas | 5aXgX53x@DYTy | 
And click on login button
Then user is on homepage
Then user moves to deals page
Then user enters deal details 
| test deal | 1000 | 50 | 10 |
Then close the browser