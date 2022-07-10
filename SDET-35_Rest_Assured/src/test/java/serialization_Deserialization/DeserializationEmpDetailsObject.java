package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmployeeDetailsObject;

public class DeserializationEmpDetailsObject {

	public static void main(String[] args) throws Exception{
		//Step 1: Create object of objectMapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step-2: Call the readValue method & store in the variable
		EmployeeDetailsObject e1 = obj.readValue(new File("./target/EmpDetailsObject.json"), EmployeeDetailsObject.class);
				
		//Step-3: Using getters & setters access the variable
		System.out.println(e1.getDesignation());
		System.out.println(e1.getDesignation());
		System.out.println(e1.getPhNo()[0]);
		System.out.println(e1.getSpouse());
	}
}
