//Create a class with static variables and methods to demonstrate their use
class StaticFields{
public static void main(String []args){
System.out.println(demo.a);
demo.display();
}
}

class demo{
public static int a=10;
public static void display(){
System.out.println("hello from static method");
}
}