package array_programs;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {10,20,45,60,85,5};
		
        System.out.print("Reversed Array: ");

		for(int i = arr.length -1; i >= 0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
