package com.kn.Composition;

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Page 1 has introduction");
		book.readBook();
		
		book = null;
		
		
	}

}
