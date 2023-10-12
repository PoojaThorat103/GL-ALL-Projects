package resources;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Utils {

    RequestSpecification req;
    public RequestSpecification requestSpecification(){


        RestAssured.baseURI="http://216.10.245.166";
        req = new RequestSpecBuilder().setBaseUri("").addHeader("Content-Type","application/json").build();
        return req;


    }
}
