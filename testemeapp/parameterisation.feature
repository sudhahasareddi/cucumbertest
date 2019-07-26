Feature: Login Action 

 	Scenario Outline: Successful login and validation 
 		Given the login page is open
 		When User clicks on signin link
 		And Enter "<username>" and  "<password>" 
 		Then Message is displayed login successfully 
 		
	  Examples:
			| username | password    |
			| lalitha  | password123 |
			| admin    | pass        |