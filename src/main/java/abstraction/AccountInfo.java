package abstraction;

public class AccountInfo implements AccountType {
	
	@Override
	public void saving() {
		System.out.println("Customer can open saving account");
		
	}

	@Override
	public void current() {
		System.out.println("Customer can open current account");
		
	}

	@Override
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
