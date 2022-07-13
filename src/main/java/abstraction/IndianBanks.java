package abstraction;

public abstract class IndianBanks {

	
	// Normal Method or non abstract method
		public void njgBank() {
			System.out.println("We are Narmada Jhabua Bank known as NJG Bank.");     
		}

		// Concrete or abstract method
		public abstract void sbiBank();
		public abstract void boiBank();
		public abstract void bobBank();
		
		
		public static void main(String[] args) {
			
			//IndianBanks ib= new IndianBanks();
		}
		
}
