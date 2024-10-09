Feature: Free crm create contact Feature

Scenario Outline: Free CRM new contact create Test_Scenario

Given user is already on login page
When title of login page is Free CRM
When user enters  "<username>" and "<password>"
And click on login button
Then user is on homepage
Then user moves to contacts page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

    | username | password      | firstname | lastname | position |
    | jaghas   | 5aXgX53x@DYTy | tom       |  peter   | manager  |
    | jaghas   | 5aXgX53x@DYTy | jhon      |  daniels   | technician  |
    