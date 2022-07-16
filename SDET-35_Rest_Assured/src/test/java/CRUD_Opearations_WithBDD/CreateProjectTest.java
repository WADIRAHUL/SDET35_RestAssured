package CRUD_Opearations_WithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {

	@Test
	public void createProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		//Step-1:Create the required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "Sony");
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);
		
		
		//Step-2:Send the request
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
	}
}
