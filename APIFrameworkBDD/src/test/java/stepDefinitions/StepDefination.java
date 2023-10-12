package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import pojo.AddBookRequest;
import resources.TestDataBuild;
import resources.Utils;

import static io.restassured.RestAssured.given;

public class StepDefination extends Utils {
    TestDataBuild TestDataBuild = new TestDataBuild();
    ResponseSpecification resspec ;
RequestSpecification res;
    Response response;
    JsonPath js;

    @Given("^I am an authorized user for library$")
    public void i_am_an_authorized_user_for_library()  {

        System.out.println("------------------");

    }

    @Given("^User have book to add$")
    public void user_have_book_to_add() throws Throwable {

        RestAssured.baseURI = "http://216.10.245.166";

    }

    @When("^User add this book to the library$")
    public void user_add_this_book_to_the_library() throws Throwable {

        response =   given().header("Content-Type","application/json").body(TestDataBuild.addBookPayload()).
                   when().post("Library/Addbook.php");

       /*      // Or
        res=given().spec(requestSpecification()).body(TestDataBuild.addBookPayload());*/

    }

    @Then("^Book is sucessfully added in library$")
    public void book_is_sucessfully_added_in_library() throws Throwable {

        String resp = response.asString();
         js = new JsonPath(resp);
        Assert.assertEquals(response.getStatusCode(),200);




    }

    @Then("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
    public void in_response_body_is(String keyValue, String expectedValue) throws Throwable {

        Assert.assertEquals(js.get(keyValue).toString(),expectedValue);





    }


}
