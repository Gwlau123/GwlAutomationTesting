package operator;

public class UnaryOperator {

	public static void main(String[] args) {
		int weight = 50;

		System.out.println(weight++);// 50
		
		// 51 post fix increment operator will first assign the value and then increase
		// the value by 1
		System.out.println(weight);
		
		System.out.println(++weight);// 52
		// 52 Prefix operator first increase the value by 1 and then assign the value

		int age = 10;
		
		System.out.println(age--);// 10
		// 9 post fix decrement operator will first assign the value and then decrease
		// value by -1
		
		System.out.println(--age);// 8
		// 8 Prefix decrement operator will first decrease the value by -1 and then
		// assign the value

	}

}
