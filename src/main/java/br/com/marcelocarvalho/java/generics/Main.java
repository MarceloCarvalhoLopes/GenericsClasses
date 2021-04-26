package br.com.marcelocarvalho.java.generics;

public class Main {

	public static void main(String[] args) {


		Buffer<String> s = new Buffer<>();
		s.add("a");
		s.add("b");
		s.add("c");

		String e1 = s.remove();
		String e2 = s.remove();
		String e3 = s.remove();
		
		System.out.println(e1 +", " + e2 + ", " + e3 );
		
		/*************************************************/
		
		Buffer<Integer> i = new Buffer<>();
		
		i.add(10);
		i.add(15);
		i.add(20);
		
		int e4 = i.remove();
		int e5 = i.remove();
		int e6 = i.remove();
		
		System.out.println(e4 +", " + e5 + ", " + e6 );
		
		/*************************************************/

		// Creat a Map where the keys are Integer and the values are Strings
		Map<Integer, String> map = new Map<Integer, String>(); 
		
		//Put the elements on Map
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(1, "X"); // Change the key value 1 "A" to "X"
		
		//print the values
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5)); // print null because the key doesn't exist
		
		
	}

}
