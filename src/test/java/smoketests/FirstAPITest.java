package smoketests;

import base.baseAPI;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.PostPojo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

    public class FirstAPITest extends baseAPI
    {
        PostPojo postPojo;
        @Test (priority = 0)
        public void getCall() {
            Response response = given().
                    when().
                    header("Content-Type", "application/json")
                    .get("/api/users/2");

            Assert.assertEquals(response.statusCode(),200);
            String responseBody = response.getBody().asString();

            String emailValue = JsonPath.read(responseBody,"$.data.email");
            String supportURL = JsonPath.read(responseBody,"$.support.url");
            Assert.assertEquals(emailValue,"janet.weaver@reqres.in");
            Assert.assertEquals(supportURL,"https://reqres.in/#support-heading");
            System.out.println(responseBody);

        }
        @Test
        public void getCallListUser()
        {
            Response response = given().
                                when().
                                header("Content-Type", "application/json").
                                get("/api/users?page=2");
            String responseBody = response.getBody().asString();

            int id = JsonPath.read(responseBody,"$.data[0].id");

            String textVal = JsonPath.read(responseBody,"$.support.text");

            int totalPages = JsonPath.read(responseBody,"$.total_pages");

            Assert.assertEquals(id,7);

            Assert.assertEquals(textVal,"To keep ReqRes free, contributions towards server costs are appreciated!");

            Assert.assertEquals(totalPages,2);

            /*System.out.println(id);
            System.out.println(textVal);
            System.out.println(totalPages);*/


        }

        @Test (priority = 1)
        public void postCall() {

            postPojo = new PostPojo();
            postPojo.setName("morpheus");
            postPojo.setJob("zion resident");
            //System.out.println(postPojo.getName());
            Response response = given().
                                when().
                                header("Content-Type", "application/json").
                                body(postPojo).
                                post("/api/users");
            Assert.assertEquals(response.statusCode(),201);
            String responseBody = response.getBody().asString();
            String nameValue = JsonPath.read(responseBody,"$.name");
            Assert.assertEquals(nameValue,"morpheus");
            //System.out.println(responseBody);
        }
        @Test (priority = 2)
        public void putCall()
        {
            Map <String,String> bodyParam = new HashMap<>();
            bodyParam.put("name","morpheus");
            bodyParam.put("job","zion resident");

            Response response = given().
                    when().
                    header("Content-Type", "application/json").
                    //body(bodyParam).
                    put("/api/users/2");

            String responseBody = response.getBody().asString();
            System.out.println("Status code of API call:" +response.getStatusCode());

            System.out.println(responseBody);

        }
        @Test (priority = 3)
        public void deleteCall() {
            Response response = given().
                    when().
                    header("Content-Type", "application/json").
                    delete("/api/users/2");
            System.out.println("Status code of API call:" +response.getStatusCode());
            Assert.assertEquals(response.getStatusCode(),204);



        }

    }


