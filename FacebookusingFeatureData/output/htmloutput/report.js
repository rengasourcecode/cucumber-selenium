$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/FBtest/FeatureFb.Feature");
formatter.feature({
  "name": "Facebook Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "With valid credentials user enters the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tags1"
    }
  ]
});
formatter.step({
  "name": "user is the facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefinition.user_is_the_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"rengasourav@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FbDefinition.user_enters_the_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password \"JINGU1990\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FbDefinition.user_enters_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "FbDefinition.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
});