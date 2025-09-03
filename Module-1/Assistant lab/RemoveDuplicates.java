//Implement a program using HashSet to remove duplicate elements froma list.

import java.util.*;

public class RemoveDuplicates {
public static void main(String[] args) {
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Apple"); 
fruits.add("Banana");
fruits.add("Orange");
System.out.println("Original List: " + fruits);
HashSet<String> uniqueFruits = new HashSet<>(fruits);
List<String> noDuplicates = new ArrayList<>(uniqueFruits);
System.out.println("List after removing duplicates: " + noDuplicates);
}
}
