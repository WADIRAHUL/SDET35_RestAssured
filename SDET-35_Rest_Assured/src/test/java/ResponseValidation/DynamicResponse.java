package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponse {

	@Test
	public void staticResponse() {
		baseURI = "http://localhost";
		port = 8084;
		String expData = "TY_PROJ_003";
		
		//Send the request
		Response resp = when().get("/projects");
		
		//Validate the response
		Boolean flag = false;
		List<String> lst = resp.jsonPath().get("projectId");
		for (String l1 : lst) {
			if (l1.equalsIgnoreCase(expData)) {
				flag = true;//flag rising
				break;
			}
		}
		System.out.println(resp.time());//To print the response time
		resp.then().assertThat().time(Matchers.lessThan(2500L), TimeUnit.MILLISECONDS)
		.log().all();
		Assert.assertTrue(flag);
	}
}
