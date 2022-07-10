package DifferentWaysToPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUsingJsonFile {

	@Test
	public void createProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		File file = new File("./src/test/resources/RestBody.json");
		
		given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().log().all();
	}
}
