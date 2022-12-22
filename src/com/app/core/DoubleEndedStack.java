package com.app.core;

public class DoubleEndedStack {
	private int top1;
	private int top2;
	private int size;
	private int arr[];
	
	public DoubleEndedStack() {
		this.size=11;
		arr=new int[size];
		top1=(size/2)+1;
		top2=(size/2);
	}
	public void push1(int data) {
		if(top1 > 0) {
			top1=top1-1;
			arr[top1]=data;
			return;
		}
		else
			System.out.println("stack1 is full");
	}
	public int pop1()
	{
		if(top1 <=size/2) {
			int temp=arr[top1];
			top1=top1+1;
			return temp;
		}
		return -99;
	}
	public void push2(int data) {
		if(top2 <size-1) {
			top2=top2+1;
			arr[top2]=data;
			return;
		}
		else
			System.out.println("Stack 2 is full");
	}
	public int pop2() {
		if(top2> (size/2)+1) {
			int temp=arr[top2];
			top2=top2-1;
			return temp;
		}
		return -99;
	}

}
