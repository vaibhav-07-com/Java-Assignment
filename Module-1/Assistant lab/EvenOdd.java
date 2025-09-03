//Write a program to find if a number is even or odd using an if-else statement
import java.util.*;
class EvenOdd{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
	if(a<0){
		System.out.println("enter positive value");
		System.exit(0);
	}
	if(a%2==0){
		System.out.println("given number is even");
	}else{
		System.out.println("given number is odd");
	}
}
}