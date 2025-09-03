//Write a program demonstrating single inheritance

//Write a program that demonstrates inheritance using extends keyword

class Animal {
    void eat() {
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); 
        d.bark();
    }
}
