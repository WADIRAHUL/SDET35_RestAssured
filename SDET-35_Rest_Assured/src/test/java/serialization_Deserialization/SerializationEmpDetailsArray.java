package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmpDetailsArray;

public class SerializationEmpDetailsArray {

	public static void main(String[] args) throws Exception{
		
		//Step-1: Create object of pojo class & intialize
		String [] s1 = {"rahul@ty.com", "rahul12@ty.com"};
		int [] p1 = {1254, 25423};
		EmpDetailsArray emp = new EmpDetailsArray("Rahul", "TY1466", s1, p1); 
				
		//Step-2: Create object of object mapper class
		ObjectMapper obj = new ObjectMapper();
		
		//Step-3: From object mapper call the method writeValue()
		obj.writeValue(new File("./target/EmpDetailsArray.json"), emp);
				
	}
}
