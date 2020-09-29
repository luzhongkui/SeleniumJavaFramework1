Feature: Free CRM2 Login Feature

#Without Examples
@Without
Scenario: Free CRM2 Login Test Scenario
Given on login page
When  title of the page
Then enter "will" and "will"
Then home page validate
Then logout home page


@With
Scenario Outline: Free CRM3 Login Test Scenario
Given on login page
When  title of the page
Then enter <username> and <password>
Then home page validate
Then logout home page
Examples:
	| username | password |
	| will1     | will    |