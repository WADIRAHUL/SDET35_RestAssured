package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmpDetailsArray;

public class DeserializationEmpDetailsArray {

	public static void main(String[] args) throws Exception{
		//Step 1: Create object of objectMapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step-2: Call the readValue method & store in the variable
		EmpDetailsArray e1 = obj.readValue(new File("./target/EmpDetailsArray.json"), EmpDetailsArray.class);
				
		//Step-3: Using getters & setters access the variable
		
		System.out.println(e1.getEmpPhno()[0]);
		System.out.println(e1.getEmpEmail()[1]);
		System.out.println(e1.getEmpName());
		System.out.println(e1.getEmpId());
	}
}
