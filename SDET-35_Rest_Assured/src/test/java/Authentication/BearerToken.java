package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	public void bearerTokenTest() {
		baseURI = "https://api.github.com";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "RMGYANTRA");
		jobj.put("description", "Rest WebService");
		
		given().auth().oauth2("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")
		.body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().assertThat().statusCode(201).log().all();
	}
}
