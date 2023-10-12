package Serialization;

import Pojo.AddBookRequest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class AddBookTest {

    public static void main(String [] args){
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest ap1 = new AddBookRequest();
        ap1.setAisle("292ff1");
        ap1.setIsbn("bcd");
        ap1.setAuthor("Pooja Thorat");
        ap1.setName("Learn API Testing");

                Response response =   given().header("Content-Type","application/json").body(ap1).
                when().post("Library/Addbook.php");


                String resp = response.asString();
                JsonPath js = new JsonPath(resp);

                System.out.println(js.getString("Msg"));
                Assert.assertEquals(response.getStatusCode(),200);

                // Or we can do same thing by writting different way as below.

                /*String responseB = response.asString();
                System.out.println(responseB);

                String s = response.jsonPath().getString("Msg");

                System.out.println(s);*/

              //  Assert.assertEquals(response.getStatusCode(),200);


        ;

    }
}
