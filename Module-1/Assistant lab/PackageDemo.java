//Create a user-defined package and import it into another program.

//Demonstrate the use of different access modifiers within the same package andacross different packages.

import mypackage.MyClass;
import otherpackage.OtherClass;
public class PackageDemo {
public static void main(String[] args) {
MyClass obj = new MyClass();
obj.display();
System.out.println("\nAccessing from PackageDemo (non-subclass in different package):");
System.out.println(obj.publicVar);    	// accessible
// System.out.println(obj.protectedVar); 	//not accessible
// System.out.println(obj.defaultVar);   	// not accessible
// System.out.println(obj.privateVar);   	// not accessible

OtherClass other = new OtherClass();
other.accessFromSubclass();
}
}
