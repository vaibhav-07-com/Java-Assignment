//Create a class hierarchy and demonstrate multilevel inheritance.

//Implement runtime polymorphism by overriding methods in the child class.

class Animal {
Animal(String name) {
System.out.println("Animal constructor called. Name: " + name);
}

void eat() {
System.out.println("Animals eat food");
}
}

class Dog extends Animal {
Dog(String name) {
super(name); 
System.out.println("Dog constructor called. Name: " + name);
}

void bark() {
System.out.println("Dog barks");
}
}

class Puppy extends Dog {
void weep() {
System.out.println("Puppy is weeping");
}
}

public class MultilevelInheritance{
public static void main(String[] args) {

Dog d1 = new Dog("Tommy");
d1.sound();

Puppy p = new Puppy();
p.eat();
p.bark();
p.weep();
}
}
