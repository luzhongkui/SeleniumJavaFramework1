$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@DT"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "enter username and password",
  "rows": [
    {
      "cells": [
        "will11",
        "will"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "home page validate",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "logout home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.on_login_page()"
});
formatter.result({
  "duration": 25105702800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.title_of_the_page()"
});
formatter.result({
  "duration": 107672700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 5436973900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.home_page_validate()"
});
formatter.result({
  "duration": 144693000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat LoginStepsDT.LoginSteps.home_page_validate(LoginSteps.java:54)\r\n\tat ✽.Then home page validate(login.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.logout_home_page()"
});
formatter.result({
  "status": "skipped"
});
});