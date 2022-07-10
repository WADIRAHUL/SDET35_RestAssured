package serialization_Deserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialization_Deserialization.EmployeeDetailsObject;
import pojoForSerialization_Deserialization.Spouse;

public class SerializationEmpDetailsObject {

	public static void main(String[] args) throws Exception{
		
		//Step-1: Create object of pojo class & intialize
		int [] p1 = {1254, 25423};
		Spouse sp =new Spouse("S234", 124, "TYSS");
		EmployeeDetailsObject emp = new EmployeeDetailsObject("Rahul", "TY1466", "Sr TE", p1, sp); 
				
		//Step-2: Create object of object mapper class
		ObjectMapper obj = new ObjectMapper();
		
		//Step-3: From object mapper call the method writeValue()
		obj.writeValue(new File("./target/EmpDetailsObject.json"), emp);
				
	}
}
