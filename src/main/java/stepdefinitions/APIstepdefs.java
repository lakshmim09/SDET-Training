package stepdefinitions;

import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.PostPojo;
import io.cucumber.core.exception.CucumberException;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APIstepdefs {
    Response response;
    PostPojo postPojo;
    @Given("Iam giving baseURI of the regres application")
    public void iamGivingBaseURIOfTheRegresApplication()
    {
        RestAssured.baseURI="https://reqres.in/";
    }

    @When("Iam passing endpoints for single user")
    public void iamPassingEndpointsForSingleUser()
    {
        response = given()
                  .when()
                  .header("Content-Type", "application/json")
                  .get("/api/users/2");
    }

    @Then("^Iam validating the status code as(.*)$")
    public void iamValidatingTheStatusCode(int exp_statusCode)
    {
        Assert.assertEquals(response.statusCode(),exp_statusCode);
    }

    @And("^I validate the email as (.*)$")
    public void iValidateTheEmailAsJanetWeaverReqresIn(String expected_emailValue)
    {
        String responseBody = response.getBody().asString();
        String actual_emailValue = JsonPath.read(responseBody,"$.data.email");
        //String supportURL = JsonPath.read(responseBody,"$.support.url");
        Assert.assertEquals(actual_emailValue,"janet.weaver@reqres.in");
        //Assert.assertEquals(supportURL,"https://reqres.in/#support-heading");
    }

    @When("Iam passing endpoints for create user")
    public void iamPassingEndpointsForCreateUser()
    {
        postPojo = new PostPojo();
        postPojo.setName("morpheus");
        postPojo.setJob("zion resident");
        response = given().
                when().
                header("Content-Type", "application/json").
                body(postPojo).
                post("/api/users");
    }

    @And("^I validate the name as (.*)$")
    public void iValidateTheNameAsMorpheus(String expectedName)
    {
        String responseBody = response.getBody().asString();
        String nameValue = JsonPath.read(responseBody,"$.name");
        Assert.assertEquals(nameValue,expectedName);
    }

    @When("Iam passing endpoints for list user")
    public void iamPassingEndpointsForListUser()
    {
        response = given().
                   when().
                   header("Content-Type", "application/json").
                   get("/api/users?page=2");
    }

    @And("^I validate the url as (.*)$")
    public void iValidateTheUrlAs(String exp_url)
    {
        String responseBody = response.getBody().asString();

        String act_url = JsonPath.read(responseBody,"$.support.url");

        Assert.assertEquals(act_url,exp_url);

    }

    @When("Iam passing endpoints for delete user")
    public void iamPassingEndpointsForDeleteUser()
    {
        response = given().
                   when().
                   header("Content-Type", "application/json").
                   delete("/api/users/2");

    }




}
