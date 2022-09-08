package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public void hashSet() {
		Set s =new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add("Galaxy");
		s.add('c');
		System.out.println(" \n Hash Set --\n " +s);	
	}
	public void linkedhashSet() {
		Set s =new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add("Galaxy");
		s.add('c');
		System.out.println(" \n Linkedhash Set --\n " +s);	
	}
	public void treeSet() {
		Set s =new TreeSet<>();
		s.add("Sachin");
		s.add("Ajay");
		s.add("Virat");
		s.add("Anand");
//		s.add(10);
//		s.add(10);
//		s.add(20);
		System.out.println(" \n Tree Set --\n " +s);	
	}
	public static void main(String[] args) {
		SetExample setExample = new SetExample();
		setExample.hashSet();
		setExample.linkedhashSet();
		setExample.treeSet();

	}

}
