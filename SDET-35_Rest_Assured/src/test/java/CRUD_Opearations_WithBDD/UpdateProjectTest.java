package CRUD_Opearations_WithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectTest {

	@Test
	public void updateProject() {
		baseURI = "http://localhost";
		port = 8084;
		//Step-1:Create the required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "Sony");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 15);
		
		given().body(jobj).contentType(ContentType.JSON)
		.when().put("/projects/TY_PROJ_404")
		.then().assertThat().statusCode(200)
		.log().all();
		 
	}
}
