package com.app.core;

public class Nodee {
	private int data;
	private Nodee left;
	private Nodee right;
	
	public Nodee(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodee getLeft() {
		return left;
	}

	public void setLeft(Nodee left) {
		this.left = left;
	}

	public Nodee getRight() {
		return right;
	}

	public void setRight(Nodee right) {
		this.right = right;
	}
	
	

}
