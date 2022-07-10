package pojoForSerialization_Deserialization;

public class Spouse {

	String name;
	int sphone;
	String sComp;
	
	public Spouse(String name, int sphone, String sComp) {
		this.name = name;
		this.sphone = sphone;
		this.sComp = sComp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSphone() {
		return sphone;
	}
	public void setSphone(int sphone) {
		this.sphone = sphone;
	}
	public String getsComp() {
		return sComp;
	}
	public void setsComp(String sComp) {
		this.sComp = sComp;
	}
	
	
}
