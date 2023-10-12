package Serialization;

import Deserialization.Payload;
import Pojo.JobAPI;
import Pojo.JobAPIRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class JobTest {
    public static void main(String [] args){
        RestAssured.baseURI = "https://reqres.in";
        // To set value
       JobAPIRequest ap = new JobAPIRequest();
       ap.setJob("Testing");
       ap.setName("IT");

    Response res =   given().header("Content-Type","application/json").body(ap).
                 when().post("api/users");

    String responseBody = res.asString();
    System.out.println(responseBody);
    Assert.assertEquals(ap.getJob(),"Testing","Job Value mismatched.");

    }
}
