package project;

//import java.util.HashMap;
//import java.util.Map;

public enum Gender {
	
	MALE("male"), FEMALE("female"), NA("N/A");
	
	final String value;
	
	private Gender(String value) {
		this.value = value;
	}
	
//	public static Map<String, Gender> lookup = new HashMap<>();
//	static {
//		for(Gender gender: Gender.values()) {
//			lookup.put(gender.getValue(), gender);
//		}
//	}
//
//	public String getValue() {
//		return value;
//	}
//	
//	public static Gender get(String value) {
//		return lookup.get(value);
//	}
}
