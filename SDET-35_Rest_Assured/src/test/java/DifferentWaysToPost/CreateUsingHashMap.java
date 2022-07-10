package DifferentWaysToPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateUsingHashMap {

	@Test
	public void createProject() {

		baseURI = "http://localhost";
		port = 8084;
		//Step-1:Create data
		HashMap jobj = new HashMap();
		jobj.put("createdBy", "Rahul");
		jobj.put("projectName", "EPS");
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);

		//Step-2:Send the request
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
	}
}
