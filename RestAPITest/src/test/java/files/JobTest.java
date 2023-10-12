package files;
import files.Pojo.CatApi;
import files.Pojo.JobApi;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.defaultParser;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class JobTest {
    public static void main (String [] args){

        JobApi ja = given().header("Content-Type","application/json").body(payload.JobApi()).when().post("https://reqres.in/api/users")
                .as(JobApi.class);
        System.out.println("====================="+ja.getJob());
        System.out.println("====================="+ja.getName());
    }

   /* Note : this is job  Post api here I am using pojo class to get API response
    API : POST : https
    URL ://reqres.in/api/users
    Request :
              {
                 "name": "morpheus",
                "job": "leader"
            }

    Response :
            {
                "name": "morpheus",
                    "job": "leader",
                    "id": "322",
                    "createdAt": "2023-08-30T09:55:57.372Z"
            }*/
}
