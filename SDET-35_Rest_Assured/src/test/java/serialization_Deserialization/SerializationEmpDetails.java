package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmployeeDetails;

public class SerializationEmpDetails {

	public static void main(String[] args) throws Exception{
		
		//Step-1: Create object of pojo class & initialize
		EmployeeDetails emp = new EmployeeDetails("Rahul", "ty1468", "rahul@ty.com", 123456789, "Sr TE");
		
		//Step-2: Create object of objectMapper class
		ObjectMapper obj = new ObjectMapper();
		
		//Step-3: From object mapper call the method writeValue()
		obj.writeValue(new File("./target/EmpDetails.json"), emp);
				
	}
}
