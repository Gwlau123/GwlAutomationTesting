package javaLoopsAndStatements;

public class forEachLoop {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		char[] arr2 = {'a','b','c','d'};
		String[] arr3 = {"str1","str2","str3","str4"};
		Object[] arr4 = {arr1,arr2,arr3};

		System.out.println("Integer Loop:");
		
		for(int num:arr1) {
			System.out.println(num);
		}

		System.out.println("\nCharacter Loop:");
		
		for(char ch:arr2) {
			System.out.println(ch);
		}

		System.out.println("\nString Loop:");
		
		for(String str:arr3) {
			System.out.println(str);
		}

		System.out.println("\nObject Loop:");

		for(Object obj:arr4) {
			System.out.println(obj);
		}
	}
}
