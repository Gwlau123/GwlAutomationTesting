package abstraction;

public class IndBanklist extends IndianBanks {
	
	@Override
	public void sbiBank() {
		System.out.println("We are State Bank Of India known as SBI Bank.");
		
	}

	@Override
	public void boiBank() {
		System.out.println("We are Bank Of India known as BOI Bank.");
		
	}

	@Override
	public void bobBank() {
		System.out.println("We are Bank Of Badoda known as BOB Bank.");
		
	}
	
	public static void main(String[] args) {
		
		IndianBanks indbl = new IndBanklist();
		
		indbl.sbiBank();
		indbl.boiBank();
		indbl.bobBank();
		indbl.njgBank();
	}

}
