$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Fb Page",
  "description": "",
  "id": "fb-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "",
  "id": "fb-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "browser Launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "sign Up Page",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "user Enter First Name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter Last Name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter Email",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter Password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter Date Of Birth",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter Date Of Month",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Enter Date Of Year",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Enter Sex",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click On Submit",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefenition.browser_Launch()"
});
});