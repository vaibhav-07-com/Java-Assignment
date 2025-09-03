//Write a program to find the maximum of three numbers using a method.
import java.util.*;
class MaxVariable{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers: ");
System.out.print("A : ");
int a =sc.nextInt();
System.out.print("B : ");
int b=sc.nextInt();
System.out.print("C : ");
int c=sc.nextInt();
findMax(a,b,c);
}

public static void findMax(int a,int b,int c){
if(a>=b && b>=c){
System.out.println("A is Max");
}
else if(b>=a && a>=c){
System.out.println("B is Max");
}else if(c>=b && b>=a){
System.out.println("C is Max");
}else{

}
}
}