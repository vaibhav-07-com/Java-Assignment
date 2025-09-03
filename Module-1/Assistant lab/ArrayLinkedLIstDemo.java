//Write a program that demonstrates the use of an ArrayList and LinkedList.
import java.util.*;
class ArrayLinkedLIstDemo{
public static void main(String []args){

ArrayList<String> list1 = new ArrayList<>();
list1.add("Apple");
list1.add("Banana");
list1.add("Mango");
list1.add("orange");
System.out.println(list1);
list1.remove("Apple");
System.out.println(list1);



LinkedList<String> animals = new LinkedList<>();
animals.add("Dog");
animals.add("Cat");
animals.add("Elephant");
animals.add("horse");
System.out.println("\nLinkedList elements: " + animals);
animals.addFirst("Lion");
animals.addLast("Tiger");
System.out.println("LinkedList after addFirst & addLast: " + animals);
}
}