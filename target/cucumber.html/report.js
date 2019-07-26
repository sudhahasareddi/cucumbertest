$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:testemeapp/parameterisation.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login and validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the login page is open",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on signin link",
  "keyword": "When "
});
formatter.step({
  "name": "Enter \"\u003cusername\u003e\" and  \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Message is displayed login successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    },
    {
      "cells": [
        "admin",
        "pass"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login and validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the login page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "parameter.the_login_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on signin link",
  "keyword": "When "
});
formatter.match({
  "location": "parameter.user_clicks_on_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"lalitha\" and  \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "parameter.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message is displayed login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "parameter.message_is_displayed_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login and validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the login page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "parameter.the_login_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on signin link",
  "keyword": "When "
});
formatter.match({
  "location": "parameter.user_clicks_on_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"admin\" and  \"pass\"",
  "keyword": "And "
});
formatter.match({
  "location": "parameter.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message is displayed login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "parameter.message_is_displayed_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});