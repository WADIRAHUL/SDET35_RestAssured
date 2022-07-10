package CRUD_Operations_WithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProject {

	@Test
	public void getParticularProjectTest() {
		//Step-1:Create required data
		
		//Step-2:Send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_402");
		
		//Step-3:Validate the response
		System.out.println(resp.statusCode());
		ValidatableResponse valid = resp.then();
		valid.log().all();
		valid.assertThat().statusCode(204);
	}
}
