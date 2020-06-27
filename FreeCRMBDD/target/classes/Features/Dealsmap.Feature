Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password|
		| naveenk | test@123 |
		
	Then user clicks login button 
	Then user home page 
	Then user moves to new deal page 
	Then user enters deal details 
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then Close browser