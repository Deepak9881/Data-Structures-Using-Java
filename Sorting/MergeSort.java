package Sorting;

public class MergeSort {
	
	public static int[] mergeSort(int arr[],int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
		return arr;
	}
	public static void merge(int arr[],int l,int m,int h) {
		int n1,n2;
		n1=m-l+1;
		n2=h-m;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		
		
		for(int i=0;i<n1;i++) {
			a1[i]=arr[i+l];
		}
		for(int j=0;j<n2;j++) {
			a2[j]=arr[m+1+j];
		}
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(a1[i]<a2[j]) {
				arr[k++]=a1[i++];
			}
			else
			arr[k++]=a2[j++];	
		}
		
		while(i<n1) {
			arr[k++]=a1[i++];
		}
		while(j<n2) {
			arr[k++]=a2[j++];
		}

	}

}
