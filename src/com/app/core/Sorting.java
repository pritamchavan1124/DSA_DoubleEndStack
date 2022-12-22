package com.app.core;

public class Sorting {
	
	public static void bubbleSort(int arr[]) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void selectionSort(int arr[]) {
		int minIndex;
		for (int i = 0; i < arr.length-1; i++) {
			minIndex=i;
			
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[j]<arr[minIndex]) {
				minIndex=j;
				}
			}
			if(minIndex != i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
				
			}
			
		}
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void insertionSort(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j !=i; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
	public static int binarySearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low <=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key > arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return -999;
	}

}
