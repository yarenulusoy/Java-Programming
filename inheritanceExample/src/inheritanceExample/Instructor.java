package inheritanceExample;

public class Instructor extends User{

	private int studentNumber;
	private String branshName;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getBranshName() {
		return branshName;
	}
	public void setBranshName(String branshName) {
		this.branshName = branshName;
	}

	
}
