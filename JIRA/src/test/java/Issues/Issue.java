package Issues;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import login.Login;
import payloads.Payloads;
import utils.ParseStringToJSON;

public class Issue {
	
	public static String createIssue(String sessionID,String projectID,String issueSummary,String issueDescription,String issueName) {
		String createIssueResp = 
			given()
				.headers("cookie","JSESSIONID="+sessionID)
				.headers("Content-Type","application/json")
				.body(Payloads.createIssuePayload(projectID,issueSummary,issueDescription,issueName))
				
		  .when()
				.post("/rest/api/2/issue")
				
		  .then()
				.extract().response().asPrettyString();
		
			return createIssueResp;
	}
	
	public static String addComment(String sessionID,String key,String comment) {
		String commentResp = given()
			.pathParam("key",key)
			.headers("cookie","JSESSIONID="+sessionID)
			.headers("Content-Type","application/json")
			.body(Payloads.commentPayload(comment))
				
		.when()
			.post("/rest/api/2/issue/{key}/comment")
		
			.then()
				.extract()
				.response()
				.asPrettyString();
			;
			
			return commentResp;
	}
	
	public static void main(String[] args) {
		//login is done
		String sessionID = Login.getSessionID();
		RestAssured.baseURI = "http://localhost:8080";
		
		String projectID = "AT";
		String issueSummary = "Button is not clickable(EJ)Mod";
		String issueDescription = "Upon clicking button no action is happened(JAVA Eclipse)";
		String issueName = "Bug";	
		
		//Issue is created
		String createIssueResponse = Issue.createIssue(sessionID,projectID,issueSummary,issueDescription,issueName);
		JsonPath jsonPath = ParseStringToJSON.convertResponse(createIssueResponse);
		String key = jsonPath.getString("key");
		
		String comment = "Button is disabled by default";
		
		//Comment is added
		String commentResponse = Issue.addComment(sessionID, key, comment);
		
		JsonPath js = ParseStringToJSON.convertResponse(commentResponse);
		
		String commentBody = js.getString("body");
		
		//Comment added is validated
		Assert.assertEquals(commentBody, comment);	
	}
	
	
	

}
