package strings;

public class StringExamples {
	
	public static void main(String[] args) {
		String s1 = "Automation";
		String s2 = "Automation";
		String s3 = new String("automation");
		String s4 = "  Automation    Tester    ";

		System.out.println("--------------------");
		System.out.println(s1==s2);
		System.out.println(s3==s2);

		System.out.println("--------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s3.equalsIgnoreCase(s2));

		System.out.println("--------------------");
		System.out.println(s1.charAt(0));
		
		System.out.println("--------------------");
		System.out.println(s1.length());
		
		System.out.println("--------------------");
		System.out.println(s1.indexOf('a'));	
		
		System.out.println("--------------------");
		System.out.println(s1.contains("tion"));
		
		System.out.println("--------------------");
		s1 = s1.replace("tion", "torsion");
		System.out.println(s1+"SSR");
		String s5 = s1.replace("tion", "tor");
		System.out.println(s5);
		System.out.println(s1);
		
		System.out.println("--------------------");
		System.out.println(s4.trim());
		
		System.out.println("--------------------");
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		System.out.println("--------------------");
		String i1 = "1";
		int i2 = Integer.parseInt(i1);

		System.out.println(i2+10);

		String i3 = "1";
		double i4 = Double.parseDouble(i3);
		
		System.out.println(i4+10);

		
	}
	
}
