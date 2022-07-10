
 package RequestChaining;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.RmgPogoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectAndGet {

	@Test
	public void createProject() {

		baseURI = "http://localhost";
		port = 8084;
		Random random = new Random();
		int rn = random.nextInt(500);
		//Step:Create the post request and capture the response
		RmgPogoClass obj = new RmgPogoClass("Rahul", "Simple-"+rn, "Created", 10);
		Response resp = given().body(obj).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		//Step-2:Using json path retrieve projectId from the response
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid,true);
		
		//Step-3:Use this projectId for another request
		given().pathParam("proId", pid)
		.when().get("/projects/{proId}")
		.then().assertThat().statusCode(200)
		.log().all();
	}
}
