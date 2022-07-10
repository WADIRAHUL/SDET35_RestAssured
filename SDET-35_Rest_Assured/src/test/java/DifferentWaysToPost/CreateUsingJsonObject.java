package DifferentWaysToPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class CreateUsingJsonObject {

	@Test
	public void createProject() {

		baseURI = "http://localhost";
		port = 8084;
		//Step-1:Create data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "Amdocs12");
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);

		//Step-2:Send the request
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().log().all();
	}
}
