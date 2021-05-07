$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_White.feature");
formatter.feature({
  "line": 2,
  "name": "User Should be on the Techfios Test Page",
  "description": "",
  "id": "user-should-be-on-the-techfios-test-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 2922265100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should go the techfios test page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechFios_Test_SkyBlue_StepDefinitions.user_should_go_the_techfios_test_page()"
});
formatter.result({
  "duration": 546879500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "user-should-be-on-the-techfios-test-page;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The background color will change to White",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFios_Test_SkyBlue_StepDefinitions.i_click_on_the_button()"
});
formatter.result({
  "duration": 49060900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});