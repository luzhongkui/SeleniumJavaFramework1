Feature: Free CRM2 Login Feature

#Without Examples
@Without
Scenario: Free CRM2 Login Test Scenario
Given on login page"
When  title of the page
Then enter "will" and "will"
Then home page validate
Then logout home page


Scenario Outline: Free CRM3 Login Test Scenario
Given on login page "<borswser>" and "<driver>"
When  title of the page
Then enter "<username>" and "<password>"
Then home page validate
Then logout home page
 
Examples:
	| username | password | borswser | driver |
	| will1    | will     | webdriver.chrome.driver | C:\\Users\\luzhongk\\Selenium\\WebDriver\\chromedriver.exe |
	| will1    | will     | webdriver.gecko.driver  | C:\\Users\\luzhongk\\Selenium\\WebDriver\\geckodriver.exe  |
	| will     | will     | webdriver.edge.driver   | C:\\Users\\luzhongk\\Selenium\\WebDriver\\msedgedriver.exe |
	| will     | will     | webdriver.ie.driver     | C:\\Users\\luzhongk\\Selenium\\WebDriver\\IEDriverServer64.exe |