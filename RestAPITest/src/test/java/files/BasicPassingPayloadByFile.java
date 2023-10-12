package files;
import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;


/*Note : If json payload is static/not changing, and if u
            don't want to put paylaod in your code. so in this case we could put it in file.
            Here I am passing AddPlaceAPI through the file.
            */
public class BasicPassingPayloadByFile {
    public static void main(String[] args) throws IOException {
        System.out.println("============== Add palce API ===================");
        RestAssured.baseURI = "http://rahulshettyacademy.com";

                given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").
                        // Content of the file to String -> content of file can convert into Byte -> Byte data to string
                        body(new String (Files.readAllBytes(Paths.get("C:\\Users\\pooja.s.thorat\\Desktop\\IMP_STUDY\\AddPlace.json")))) // Passing payload through the file
                .when().post("maps/api/place/add/json").
                 then().assertThat().statusCode(200).log().all();




    }
}