package encapsulation;

public class Cat {
	
	protected String name;
	
	//TODO Made this public
	public int height;
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	
	/**
	 * Setting the height in inches
	 */
	public void setHeight(int height) {
		if (height >= 5 && height <= 10) {
			this.height = height;	
		}
	}
	
}
