package com.app.core;

public class BST {
	private Nodee root;
	
	public BST()
	{
		this.root=null;
	}

	public Nodee getRoot() {
		return root;
	}
	@SuppressWarnings("unused")
	public boolean insertData(int data) {
		Nodee newNode=new Nodee(data);
		Nodee temp=root;
		if(newNode==null) {
			return false;
		}
		
		while(true) {
			if(temp.getData()==data) {
				return false;
			}
			if(temp.getData()>data) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}
			else {
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}
			
		}
	}

}
