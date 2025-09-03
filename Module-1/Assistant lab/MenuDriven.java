import java.util.*;
class MenuDriven{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("Simple calculator menu");
System.out.println("1. add two number");
System.out.println("2. subtract two number");
System.out.println("3. multiply two number");
System.out.println("4. divide two number");
System.out.println("Enter choice (1-5)");
choice=sc.nextInt();
if(choice==5){
System.exit(0);
}
System.out.println("Enter number 1:");
int a=sc.nextInt();
System.out.println("Enter number 2:");
int b=sc.nextInt();

switch(choice){
		case 1:
		System.out.println("addition of two number is :"+(a+b));
		break;

		case 2:
		System.out.println("subtract of two number is :"+(a-b));
		break;

		case 3:
		System.out.println("multiplication of two number is :"+(a*b));
		break;
		case 4:
			if(b==0){
			System.out.println("can not divide by ZERO");
			}
		System.out.println("division of two number is :"+(a/b));
		break;
		case 5:
		System.out.println("Good Bye");
		break;
		default:
		System.out.println("Invalid choice! enter valid choice number between 1-5");

}
}while(choice!=5);


}
}