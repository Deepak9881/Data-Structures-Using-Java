package Sorting;

public class Sort {

	
	public static int [] bubbleSorting(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			if(i!=min_index) {
				int temp=arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
			}
		}
		return arr;
	}
}
