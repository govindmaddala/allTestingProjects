package payloads;

public class Payloads {
	
	public static String loginPayload() {
		String credentials = "{\r\n"
				+ "  \"username\": \"maddala.govind2107\",\r\n"
				+ "  \"password\": \"123456789\"\r\n"
				+ "}";
		
		return credentials;
	}
	
	public static String createIssuePayload(String key, String summary, String description, String issueName) {
		String issuePayload = "{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \""+key+"\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \""+summary+"\",\r\n"
				+ "        \"description\":\""+description+"\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \""+issueName+"\"\r\n"
				+ "        } \r\n"
				+ "    }\r\n"
				+ "}";
		return issuePayload;
	}
	
	public static String commentPayload(String body) {
		String commentPayloadString = "{\r\n"
				+ "    \"body\": \""+body+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
		
		return commentPayloadString;
	}

}
