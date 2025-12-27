package practice;

import java.util.*;

public class Sorting {

	// 1. Bubble Sort
	public void bubbleSort(int arr[]) {
		System.out.println("1. Bubble Sort");
		
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// 2. Selection Sort
	public void selectionSort(int arr[]) {
		System.out.println("2. Selection Sort");
		
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int position = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					position = j;
				}
			}
			if (position != i) {
				int temp = arr[i];
				arr[i] = arr[position];
				arr[position] = temp;

			}
		}

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// 3. Insertion Sort
	public void insertionSort(int arr[]) {
	    System.out.println("3. Insertion Sort");

	    int n = arr.length;

	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j;

	        for (j = i - 1; j >= 0; j--) {
	            if (arr[j] > key) {
	                arr[j + 1] = arr[j]; 
	            } else {
	                break;
	            }
	        }
	        arr[j + 1] = key; 
	    }

	    System.out.println("Sorted Array:");
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		Sorting obj = new Sorting();

		int arr[] = { 10, 30, 23, 12, 40, 11, 3, 5, 90 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selction Sort");
		System.out.println("3. Insertion Sort");
		int key = sc.nextInt();

		switch (key) {
		case 1:
			obj.bubbleSort(arr);
			break;
		case 2:
			obj.selectionSort(arr);
			break;
		case 3:
			obj.insertionSort(arr);
			break;
		default:
			System.out.println("Enter correct choice.");
			break;

		}

	}

}
