package br.com.marcelocarvalho.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Buffer<T> {

	private List<T> list = new ArrayList<>();
	
	public void add(T element) {
		list.add(element);
	}
	
	public T remove() {
		T element = list.get(0);
		list.remove(0);
		return element;
	}
	
}
