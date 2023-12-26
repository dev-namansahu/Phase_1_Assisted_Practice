package practice_projects;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
public class Collections {
	 public static void main(String[] args) {
	        // ArrayList example
	        System.out.println("ArrayList Example:");
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // LinkedList example
	        System.out.println("\nLinkedList Example:");
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(10);
	        linkedList.add(20);
	        linkedList.add(30);

	        for (Integer number : linkedList) {
	            System.out.println(number);
	        }

	        // HashSet example
	        System.out.println("\nHashSet Example:");
	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Red");
	        hashSet.add("Green");
	        hashSet.add("Blue");

	        for (String color : hashSet) {
	            System.out.println(color);
	        }

	        // HashMap example
	        System.out.println("\nHashMap Example:");
	        HashMap<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);

	        // Iterating through the keys
	        System.out.println("Keys:");
	        for (String key : hashMap.keySet()) {
	            System.out.println(key);
	        }

	        // Iterating through the values
	        System.out.println("\nValues:");
	        for (int value : hashMap.values()) {
	            System.out.println(value);
	        }

	        // Iterating through both keys and values using entrySet
	        System.out.println("\nEntries:");
	        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

}
