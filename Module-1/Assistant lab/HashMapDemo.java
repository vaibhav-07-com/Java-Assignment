//Create a HashMap to store and retrieve key-value pairs.

import java.util.*;

public class HashMapDemo{
public static void main(String[] args){
HashMap<Integer, String>students = new HashMap<>();
students.put(101, "Alice");
students.put(102, "Bob");
students.put(103, "Charlie");
students.put(104, "David");
System.out.println("Students HashMap: " + students);
System.out.println("Student with ID 102: " + students.get(102));
students.remove(104);
System.out.println("After removing ID 104: " + students);
System.out.println("\nIterating through HashMap:");
for (Map.Entry<Integer, String> entry : students.entrySet()){
System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
}
}
}
