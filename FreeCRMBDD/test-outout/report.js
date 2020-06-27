$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Lenovo/workspace/FreeCRMBDD/src/main/java/com/qa/Features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Application Test",
  "description": "",
  "id": "freecrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "freecrm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user log into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validates home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate Logged in User",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.open_the_browser()"
});
