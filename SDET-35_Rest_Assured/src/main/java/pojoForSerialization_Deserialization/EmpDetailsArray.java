package pojoForSerialization_Deserialization;

public class EmpDetailsArray {

	//Step-1: Declare all variables as global
	String empName;
	String empId;
	String [] empEmail;
	int [] empPhno;
	
	//Step-2:Create a constructor
	public EmpDetailsArray(String empName, String empId, String[] empEmail, int[] empPhno) {
		this.empName = empName;
		this.empId = empId;
		this.empEmail = empEmail;
		this.empPhno = empPhno;
	}
	
	//Create an empty constructor
	public EmpDetailsArray() {
		
	}
	
	//Step-3 Provide getters & setters to access these variables
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String[] getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String[] empEmail) {
		this.empEmail = empEmail;
	}

	public int[] getEmpPhno() {
		return empPhno;
	}

	public void setEmpPhno(int[] empPhno) {
		this.empPhno = empPhno;
	}
}
