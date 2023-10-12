import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.example.Payload;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matcher.*;

public class Test {
    public static void main (String[] args){
        RestAssured.baseURI ="https://rahulshettyacademy.com";
       String response = given().log().all().queryParam("Key","qaclick123").header("Content-Type","application/json")
                .body(Payload.AddPlace()).when().post("maps/api/place/add/json")
                // verifying status code and field value from response body and response header field value.
                .then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server","Apache/2.4.41 (Ubuntu)")
                // Extract all response - Get all API response in string format
                .extract().response().asString();
       System.out.println("This is API response : "+ response);

       JsonPath js= new JsonPath(response);// for parsing json
        String placeId = js.getString("place_id");
        System.out.println("This is placeId : " + placeId);
    }

}
