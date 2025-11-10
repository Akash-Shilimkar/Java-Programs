package array_programs;

public class SumArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,5,2};
		int sum = 0;
		
		for(int i = 0; i < arr.length;i++) {
			
			sum = arr[i] + sum;
		}
		System.out.println("Sum of Array is : " +sum);
	}	
}
