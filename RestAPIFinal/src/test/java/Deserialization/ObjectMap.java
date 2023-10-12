package Deserialization;

import Pojo.JobAPI;
import Pojo.JobAPIRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ObjectMap {

    public static void main(String[] args) throws JsonProcessingException {
        RestAssured.baseURI = "https://reqres.in";

        JobAPIRequest ap = new JobAPIRequest();
        ap.setJob("Testing");
        ap.setName(null);


        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(ap);

        System.out.println("Request - "+ ap.toString());
        System.out.println("Request - "+ jsonString);
        // Get response and converting whole response into java object of JobAPI class.
        Response res = given().header("Content-Type","application/json").body(jsonString).
                when().post("api/users");

        //
        JobAPI jobAPI = mapper.readValue(res.asString(), JobAPI.class);

        System.out.println("Response - "+res.asString());
        System.out.println("Response - "+jobAPI.toString());
        Assert.assertEquals(jobAPI.getJob(), "Testing", "Job value is mismatch.");
    }

}
