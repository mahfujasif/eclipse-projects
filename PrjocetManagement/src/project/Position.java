package project;

public enum Position {
	JR("jr"), SR("sr"), TEAMLEAD("teamlead");
	
	final String value;
	
	private Position(String value) {
		this.value = value;
	}
}
