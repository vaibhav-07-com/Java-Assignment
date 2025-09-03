import java.util.Scanner;

class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}

public class CustomExceptionDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
System.out.print("Enter age: ");
int age = sc.nextInt();
	if (age < 0 || age > 100) {
	throw new InvalidAgeException("Age must be between 0 and 100.");
	}
System.out.println("Valid age entered: "+ age);
} 
catch (InvalidAgeException e){
System.out.println("Custom Exception Caught: " + e.getMessage());
}
catch (Exception e) {
System.out.println("Some other error: " + e.getMessage());
}
finally {
sc.close();
System.out.println("finally block executed");
}
}
}
