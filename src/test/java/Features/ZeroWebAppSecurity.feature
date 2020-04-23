Feature: Zero Web App Security for transfer funds
  
@demo1
Scenario: Login into the application and check the title

	Given user is already on Login page
	#Zero - Personal Banking - Loans - Credit Cards
	When user enters the Login Credentials and click on Sign in
	Then user is on Account summary page
	#Zero - Account Summary
	
#Scenario: User clicks on Funds Transfer tab and verify the page
	Then user is clicks on Transfer funds tab
	And user verify the Zero Transfer Funds page
	

#Scenario: user makes transfer from one account to another
	Then user checks the contents in dropdown
	Then user selects different accounts in from and to
	And user enters the amount and description
	And user clicks on Continue button
	

#Scenario: User is in verify page and clicks on Submit btn
	Then User is on Verify page
	And user clicks on Submit btn
	

#Scenario: user succesfully submitted the transaction
	Then User checks the new page
	And user finds the alert message with success


