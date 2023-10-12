package files;

import files.Pojo.AddPlaceSerializeAPI;
import files.Pojo.LocationPartOfSerialization;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
public class SerializeTest {
public static void main (String [] args){

    RestAssured.baseURI = "http://rahulshettyacademy.com";

    AddPlaceSerializeAPI ap = new AddPlaceSerializeAPI();
    ap.setAccuracy(50);
    ap.setAddress("29, side layout, cohen 09");
    ap.setName("Rahul shetty Academy");
    ap.setPhone_number("(+91) 983 893 3937");
    ap.setWebsite("http://google.com");
    ap.setLanguage("French-IN");

    List<String> typeList = new ArrayList<String>();
    typeList.add("shoe park");
    typeList.add("shop");
    ap.setTypes(typeList);

    LocationPartOfSerialization loc =  new LocationPartOfSerialization();
    loc.setLat(-38.383494);
    loc.setLng(33.427362);
    ap.setLocation(loc);



           given().queryParam("key", "qaclick123").body(ap)
           .when().post("/maps/api/place/add/json")
           .then().assertThat().statusCode(301);



}





}
