package smoketests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.swaggerPost.Category;
import pojos.swaggerPost.Root;
import pojos.swaggerPost.Tags;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SwaggerPost
{
    Root root;
    Category category;
    Tags tags;

    @Test(priority = 0)
    public void swaggerPost()
    {
        //Creating objects for category,tags and root classes
        category = new Category();
        tags = new Tags();
        root = new Root();
        //Creating list for tags
        tags.setId(1);
        tags.setName("doggie");
        List<Tags> listTags= new ArrayList<>();
        listTags.add(tags);

        //Creating list for photo field
        List<String> listPhoto = new ArrayList<>();
        listPhoto.add("string");

        //Setting values for category class

        category.setId(1);
        category.setName("Dog");

        //Setting values for root

        root.setTags(listTags);
        root.setCategory(category);
        root.setPhotoUrls(listPhoto);
        root.setStatus("available");
        root.setId(100);
        root.setName("pup");

        Response response = given().
                when().
                header("Content-Type", "application/json")
                .body(root)
                .post("https://petstore.swagger.io/v2/pet");
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }

}
