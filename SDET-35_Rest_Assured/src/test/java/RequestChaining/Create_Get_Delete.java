package RequestChaining;

import java.util.Random;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.RmgPogoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Create_Get_Delete {

	@Test
	public void createGetDeleteTest() {

		baseURI = "http://localhost";
		port = 8084;
		Random random = new Random();
		int rn = random.nextInt(500);
		//Step-1:Create the post request and capture the response
		RmgPogoClass obj = new RmgPogoClass("Rahul", "TYSSS-"+rn, "Created", 10);
		Response resp = given().body(obj).contentType(ContentType.JSON)
		.when().post("/addProject");
				
		//Step-2:Using json path retrieve projectId from the response
		String pid = resp.jsonPath().get("projectId");
		Reporter.log(pid,true);
		resp.then().log().all();
		
		//Step-3:Use this projectId for another request
//		when().get("projects/"+pid).then().log().all();we can use this also but we can't add path parameter
		given().pathParam("proId", pid)
		.when().get("/projects/{proId}")
		.then().assertThat().statusCode(200)
		.log().all();
		
		//Step-4:Use this projectId for delete 
		given().pathParam("prjId", pid)
		.when().delete("/projects/{prjId}")
		.then().assertThat().statusCode(200)
		.log().all();
	}
}
