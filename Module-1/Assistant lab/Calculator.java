import java.util.*;
class Calculator{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number :");
int a=sc.nextInt();
System.out.print("Enter Second number :");
int b=sc.nextInt();
System.out.print(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
System.out.println("Enter your choice number: ");
int choice=sc.nextInt();
if(choice==1){
System.out.println("Addition is :"+(a+b));
}
else if(choice==2){
System.out.println("Substraction is :"+(a-b));
}
else if(choice==3){
System.out.println("Multiplication is :"+(a*b));
}
else if(choice==4){
System.out.println("Division is :"+(a/b));
}
else{
System.out.println("Choose valid option");
}
}
}