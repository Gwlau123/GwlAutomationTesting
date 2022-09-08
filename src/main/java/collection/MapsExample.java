package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

	public void hashmap() {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Delhi");
		hm.put(2, "Mumbai");
		hm.put(3, "Pune");
		hm.put(5, "Banglore");
		hm.put(4, "Kolkata");
		
		// If print all cities name
		System.out.println("\nHashMap \n"+hm);
		
		// If print Particular city name
		System.out.println(hm.get(3));
		
		for (@SuppressWarnings("rawtypes") Map.Entry nhm:hm.entrySet()) {
			System.out.println(nhm.getKey() + " " + nhm.getValue());
		}
	}
	
	public void linkedhashmap() {
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Delhi");
		lhm.put(2, "Mumbai");
		lhm.put(3, "Pune");
		lhm.put(5, "Banglore");
		lhm.put(4, "Kolkata");
		
		// If print all cities name
		System.out.println("\nLinkedHashMap \n" + lhm);
		
		// If print Particular city name
		System.out.println(lhm.get(3));
		
		for (@SuppressWarnings("rawtypes") Map.Entry nlhm:lhm.entrySet()) {
			System.out.println(nlhm.getKey() + " " + nlhm.getValue());
		}
	}
	
	public void treemap() {
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Delhi");
		tm.put(2, "Mumbai");
		tm.put(3, "Pune");
		tm.put(5, "Banglore");
		tm.put(4, "Kolkata");
		
		// If print all cities name
		System.out.println("\nTreeMap \n" + tm);
		
		// If print Particular city name
		System.out.println(tm.get(3));
		
		for (@SuppressWarnings("rawtypes") Map.Entry ntm:tm.entrySet()) {
			System.out.println(ntm.getKey() + " " + ntm.getValue());
		}
	}
	
	public void hashtable() {
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Delhi");
		ht.put(2, "Mumbai");
		ht.put(3, "Pune");
		ht.put(5, "Banglore");
		ht.put(4, "Kolkata");
		
		// If print all cities name
		System.out.println("\nHashtable \n" + ht);
		
		// If print Particular city name
		System.out.println(ht.get(3));
		
		for (@SuppressWarnings("rawtypes") Map.Entry nht:ht.entrySet()) {
			System.out.println(nht.getKey() + " " + nht.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		MapsExample mapsExample = new MapsExample();
		mapsExample.hashmap();
		mapsExample.linkedhashmap();
		mapsExample.treemap();
		mapsExample.hashtable();
		
	}

}
