package array_programs;

import java.util.*;

public class Remove_duplicate {

	public static void main(String[] args) {
		
		int num[] = {10,20,30,10,39,20,30,57};
		
		Set<Integer> set = new HashSet<>();
		for(int arr : num) {
			 if (set.add(arr)) {
	                System.out.print(arr + " ");
	            }
		}
		
	}
}
