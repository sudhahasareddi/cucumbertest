Feature: To login
	Scenario: User enters login and password 
		Given The Login page is open
		When  user enters username as lalitha 
		When  user enters password as password123
		Then  homepage is open