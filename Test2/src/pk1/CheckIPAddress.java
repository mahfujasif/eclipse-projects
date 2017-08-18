package pk1;

import java.util.regex.Pattern;

class Test{
	private static final Pattern PATTERN = Pattern.compile(
	        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	boolean ck(String ip) {
		return PATTERN.matcher(ip).matches();
	}
	
}

public class CheckIPAddress {
	public static void main(String args[]) {
		Test t = new Test();
		String ip = "12.35.6h6.45";
		if(t.ck(ip))
			System.out.println("ok");
		else {
			System.out.println("wrong");
		}
	}
}
