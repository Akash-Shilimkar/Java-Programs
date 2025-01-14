package string_program;

import java.util.Scanner;

public class Reverse_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        char chArr [] = new char[str.length()];
        char ch = ' ';
        String revString = " ";

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(str.length() - 1 - i);
                chArr[i] = ch;
                revString = new String(chArr);
        }
        System.out.println("Reverse string is : "+revString);
    }
}
