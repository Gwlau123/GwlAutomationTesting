package abstraction;

public class AllBanks implements ReserveBank, AccountType {

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

	@Override
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
