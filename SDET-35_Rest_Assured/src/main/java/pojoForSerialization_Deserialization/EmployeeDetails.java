package pojoForSerialization_Deserialization;

/**
 * This is a pogo class to store Employee Details
 * @author rahul
 *
 */
public class EmployeeDetails {

	//Step-1: Declare all the necessary variables as global
	String empName;
	String empId;
	String eamil;
	int phNo;
	String designation;
	
	//Step-2: Create a constructor to initialize these variable
	public EmployeeDetails(String empName, String empId, String eamil, int phNo, String designation) {
		this.empName = empName;
		this.empId = empId;
		this.eamil = eamil;
		this.phNo = phNo;
		this.designation = designation;
	}
	
	//Create an empty constructor for deserialization
	public EmployeeDetails()
	{
		
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

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public int getPhNo() {
		return phNo;
	}

	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
}
