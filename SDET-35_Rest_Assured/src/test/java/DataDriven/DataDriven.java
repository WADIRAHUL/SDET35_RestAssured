package DataDriven;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.RmgPogoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataDriven {

	@DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Rahul";
		data[0][1] = "Dell";
		data[0][2] = "Completed";
		data[0][3] = 8;
		
		data[1][0] = "Rakesh";
		data[1][1] = "HP";
		data[1][2] = "Created";
		data[1][3] = 10;
		
		data[2][0] = "Rajesh";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 15;
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void createProject(String createdBy, String projectName, String status, int teamSize)
	{
		
		Random randm = new Random();
		int rn = randm.nextInt(500);
		RmgPogoClass pLib = new RmgPogoClass(createdBy, projectName+rn, status, teamSize);
		baseURI = "http://localhost";
		port = 8084;
		
		given().body(pLib).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().log().all();	
	}
}
