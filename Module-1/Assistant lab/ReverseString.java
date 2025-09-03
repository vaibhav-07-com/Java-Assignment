//Create a program to reverse a string and check for palindromes.
import java.util.*;
public class ReverseString{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
if(isPalindrome(str)){
System.out.println("String is palindrome");
}else{
System.out.println("String is not palindrome");
}
}
public static boolean isPalindrome(String str){
int start=0;
int end=str.length()-1;
boolean b=false;
while(start<=end){
	if(str.charAt(start)==str.charAt(end) ){
	b=true;
	}else{
	return false;
	}
	start++;
	end--;
}
return b;
}

}