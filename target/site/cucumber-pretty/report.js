$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/regresAPI.feature");
formatter.feature({
  "name": "Creating smoke test for regres.in application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating GET Call for single user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.step({
  "name": "Iam passing endpoints for single user",
  "keyword": "When "
});
formatter.step({
  "name": "Iam validating the status code as\u003cexp_statusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the email as \u003cexpected_emailValue\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exp_statusCode",
        "expected_emailValue"
      ]
    },
    {
      "cells": [
        "200",
        "janet.weaver@reqres.in"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating GET Call for single user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamGivingBaseURIOfTheRegresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam passing endpoints for single user",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamPassingEndpointsForSingleUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam validating the status code as200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamValidatingTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the email as janet.weaver@reqres.in",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iValidateTheEmailAsJanetWeaverReqresIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Creating POST Call for single user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.step({
  "name": "Iam passing endpoints for create user",
  "keyword": "When "
});
formatter.step({
  "name": "Iam validating the status code as\u003cexp_statusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the name as \u003cexpectedName\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exp_statusCode",
        "expectedName"
      ]
    },
    {
      "cells": [
        "201",
        "morpheus"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating POST Call for single user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamGivingBaseURIOfTheRegresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam passing endpoints for create user",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamPassingEndpointsForCreateUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam validating the status code as201",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamValidatingTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the name as morpheus",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iValidateTheNameAsMorpheus(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Creating GET Call for list of users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.step({
  "name": "Iam passing endpoints for list user",
  "keyword": "When "
});
formatter.step({
  "name": "Iam validating the status code as\u003cexp_statusCode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate the url as \u003cexp_url\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exp_statusCode",
        "exp_url"
      ]
    },
    {
      "cells": [
        "200",
        "https://reqres.in/#support-heading"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating GET Call for list of users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamGivingBaseURIOfTheRegresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam passing endpoints for list user",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamPassingEndpointsForListUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam validating the status code as200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamValidatingTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the url as https://reqres.in/#support-heading",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iValidateTheUrlAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Delete Call for user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.step({
  "name": "Iam passing endpoints for delete user",
  "keyword": "When "
});
formatter.step({
  "name": "Iam validating the status code as\u003cexp_statusCode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "exp_statusCode"
      ]
    },
    {
      "cells": [
        "204"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Delete Call for user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smokeapi"
    }
  ]
});
formatter.step({
  "name": "Iam giving baseURI of the regres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamGivingBaseURIOfTheRegresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam passing endpoints for delete user",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamPassingEndpointsForDeleteUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iam validating the status code as204",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.APIstepdefs.iamValidatingTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
});