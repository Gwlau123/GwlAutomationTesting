package problemSolving.B_KeepTalking;

public class Runner {

	public static void main(String[] args) {
		
		KeepTalking company = new KeepTalking();

		company.createPlan("planA",10);
		
		company.createPlan("planB",15);
		
		company.createCustomer("Shailendra","planA");
		
		company.createCustomer("Vijay","planB");
		
		company.calcBill("Shailendra",12000);
		
		company.calcBill("Vijay",1000);
		
		company.countCustomersByPlan("planA");
		
		company.countCustomersByPlan("planB");
		
		company.getCustomerWithMaxBill();
		
	}	
	
}
