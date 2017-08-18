package com.mlbd.accountCheck.BankAccount;

import java.util.regex.Pattern;

public class CheckValidity {
	
	private static final Pattern PATTERN = Pattern.compile(
	        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	boolean check(String ip) {
		return PATTERN.matcher(ip).matches();
	}

}
