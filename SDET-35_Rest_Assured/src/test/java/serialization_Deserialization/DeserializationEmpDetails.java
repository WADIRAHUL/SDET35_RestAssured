package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmployeeDetails;

public class DeserializationEmpDetails {

	public static void main(String[] args) throws Exception{
		//Step 1: Create object of objectMapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step-2: Call the readValue method & store in the variable
		EmployeeDetails e1 = obj.readValue(new File("./target/EmpDetails.json"), EmployeeDetails.class);
		
		//Step-3: Using getters & setters access the variable
		System.out.println(e1.getDesignation());
		System.out.println(e1.getEamil());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getPhNo());
	}
}
