package utils;

import io.restassured.path.json.JsonPath;

public class ParseStringToJSON {
    
    
    public static JsonPath convertResponse(String payload) {
        JsonPath jsonPath = new JsonPath(payload);
        return jsonPath;
    }

}
