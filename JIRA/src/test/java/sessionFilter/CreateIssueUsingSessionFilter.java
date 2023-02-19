package sessionFilter;

import static io.restassured.RestAssured.given;

import java.io.File;

import groovy.lang.Newify;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import payloads.Payloads;
import utils.ParseStringToJSON;

public class CreateIssueUsingSessionFilter {
	
	
	
	public static void main(String[] args) {
		SessionFilter session = new SessionFilter();
		
		RestAssured.baseURI = "http://localhost:8080";
		
			given()
				.headers("Content-Type","application/json")
				.body(Payloads.loginPayload())
				.filter(session)
			.when()
				.post("/rest/auth/1/session")
			.then()
				.extract().response().asPrettyString();
			
			String projectID = "AT";
			String issueSummary = "Issue created and file uploaded using Session filter";
			String issueDescription = "Description by Session filter(JAVA Eclipse)";
			String issueName = "Bug";	
		
			String issueResponse = given()
			.headers("Content-Type","application/json")
			.body(Payloads.createIssuePayload(projectID,issueSummary,issueDescription,issueName))
			.filter(session)
			.when()
			.post("/rest/api/2/issue")
			
	  .then()
			.extract().response().asPrettyString();
			
			
			JsonPath jsonPath = ParseStringToJSON.convertResponse(issueResponse);
			String key = jsonPath.getString("key");
			
			String comment = "Button is disabled by default from Session Filter and updated text file";
			given()
				.pathParam("key",key)
				.headers("Content-Type","application/json")
				.body(Payloads.commentPayload(comment))
				.filter(session)
		   .when()
				.post("/rest/api/2/issue/{key}/comment")
		   .then()
				.extract()
				.response()
				.asPrettyString();
			;
			
			//Add attachememnt
			
			String filePath = System.getProperty("user.dir")+"//jira.txt";
			
			given()
			.relaxedHTTPSValidation()
				.header("X-Atlassian-Token","no-check")
				.header("Content-Type","multipart/form-data")
				.pathParam("key",key)
				.filter(session)
				.multiPart("file",new File(filePath))
			.when()
				.post("/rest/api/2/issue/{key}/attachments")
			.then()
				.assertThat().statusCode(403);   //Here 403 because file uploading is disabled.
	}

}
