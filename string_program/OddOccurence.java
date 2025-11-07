package string_program;

import java.util.*;

public class OddOccurence {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        String str = sc.next();
        
        str = str.toLowerCase();
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for(char ch : str.toCharArray()) {
        	if(Character.isLetter(ch)) {
        		charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        		
        	}
        }
        
        System.out.println("Character with odd Occurence : ");
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        	if(entry.getValue() % 2 != 0) {
        		System.out.println(entry.getKey() + "->" + entry.getValue());
        	}
        	
        }
	}
}
