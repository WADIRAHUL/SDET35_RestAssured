package CRUD_Operations_WithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

	@Test
	public void createProjectTest() {
		//Step-1:Create required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "TYSS_SDET1");
		jobj.put("Status", "Created");
		jobj.put("Teamsize", "12");
		
		//Step-2:Send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");
		
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
