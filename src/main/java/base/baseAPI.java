package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class baseAPI
{
    FileReaderManager fileReaderManager;
    @BeforeClass
    public void base()
    {
        fileReaderManager = new FileReaderManager();
        RestAssured.baseURI="https://reqres.in";
    }
}
