package abstraction;

public class CustomerInfo implements AccountHolder {

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

	@Override
	public void rbiBank() {
		System.out.println("All banks working under the guidlines of RBI bank in Indian");
		
	}

	@Override
	public void CustA() {
		System.out.println("Mr John Deago is saving account holder in SBI bank.");
		
	}
	
	public static void main(String[] args) {
		CustomerInfo ci = new CustomerInfo();
		ci.saving();
		ci.current();
		ci.joint();
		ci.rbiBank();
		ci.CustA();
	}

}
