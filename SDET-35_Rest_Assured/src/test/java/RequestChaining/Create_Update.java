package RequestChaining;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.RmgPogoClass;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Create_Update {

	@Test
	public void createUpdate() {

		baseURI = "http://localhost";
		port = 8084;
		Random random = new Random();
		int rn = random.nextInt(500);
		//Step-1:Create the post request and capture the response
		RmgPogoClass obj = new RmgPogoClass("Rahul", "Simple+"+rn, "Created", 10);
		Response resp = given().body(obj).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		//Step-2:Using json path retrieve projectId from the response
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid,true);
		resp.then().log().all();
		
		//Step-3:Use this projectId for another request
		RmgPogoClass obj1 = new RmgPogoClass("Rahul", "Simple+"+rn, "Completed", 10);
		given().body(obj1).contentType(ContentType.JSON).pathParam("Id", pid)
		.when().put("/projects/{Id}")
		.then().assertThat().statusCode(200)
		.log().all();
	}
}
