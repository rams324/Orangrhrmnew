Feature: OrangeHRM Website

@tc_01
Scenario:
Log in to OrangeHRM with valid Cradentials

Given user launch the chrome browser1
When user open the orange hrm login page1
Then user enter the username and password with valid data1
And user click the Login button

@tc_02
Scenario:
Log in to OrangeHRM with invalid Cradentials

Given the user launch the chrome browser2
When the user open the orange hrm login page2
Then user enter the username and password with invalid data2
And the user click the Login button

@tc_03
Scenario:
 To check if the dashboard page is present when user log into the website

Given  user launch the Chrome browser3
When user open the orangehrm login page3
Then the user enter the username and password with valid data3
And user click the login button
Then take the screenshot of the dashboard page

@tc_04
Scenario:
To check the footer of the dash borad contains OrangeHRM

Given  user Launch the chrome browser4
When user open the orangeHrm login page4
Then User enter the username and password with valid data4
And User click the Login button
Then compare the footer content 

@tc_05
Scenario:
Leave link is working in properly or not in the dashborad page 

Given  user launch the chrome Browser5
When user open the orangehrm Login page5
Then user enter the username and password with Valid data5
And user click the Login button
Then user  click Leave link in the dash borad page


@tc_06
Scenario:
adding user details in admin page

Given  user launch the chrome browser6
When  user open the orange hrm login page6
Then login with valid details6
Then user is able to add the new user in the admin page


@tc_07
Scenario:
delete user details in admin page

Given user launch the chrome browser7
When  user open the orange hrm login page7
Then login with required details7
Then user is able to delet the  admin in the admin page

@tc_08
Scenario:
about orange HRM

Given launcing the application via chrome browser8
When login with valid details8
Then user is able to know about orange hrm application
Then take the screenshot of about page 

@tc_09
Scenario:
searching for employee 

Given user launch the chrome browser9
When  user open the orange hrm login page9
Then login with valid details9
Then searching for employee in the admin page



@Tc_11
Scenario:
Search Candidate details in the Recruitment page

Given user Launch the chrome browser11
When user Open the orange hrm login page11
Then user Enter the username and password with valid data11
Then user Submit the details
Then user searching the candidate details

@Tc_12
Scenario:
Reset Candidate details in the Recruitment page

Given  the user Launch the chrome browser12
When the user Open the orange hrm login page12
Then the user Enter the username and password with valid data12
Then the user Submit the details
Then the user reset the candidate details

@Tc_13
Scenario:
Reset Candidate details in the Recruitment page

Given User Launch the chrome browser13
When User Open the orange hrm login page13
Then User Enter the username and password with valid data13
Then user should Submit the details
Then user Searching the candidate details
And add another candidate details

@Tc_14
Scenario:
Search Vacancies in the Recruitment page

Given User launch the chrome browser14
When User open the orange hrm login page14
Then User enter the username and password with valid data14
Then User submit the details
Then User searching the vacancies 

@Tc_15
Scenario:
Add candidate details in vacancies in the recruitment page

Given User Launch the Chrome browser15
When User Open the Orange hrm login page15
Then User Enter the Username and password with valid data15
Then user Should Submit the details
Then user Searching the Candidate details
And add candidate details 

	
@TC_16 
Scenario: 
Validating the click functionality of Directory Tab sss

Given Launch the chrome browser16 
When Open the OrangeHRM Home Page16
Then Navigate to Directory Tab 
And Click on the Directory Tab 
Then Verify whether page is navigated or not 
	
@TC_17
Scenario:
validating valid in search directory 

Given launch the chrome browser17 
When Open the OrangeHRM Home Page and click on the Directory Tab
Then Enter the valid data 
And Click on the Search button1 
	
	
@TC_18
Scenario: 
validating invalid in search directory 
	
Given Launch the Chrome browser18
When Open the OrangeHRM Home Page and click on the directory Tab18
Then Enter the valid Data 
And Click on the Search button 
	
@TC_19
Scenario: 
validating Reset button in search directory 
	
Given Launch the chrome Browser19
When Open the OrangeHRM Home Page and click on the DirectoryTab19
Then Enter the invalid data 
And Click on the Reset button 
	
@tc_20
Scenario:
LogOut the application

Given  user launch the Chrome Browser20
When user open the orangehrm login Page20
Then user enter the username and password with valid Data20
And user click on the Login button
Then user click the logout button
	