package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

    // this method is for converting String raw what we got into Json
public static JsonPath rawToJson(String response){
    JsonPath js1 = new JsonPath(response);
    return js1;
}

}
