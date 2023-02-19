package login;

//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payloads.Payloads;

import static io.restassured.RestAssured.*;

public class Login {
	
	
	public static String getSessionID() {
		RestAssured.baseURI = "http://localhost:8080";
		
		String resp = 
			given()
				.headers("Content-Type","application/json")
				.body(Payloads.loginPayload())
			.when()
				.post("/rest/auth/1/session")
			.then()
				.extract().response().asPrettyString();
		
		JsonPath js = new JsonPath(resp);
		String sessionCookieID = js.getString("session.value");
		return sessionCookieID;	
	}
}
