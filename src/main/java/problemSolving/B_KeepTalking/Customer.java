package problemSolving.B_KeepTalking;

public class Customer {

	private String name;
	private int seconds;
	private int billAmount;
	private TarrifPlan plan;
	
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public TarrifPlan getPlan() {
		return plan;
	}
	public void setPlan(TarrifPlan plan) {
		this.plan = plan;
	}
	
}
