//Write a program to display the Fibonacci series using a loop
import java.util.*;
class Fibonacci{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of term for Fibonacci series: ");
int n=sc.nextInt();

if(n<=0){
System.out.println("Enter positive value");
}
int count=0;
int a=0;
int b=1;

while(count<n){
System.out.print(a+"  ");
b=b+a;
a=b-a;
count++;
}
sc.close();
}
}