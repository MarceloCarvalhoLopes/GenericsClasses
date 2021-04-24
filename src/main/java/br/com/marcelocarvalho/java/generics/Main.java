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
		
		
		
	}

}
