package package1;

import java.lang.reflect.Method;
//import java.lang.annotation.*;

public class teamMember implements Employee{
	
	teamMember(){
		try{
			check();
		}
		catch(Exception exception) {
			
		}
	}
	
	boolean valid(String account) {
		if(account!=null)
			return true;
		else
			return false;
	}
	
	void check() throws Exception{
		
		String Account;
		
		teamMember member = new teamMember();
		
		Method method = member.getClass().getMethod("bank_account");
		AccountCheck accountCheck = method.getAnnotation(AccountCheck.class);
		Account = accountCheck.Account();
		if(!valid(Account)) {
			System.out.println("Invalid bank account");
			
		}
	}
	
	@AccountCheck(Account="22.33.55.66")
	public void bank_account() {
		System.out.println("abc");
	}
}
