//Write a program to demonstrate exception handling using try-catch-finally.

//Implement multiple catch blocks for different types of exceptions.

public class ExceptionDemo {
public static void main(String[] args) {
try {
int num = 10 / 0;

int[] arr = {1, 2, 3};
System.out.println(arr[5]);

String str = null;
System.out.println(str.length());
}
catch(ArithmeticException e) {
System.out.println("Caught ArithmeticException: " + e.getMessage());
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
}
catch(NullPointerException e) {
System.out.println("Caught NullPointerException: " + e.getMessage());
}
catch(Exception e) {
System.out.println("Caught some other exception: " + e.getMessage());
}
finally{
System.out.println("Finally block always executes (cleanup code here).");
}
System.out.println("Program continues after exception handling...");
}
}
