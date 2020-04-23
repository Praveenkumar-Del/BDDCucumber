
Feature: Free HRMOrangeApplication
  
@demo1
Scenario: HRMOrange Application Demo

    Given user is already on Login Page
    When title of the login pgae is OrangeHRM
    Then user enters username and Password
    Then user clicks on login button
    Then user is on home page
    
@demo2  
Scenario: User clicks on Logout

		Given user is on Home Page
		Then user make mouse hover on Welcome Admin
		And user clicks on Logout
		
		
 @demo3   
 Scenario: user Check when you forgot the password 

    Given user is already on Login Page
    When title of the login pgae is OrangeHRM
    Then user clicks on Forgot your password
    Then user enters the Username
    And user clicks on Reset Password 
    Then user clicks on Cancel
    