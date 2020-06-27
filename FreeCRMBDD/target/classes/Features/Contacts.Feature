Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When verify of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Quit the browser

Examples:
	| username | password | firstname | lastname | position |
	| ajaypalmore  | ajay1234 | Ajay	  | More    | Director  |
	| naveenk  | test@123 | Tom 	  | Peter    | Manager  |
	| naveenk  | test@123 | David 	  | Dsouza   | Director |