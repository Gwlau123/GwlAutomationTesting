package encapsulation;

public class Snake {

	private String name;

	// TODO made this public
	public int length;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	/**
	 * Setting the length in feet
	 */
	public void setLength(int length) {
		if (length > 1 && length < 100) {
			this.length = length;
		}

	}

}
