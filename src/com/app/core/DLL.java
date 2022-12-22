package com.app.core;

public class DLL {
	private Node head;

	public DLL() {
		head = null;
	}

	@SuppressWarnings("unused")
	public boolean insertAtBegining(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
			return true;
		}
	}

	@SuppressWarnings("unused")
	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node lastNode = head;
		while (lastNode.getNext() != null) {
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(newNode);
		newNode.setPrev(lastNode);

		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	@SuppressWarnings("unused")
	public boolean insertByPosition(int data, int position) {
		Node newNode = new Node(data);
		Node prev = head;
		Node temp = head;
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		}
		if (position == 1) {
			insertAtBegining(data);
			return true;
		}
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				System.out.println("Invalid ..");
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		newNode.setPrev(prev);

		return true;
	}

	public boolean deleteByPosition(int position) {
		Node del = head;
		Node prev = head;
		if (head == null) {
			System.out.println("DLL is empty");
			return false;
		}
		if (position <= 0 || head == null) {
			return false;
		}
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		}
		if (prev.getNext().getNext() != null) {
			prev.getNext().getNext().setPrev(prev);
			prev.setNext(prev.getNext().getNext());
		} else {
			prev.setNext(null);
		}
		return true;
	}

	public boolean deleteByValue(int data) {
		Node del = head;
		Node prev = head;
		if (head == null) {
			System.out.println("DLL is empty");
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			head.setPrev(null);
			return true;
		}

		while (del.getData() != data) {
			del = del.getNext();
		}

//		if(del.getNext().getNext() !=null) {
//			del.getNext().getNext().setPrev(del);
//			del.setNext(del.getNext().getNext());
//		}
//		else
//		{
//			del.setPrev(null);
//		}
		if (del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
			del.getPrev().setNext(del.getNext());
			return true;
		} else {
			del.getPrev().setNext(null);
		}

		return true;
	}
	public boolean sortDoublyList() {
		Node temp=head;
		int count=0;
		while(temp !=null) {
			temp=temp.getNext();
			count=count+1;	
		}
		temp=head;
		int arr[]=new int[count];
		for (int i = 0; i < count; i++) {
			arr[i]=temp.getData();
			temp=temp.getNext();
		}
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j < count; j++) {
				if(arr[i]<arr[j]) {
					int temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]+" ");
		}
		return true;
	}

}
