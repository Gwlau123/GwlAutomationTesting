package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public void arrayLists() {
		List l = new ArrayList();
		l.add(10);
		l.add("Galaxy");
		l.add('c');
		l.add(50f);
		l.add(10);
		System.out.println(l);
	}
	public void linkedlists() {
		List l = new LinkedList();
		l.add(10);
		l.add("Galaxy");
		l.add('c');
		l.add(50f);
		l.add(10);
		System.out.println(l);
		
		//Create one more duplicate list
		
		List k = new LinkedList();
			k.add("One");
			k.add("Two");
			k.add("Three");
			k.add("Four");
			k.add("Five");	
		System.out.println(k);
			
		// add all values K list in l list
		l.addAll(k);
		System.out.println(" \n New list --\n " + l);
		
		// Replace a specific value in list l we use set
		l.set(4, 500);
		System.out.println("\n updated list --\n " + l);
		
		// Remove any particular value from list 
		l.remove(1);
		System.out.println(" \n updated list after removing a particular value--\n " + l);
		
		// Remove all values
		l.removeAll(k);
		System.out.println("\n After removed all values --\n" +k);
		
		l.removeAll(l);
		System.out.println("\n After removed all values --\n" +l);
		
	}
	public static void main(String[] args) {
		ListExample listExample = new ListExample();
		listExample.arrayLists();
		listExample.linkedlists();

	}

}
