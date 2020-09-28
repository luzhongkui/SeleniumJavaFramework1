$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.on_login_page()"
});
formatter.result({
  "duration": 16008602500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_is_Free_CRM()"
});
formatter.result({
  "duration": 116247900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cCRM[ says…]\u003e but was:\u003cCRM[PRO - CRM software for customer relationship management, sales, and support.]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.LoginStepDefinition.title_is_Free_CRM(LoginStepDefinition.java:52)\r\n\tat ✽.When title is Free CRM(login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
});