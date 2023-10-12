package files;
import files.Pojo.CatApi;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.defaultParser;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class CatTest {

    public static void main(String[] args) throws IOException {
    CatApi cp = given().log().all().when().get("https://catfact.ninja/fact").as(CatApi.class);
        System.out.println("=========================="+ cp.getFact());
        System.out.println("================="+ cp.getLength());

       /* Note : this is simple get API and here I am using pojo class to get API response
        API : GET : https://catfact.ninja/fact
        Response :
        {
            "fact": "Cats have been domesticated for half as long as dogs have been.",
                    "length": 63
        }
*/
    }



}