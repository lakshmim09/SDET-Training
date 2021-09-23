package smoketests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.swaggerArrayPost.ArrRoot;
import pojos.swaggerArrayPost.Parameters;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SwaggerArrayPost
{
    ArrRoot arrRoot;
    Parameters parameters;
    @Test(priority = 0)
    public void swaggerarrPost()
    {
       arrRoot = new ArrRoot();
       parameters = new Parameters();

       parameters.setId(0);
       parameters.setEmail("string");
       parameters.setUserName("string");
       parameters.setPassword("string");
       parameters.setFirstName("string");
       parameters.setLastName("string");
       parameters.setPhone("string");
       parameters.setUserStatus(0);

        List<Parameters> parametersList= new ArrayList<>();

        parametersList.add(parameters);
        arrRoot.setParametersList(parametersList);

        Response response = given().
                when().
                header("Content-Type", "application/json")
                .body(arrRoot.getParametersList())
                .post("https://petstore.swagger.io/v2/user/createWithArray");
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }
}
