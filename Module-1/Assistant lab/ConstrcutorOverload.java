//Create multiple constructors in a class and 

//Demonstrate constructor overloading by passing different types of parameters.

demonstrate constructor overloading.

class ConstrcutorOverload{
public static void main(String []args){
demo d1=new demo();
demo d2=new demo(10,10);
demo d3=new demo("vaibhav");
}
}

class demo{
demo(){
System.out.println("Default constructor");
}
demo(int a,int b){
System.out.println("sum is: "+(a+b));
}

demo(String name){
System.out.println("hello my name is : "+name);
}
}