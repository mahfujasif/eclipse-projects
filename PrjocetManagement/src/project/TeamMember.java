package project;

public class TeamMember {
	
	String employeeID;
	
	Employees employees = new Employees();
	
	public TeamMember(String employeeID) {
		this.employeeID = employeeID;
		employees.level=Level.L1;
	}
	
	public void setGender(String value) {
		employees.gender = Gender.valueOf(value);
	}
	
	public void setPosition(String value) {
		employees.position = Position.TEAMLEAD;
	}
	
	
}
