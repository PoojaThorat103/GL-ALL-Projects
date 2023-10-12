package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson {

// -------------------  1. Dynamically build json payload with external data input in Add Book API-----------------------
    @Test
    public void addBook(){
        RestAssured.baseURI = "http://216.10.245.166";
        String response   =
                given().header("Content-Type", "application/json").body(payload.addBook("bcd", "292ff8")).
                when().post("Library/Addbook.php").
                then().assertThat().statusCode(200).
                extract().response().asString();
            JsonPath js =  ReUsableMethods.rawToJson(response);
             String BookId =  js.getString("ID");
             System.out.println("BookId : " + BookId);
        /*Note : here we are passing value as a parameter/ sending value to the method, so no need to change value from payload. here we are running only with one data set.
        and in real time after creating a data we could delete it by calling delete data (if duplicate value is not allowed)*/

    }


//---------------2. Parametarized the API Tests with multiple data sets in Add Book API-------------------------

@Test(dataProvider = "BookData")
    public void addBook1(String isbn, String aisle) {

        RestAssured.baseURI = "http://216.10.245.166";
        String response =
                given().header("Content-Type", "application/json").body(payload.addBook(isbn, aisle)).
                 when().post("Library/Addbook.php").
                 then().assertThat().statusCode(200).
                 extract().response().asString();
        JsonPath js = ReUsableMethods.rawToJson(response);
        String BookId = js.getString("ID");
        System.out.println("BookId : " + BookId);

    }

@DataProvider(name= "BookData")
    public Object[][] getData(){

    //array : collection of element
    // Multidimensional array : Collection of arrays
    return new Object[][]{{"dgdg", "546"}, {"dsfdsg", "453"}, {"rtey", "354"}};
}


}
