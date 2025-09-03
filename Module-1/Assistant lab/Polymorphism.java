// Implement method overriding to show polymorphism in action.

//Implement runtime polymorphism by overriding methods in the child class.

class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
	Animal a1 = new Dog(); 
	Animal a2 = new Cat();
	a1.sound();
	a2.sound();
    }
}
