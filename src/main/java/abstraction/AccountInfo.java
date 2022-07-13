package abstraction;

public class AccountInfo implements AccountType {
	
	@Override
	public void saving() {
		System.out.println("Customer can opend saving account");
		
	}

	@Override
	public void current() {
		System.out.println("Customer can opend current account");
		
	}

	@Override
	public void joint() {
		System.out.println("Customer can opend joint account");
		
	}

	public static void main(String[] args) {
		
		AccountInfo ai =new AccountInfo();
		ai.saving();
		ai.current();
		ai.joint();
		
		
	}

}
