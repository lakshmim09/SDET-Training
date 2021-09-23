package smoketests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.swaggerPost.Root;

import static io.restassured.RestAssured.given;

public class SwaggerPut
{
    Root root;
    @Test(priority = 0)
    public void swaggerPut()
    {
        root = new Root();
        Response response = given().
                when().
                header("Content-Type", "application/json")
                .body(root)
                .put("https://petstore.swagger.io/v2/pet");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }
}
