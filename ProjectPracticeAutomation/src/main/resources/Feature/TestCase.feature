@Practice_Automation_Project
Feature: Testing the practice automation website


@TC-01-Login_functionlity
Scenario Outline: To check if the user is able to login with valid details
Given The user launch the Chrome application
When Open the Practice automation website
Then Enter valid and invalid "<email>" and "<password>" in Login
And Click login button

Examples: 

|email					|password		|
|madhusavi1@gmail.com	|madhuvickyrekha|
|mavire@gmail.com		|mavire3456		|


@TC-02-Filtering_and_adding_books_to_Basket
Scenario: To check if the user is able to add the books in the basket on the filtered price
Given Launch the Chrome browser
When open Practice automation website
Then Enter the Email and password in login
Then Click on Login Button
Then Click Shop icon and Filter price using Slider
And Add the books to the basket and View the cart


@TC_03_Adding_books_from_HTML_Category
Scenario: To check if the user is able to buy books from HTML category
Given To Launch the chrome browser 
When To open the Practice automation website
Then Enter Email and password in login field
Then Click on the Login Button
Then Click Shop icon, Click HTML and buy the book
And View the cart html book


@TC_04_Adding_books_from_HTML_Category_and_increase_quantity_update
Scenario: To check if the user is able to buy books from HTML category and increase quantity
Given Launch the chrome browser in system
When To open Practice automation website
Then Enter Email and password in Login
Then Clicking Login Button
Then Click Shop icon  Click HTML and buy the book 
And View the cart, Increase quantity and update


@TC_05_Checking_Mandatory_fields_in_Billing_details
Scenario: To check if the mandatory fields are not entered,throws an appropriate error message 
Given Launch the chrome application
When To open Practice Automation  Website
Then Enter the Email and password in Login field
And Clicking on Login Button
Then Click Shop button  Click Selenium, buy the book and View cart
Then Click proceed to checkout, enter the mandatory details in billing details and click place order
And Take Screenshot if mandatory fields are mising

