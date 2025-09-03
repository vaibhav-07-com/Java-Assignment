package mypackage;
public class MyClass {
public String publicVar = "Public Variable";
protected String protectedVar = "Protected Variable";
String defaultVar = "Default Variable";
private String privateVar = "Private Variable";
public void display() {
System.out.println("Inside MyClass (same class):");
System.out.println(publicVar);
System.out.println(protectedVar);
System.out.println(defaultVar);
System.out.println(privateVar);
}
}
