package CRUD_Operations_WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {

	@Test
	public void createProjectTest() {
		//Step-1:Create required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "SDETTYSS");
		jobj.put("Status", "Created");
		jobj.put("Teamsize", "12");
		
		//Step-2:Send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_403");
		
		//Step-3:Validate the response
		System.out.println(resp.prettyPeek());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		System.out.println(resp.getSessionId());
		System.out.println(resp.contentType());
		
		ValidatableResponse valid = resp.then();
		valid.log().all();
	}
}
