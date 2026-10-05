package sortingAlgorithms;

public class MergeSort {

	public void mergeSortDivide(int arr[], int st, int end) {

		
		
//		base case
		if(st >= end) return;
		
		int mid = (st+end)/2;
		
//		start dividing
		mergeSortDivide(arr, st, mid);
		mergeSortDivide(arr, mid+1, end);
		
		int temp[] = new int[arr.length];
		
//		when fully divided now merge while sorting...
		sortAndMerge(arr, temp, st, mid, mid+1, end);
		
//		once merged and sorted... now copy...
		
		copy(arr, temp, st, end);

	}
	
	private void sortAndMerge(int arr[], int temp[], int s1, int e1, int s2, int e2) {
		
		int i =s1, j=s2, k=0;
		
		while(i <= e1 && j <= e2) {
			
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++; k++;
			}
			else {					//(arr[i] >= arr[j])
				temp[k] = arr[j];
				j++; k++;
			}
		}
		
//		still if elements left..
		while(i<=e1) {
			temp[k] = arr[i];
			i++; k++;
		}
		while(j<=e2) {
			temp[k] = arr[j];
			j++; k++;
		}
		return;
	}
	
	private void copy(int arr[], int temp[], int st, int end) {
		
		int i = st;
		int k=0;
		
		while(i <= end) {
			arr[i] = temp[k++];
			i++;
		}
		return;
	}
	
}
