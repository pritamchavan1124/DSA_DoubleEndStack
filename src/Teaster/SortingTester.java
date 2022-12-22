package Teaster;

import com.app.core.Sorting;

public class SortingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting sort=new Sorting();
		int arr[]= {10,15,27,1,3,45,22,36,44,12,19,34};
		int arr1[]= {11,12,15,18,24,47,87};
		//sort.bubbleSort(arr);
		//sort.selectionSort(arr);
		//sort.insertionSort(arr);
		System.out.println(sort.binarySearch(arr1, 214));

	}

}
