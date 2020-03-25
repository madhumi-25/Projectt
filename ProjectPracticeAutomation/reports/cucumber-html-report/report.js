$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the practice automation website",
  "description": "",
  "id": "testing-the-practice-automation-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation_Project"
    }
  ]
});
formatter.scenario({
  "line": 50,
  "name": "To check if the mandatory fields are not entered,throws an appropriate error message",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-mandatory-fields-are-not-entered,throws-an-appropriate-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@TC_05_Checking_Mandatory_fields_in_Billing_details"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "Launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "To open Practice Automation  Website",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Enter the Email and password in Login field",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Clicking on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Click Shop button  Click Selenium, buy the book and View cart",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Click proceed to checkout, enter the mandatory details in billing details and click place order",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Take Screenshot if mandatory fields are mising",
  "keyword": "And "
});
formatter.match({
  "location": "BillingDetailsSteps.launch_the_chrome_application()"
});
formatter.result({
  "duration": 9900759200,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.to_open_Practice_Automation_Website()"
});
formatter.result({
  "duration": 4638206300,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.enter_the_Email_and_password_in_Login_field()"
});
formatter.result({
  "duration": 18830757500,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.clicking_on_Login_Button()"
});
formatter.result({
  "duration": 7744598500,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.click_Shop_button_Click_Selenium_buy_the_book_and_View_cart()"
});
formatter.result({
  "duration": 22685980500,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.click_proceed_to_checkout_enter_the_mandatory_details_in_billing_details_and_click_place_order()"
});
formatter.result({
  "duration": 24569226000,
  "status": "passed"
});
formatter.match({
  "location": "BillingDetailsSteps.take_Screenshot_if_mandatory_fields_are_mising()"
});
formatter.result({
  "duration": 11856723700,
  "status": "passed"
});
});