package comments;

/**
 * This class is created to demonstrate how to use the java comments 
 * @author Nancy
 * */
public class JavaComments {

	// This is a simple single line comment
	
	/*
	 * Hello Fellas
	 * This is a simple multiline comment example
	 * */
	
	//TODO this is a todo comment, which you can add to remind something which you want to do later in this code file
	
	/**
	 * <p>
	 * This is a java doc comment, 
	 * which is a very powerful way to let other readers know what your 
	 * code is supposed to do.
	 * 
	 * <p>
	 * People can read this java doc comment, even without opening the file containing it(Eclipse feature)
	 * You can add more relevant informations as well
	 * 
	 * <p>
	 * You can use some html syntax to make it more readable, see below example
	 * 
	 * <p>
	 * <table border="1">
	 * <tbody>
	 * <tr>
	 * <th>Element Clickable</th>
	 * <th>Timeout</th>
	 * <th>Return</th>
	 * </tr>
	 * <tr>
	 * <td>Yes</td>
	 * <td>No</td>
	 * <td>True</td>
	 * </tr>
	 * <tr>
	 * <td>No</td>
	 * <td>Yes</td>
	 * <td>False</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * @author Nancy
	 * @param data String
	 * @return String This method will return Hello + given data
	 * */
	public String myMethod(String data) {
		return "Hello "+ data;
	}
	
	/**
	 * Plain old main method to execute {@link #myMethod(String)}
	 * */
	public static void main(String args[]){
		JavaComments jc = new JavaComments();
		System.out.println(jc.myMethod("World"));
	}
	
}
