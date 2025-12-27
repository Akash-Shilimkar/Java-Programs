package practice;

import java.util.Arrays;

public class Searching {
	
	//1.Linear Search
	public void linearSearch(int arr[],int key) {
		int n = arr.length;
		int flag =0;
		
		for(int i = 0;i < n;i++) {
			if(arr[i] == key) {
				flag = 1;
				if(flag == 1) {
					System.out.println("Element found at index: " +i);
				} else { 
					System.out.println("Element not found.");
				}
			}
		}
	}
	
	//2. Binary Search
	public void binarySearch(int arr[], int key, int beg, int end) {

	    while (beg <= end) {
	        int mid = beg + (end - beg) / 2;

	        if (arr[mid] == key) {
	            System.out.println("Element found at index: " + mid);
	            return;
	        }
	        else if (key < arr[mid]) {
	            end = mid - 1;
	        }
	        else {
	            beg = mid + 1;
	        }
	    }

	    System.out.println("Element not found.");
	}

	
	public static void main(String[] args) {
		
		Searching obj = new Searching();
		
		int arr [] = { 10,20,2,59,30,23 };
		
		obj.linearSearch(arr, 59);
		Arrays.sort(arr);
		obj.binarySearch(arr, 3, 0, arr.length - 1);
		
	}

}
