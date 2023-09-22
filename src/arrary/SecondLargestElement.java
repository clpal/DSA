package arrary;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		  int n = arr.length;
		  print2largest(arr, n);

	}
	static void print2largest(int arr[],   int arr_size)
{
	/*
	 * if(arr_size<2) { System.out.print("invalid input"); return; }
	 */
	Arrays.sort(arr);
	// start from last second element
	for (int i = arr_size-2; i >=0; i--) {
		if (arr[i]!=arr[arr_size-1]) {
			System.out.print("Second largest element: "+arr[i]);
			return;
			
		}
		
	}
}
}
