package abstraction;

public class AllBanks implements ReserveBank, AccountType {

	
	public void saving() {
		System.out.println("Customer can open saving account");
		
	}

	
	public void current() {
		System.out.println("Customer can open current account");
		
	}

	
	public void joint() {
		System.out.println("Customer can open joint account");
		
	}

	
	public void rbiBank() {
		System.out.println("All banks working under the guidlines of RBI bank in Indian");
		
	}

	public static void main(String[] args) {
		AllBanks ab = new AllBanks();
		ab.saving();
		ab.current();
		ab.joint();
		ab.rbiBank();
	
}
	
}
