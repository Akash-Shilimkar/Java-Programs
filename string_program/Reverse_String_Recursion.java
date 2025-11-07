import java.util.*;

public class Reverse_String_Recursion{
  public staic void main(String [] args){
    Scanner sc = new Scanner(System.in):
    System.out.println("Enter the String :");
    String str = sc.nextLine();
    System.out.println("Reverse string is : " + resverse(str));
  }

  public  String resverse(String str){
    if(str.isEmpty()){
      return str;
    } else {
      return reverse.(str.substring(1)) + str.charAt(0);
    }
  }
}
