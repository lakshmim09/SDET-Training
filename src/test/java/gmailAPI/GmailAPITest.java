package gmailAPI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GmailAPITest
{
    String accesstoken = "Bearer ya29.a0ARrdaM-LaOdOlEUf6nkA-D4FM7pfZr4ESfRqpJv5CPsuyGb_aWpqY3cenlon4UkacT0nst6ZNSlrhVyevjfObg257gRTP_smCGQouJzJI5x377pf9k1Bju03TArbN08N8I7sxKv9buybmUqeI97pl3fkmcWF";

    @Test
    public void gmailAPITest()
    {
        String msg = "From: testing.sdet1@gmail.com\n" +
                "To: testing.sdet1@gmail.com\n" +
                "Subject: Test Email from Rest Assured\n" +
                "\n" +
                "Sending from Gmail API";
        String base64URLencoded = Base64.getUrlEncoder().encodeToString(msg.getBytes());

        Map<String,String> payload = new HashMap<>();
        payload.put("raw",base64URLencoded);

        Response response = given().
                when().
                header("Content-Type", "application/json")
                .header("Authorization",accesstoken)
                .body(payload)
                .post("https://gmail.googleapis.com/gmail/v1/users/testing.sdet1@gmail.com/messages/send?Autho");

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

    }
}
