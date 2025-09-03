//Implement a simple class with getters and setters for encapsulation.
class GetterAndSetter{
public static void main(String []args){
Student s=new Student();
s.setName("vaibhav");
s.setAge(22);

System.out.println("student name is: "+s.getName());
System.out.println("student age is: "+s.getAge());
}
}

class Student{
String name;
int age;

public void setName(String name){
this.name=name;
}

public String getName(){
return name;
}

public void setAge(int age){
this.age=age;
}

public int getAge(){
return age;
}
}