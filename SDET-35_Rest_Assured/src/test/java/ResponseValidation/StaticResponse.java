package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class StaticResponse {

	@Test
	public void staticResponse() {
		baseURI = "http://localhost";
		port = 8084;
		
		String expData = "TY_PROJ_003";
		//Send the request
		Response resp = when().get("/projects");
	
		//Validate the response
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData, actData);
		System.out.println(resp.time());
		resp.then().assertThat().time(Matchers.lessThan(2500L), TimeUnit.MILLISECONDS)
		.log().all();
	}
}
