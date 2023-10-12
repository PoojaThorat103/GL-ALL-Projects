import files.ReUsableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import static io.restassured.RestAssured. *;
import static org.hamcrest.Matchers . *;


public class BasicTest {
    public static void main (String [] args){

        // Note : any Restassured automation test should be written in this  principle only
            // given - for all input details
            // when - submit the API : resources(url except base url), http method
            // Then - validate the response

        //Add palce API : to add place
        System.out.println("============== Add palce API ===================");
        RestAssured.baseURI= "http://rahulshettyacademy.com";
      String response =
              given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(payload.AddPlaceApi()) // Passing API body
              .when().post("maps/api/place/add/json")
              .then().assertThat().statusCode(200)// validation on status code in response
                .body("scope", equalTo("APP")) // validation on response body : here we are validating one filed from response body
                .header("Server", "Apache/2.4.52 (Ubuntu)")// validation on response header body
                .extract().response().asString(); // extract response body and store it in string or store json in string format
      System.out.println("This is response body " + response);

        // to extract any value from response body
      JsonPath  js = new JsonPath(response); // using JsonPath class for parsing json
        String placeId = js.getString("place_id"); // got the place id here so now we can reuse it in other API
        System.out.println("Place id  : "+placeId);

       // Note : get placeId from one api and use it in another API.(get something like token or id and use it in anothe API)


        // ------------------------ NEW API START ----------------------
        //Update place API : for update address with new address
        String newAddress = "70 winter walk, aaa";
        System.out.println("============== Update place API ===================");
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{\n" +
                "\"place_id\":\""+placeId+"\",\n" +
                "\"address\":\""+newAddress+"\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}").
                when().put("maps/api/place/update/json").
                then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));


        // ------------------------ NEW API START ----------------------
        //get place API : to validate if new address is present in response
        System.out.println("============== Get Place Id API ===================");

        String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId)
                .when().get("maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();

       JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
        String actualAddress =   js1.getString("address"); // from json extracting string
        System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, newAddress); // using TestNg validation here

//   /*
//        Add palce API : to add place
//        Update place API : for update address with new address
//        get place API : to validate if new address is present in response */



    }
}
