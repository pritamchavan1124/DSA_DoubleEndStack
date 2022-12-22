package com.app.core;

public class DLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL dl=new DLL();
		dl.insertAtBegining(11);
		dl.insertAtBegining(2);
		dl.insertAtBegining(15);
		dl.insertAtBegining(17);
		dl.insertAtEnd(30);
		dl.insertAtEnd(32);
		dl.display();
		System.out.println();
		System.out.println("-------------");
		dl.insertByPosition(54, 7);
		dl.display();
		System.out.println();
		System.out.println("-------------");
		//dl.deleteByPosition(7);
		//dl.deleteByValue(54);
		//dl.display();
		dl.sortDoublyList();

	}

}
