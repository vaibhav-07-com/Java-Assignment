//Write a program to create and initialize an object using a parameterized constructor.
class Student {
String name;
int age;
Student(String n, int a) {
name = n;
age = a;
}
void display() {
System.out.println("Name: " + name + ", Age: " + age);
}
}
public class ParameterConstructor{
public static void main(String[] args) {
Student s1 = new Student("Amit", 20);
Student s2 = new Student("Priya", 22);
s1.display();
s2.display();
}
}
