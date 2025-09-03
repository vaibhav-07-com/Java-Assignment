//Create a class Student with attributes (name, age) and a method to display the details
import java.util.*; 
class Student{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name: ");
String name=sc.nextLine();
System.out.println("Enter age: ");
int age=sc.nextInt();
display(name, age);
}
public static void display(String name, int age){
System.out.println("name of student is : "+name);
System.out.println("age of student is : "+age);
}
}