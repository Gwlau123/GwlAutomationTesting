package abstraction;

public class AccountInfo implements AccountType {
	
	public void saving() {
		System.out.println("Customer can open saving account");
		
	}

	public void current() {
		System.out.println("Customer can open current account");
		
	}

	public void joint() {
		System.out.println("Customer can open joint account");
		
	}

	public static void main(String[] args) {
		
		AccountInfo ai =new AccountInfo();
		ai.saving();
		ai.current();
		ai.joint();
		
		
	}

}
