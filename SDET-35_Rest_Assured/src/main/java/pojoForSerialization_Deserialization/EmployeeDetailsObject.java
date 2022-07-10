package pojoForSerialization_Deserialization;

/**
 * This is a pogo class to store Employee Details
 * @author rahul
 *
 */
public class EmployeeDetailsObject {

	//Step-1: Declare all the necessary variables as global
	String empName;
	String empId;
	String designation;
	int [] phNo;
	Object spouse;

	//Step-2: Create a constructor to initialize these variable
	public EmployeeDetailsObject(String empName, String empId, String designation, int[] phNo, Object spouse) {
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
		this.phNo = phNo;
		this.spouse = spouse;
	}

	//Create an empty constructor for deserialization
	public EmployeeDetailsObject()
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int[] getPhNo() {
		return phNo;
	}

	public void setPhNo(int[] phNo) {
		this.phNo = phNo;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
}
