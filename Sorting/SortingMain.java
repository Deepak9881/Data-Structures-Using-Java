package Sorting;

import java.util.Arrays;

public class SortingMain {
	public static void main(String[] args) {
		
		int arr[]= {10,58,45,85,96,102,56,5,24};
		System.out.println("Array Before Sorting");
		System.out.println(Arrays.toString(arr));
		//int res[]=Sort.bubbleSorting(arr);
	    //int res[]=Sort.insertionSort(arr);
		//int res[]=Sort.selectionSort(arr);
		//int res[]=QuickSort.quickSort(arr, 0, arr.length-1);
		int res[]=MergeSort.mergeSort(arr,0, arr.length-1);
		System.out.println("Array after Sorting:");
		System.out.println(Arrays.toString(res));
	}

}
