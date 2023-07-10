package Sorting;

public class QuickSort {
	public static int partition(int[] data, int l, int h) {
		int pivot=data[h];
		int j=h-1;
		int i=0;
		while(i<=j) {
			if(data[i]>pivot) {
				int temp=data[i];
				data[i]=data[j];
				data[j]=temp;
				j--;
			}else {
				i++;
			}
		}
		data[h]=data[j+1];
		data[j+1]=pivot;
		return j+1;
		
	}
	
	public static int[] quickSort(int data[],int l,int h) {
		if(l<h) {
			int p=partition(data,l,h);
			
		
		 if(p!=-1) {
			 quickSort(data,l,p-1);
			 quickSort(data,p+1,h);
		 }
		}
		 return data;
	}

	

}
