//Create a program that demonstrates object serialization and deserialization.

import java.io.*;
class Student implements Serializable {
private String name;
private int age;
public Student(String name, int age) {
this.name = name;
this.age = age;
}
public void display() {
System.out.println("Name: " + name + ", Age: " + age);
}
}

public class SerializationDemo{
public static void main(String[] args){
String filename = "student.ser";
try{
Student s1 = new Student("Vaibhav", 22);
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
out.writeObject(s1);
out.close();
System.out.println("Object serialized successfully.");
}
catch(IOException e){
e.printStackTrace();
}
try {
ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
Student s2 = (Student) in.readObject();
in.close();
System.out.println("Object deserialized successfully.");
s2.display();
}
catch(IOException | ClassNotFoundException e){
e.printStackTrace();
}
}
}
