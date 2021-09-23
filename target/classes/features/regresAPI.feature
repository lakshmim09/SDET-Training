Feature: Creating smoke test for regres.in application

  @smokeapi
  Scenario Outline: Creating GET Call for single user
    Given Iam giving baseURI of the regres application
    When Iam passing endpoints for single user
    Then Iam validating the status code as<exp_statusCode>
    And I validate the email as <expected_emailValue>
    Examples:
      | exp_statusCode | expected_emailValue    |
      | 200            | janet.weaver@reqres.in |

  @smokeapi
  Scenario Outline: Creating POST Call for single user
    Given Iam giving baseURI of the regres application
    When Iam passing endpoints for create user
    Then Iam validating the status code as<exp_statusCode>
    And I validate the name as <expectedName>
    Examples:
      | exp_statusCode | expectedName |
      | 201            | morpheus     |

  @smokeapi
  Scenario Outline: Creating GET Call for list of users
    Given Iam giving baseURI of the regres application
    When Iam passing endpoints for list user
    Then Iam validating the status code as<exp_statusCode>
    And I validate the url as <exp_url>
    Examples:
      | exp_statusCode   | exp_url   |
      | 200              |  https://reqres.in/#support-heading |

  @smokeapi
  Scenario Outline: Delete Call for user
    Given Iam giving baseURI of the regres application
    When Iam passing endpoints for delete user
    Then Iam validating the status code as<exp_statusCode>
    Examples:
      | exp_statusCode   |
      | 204|

