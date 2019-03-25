$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/featuretagfiles/Hooks.Feature");
formatter.feature({
  "name": "Hooks in Cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdef.user_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the deatils",
  "keyword": "When "
});
formatter.match({
  "location": "hooksdef.user_fills_the_deatils()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user added",
  "keyword": "And "
});
formatter.match({
  "location": "hooksdef.user_added()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "edit customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in edit customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdef.user_in_edit_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deatils updates",
  "keyword": "When "
});
formatter.match({
  "location": "hooksdef.user_deatils_updates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updated",
  "keyword": "And "
});
formatter.match({
  "location": "hooksdef.user_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "delete customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in delete customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "hooksdef.user_in_delete_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes the deatils",
  "keyword": "When "
});
formatter.match({
  "location": "hooksdef.user_deletes_the_deatils()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deleted",
  "keyword": "And "
});
formatter.match({
  "location": "hooksdef.user_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});