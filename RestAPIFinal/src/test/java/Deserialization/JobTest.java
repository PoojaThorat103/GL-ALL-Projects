package Deserialization;
import Pojo.JobAPI;
import Pojo.JobAPIRequest;
import io.restassured.RestAssured;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class JobTest {

    public static void main(String [] args){
        RestAssured.baseURI = "https://reqres.in";

        JobAPIRequest ap = new JobAPIRequest();
        ap.setJob("Testing");
        ap.setName("IT");

        System.out.println("Request - "+ ap.toString());
        // Get response and converting whole response into java object of JobAPI class.
        JobAPI JobAPI = given().header("Content-Type","application/json").body(ap).
                when().post("api/users").as(JobAPI.class);

        System.out.println("Response - "+JobAPI.toString());
        Assert.assertEquals(JobAPI.getJob(), "Testing", "Job value is mismatch.");
    }
}

