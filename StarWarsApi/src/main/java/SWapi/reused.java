package SWapi;

import io.restassured.path.json.JsonPath;

public class reused {
    public static JsonPath rawToJson(String response){
        JsonPath js = new JsonPath(response);
        return js;
    }
}


