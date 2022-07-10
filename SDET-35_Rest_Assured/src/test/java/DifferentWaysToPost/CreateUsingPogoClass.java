package DifferentWaysToPost;

import ProjectLibrary.RmgPogoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

public class CreateUsingPogoClass {

	@Test
	public void createProject() {

		baseURI = "http://localhost";
		port = 8084;
		Random random = new Random();
		int rn = random.nextInt(500);
		
		RmgPogoClass obj = new RmgPogoClass("Rahul", "Simple-"+rn, "Created", 10);
		given().body(obj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201)
		.log().all();
	}
}
