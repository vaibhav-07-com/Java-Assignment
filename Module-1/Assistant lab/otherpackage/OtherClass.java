package otherpackage;
import mypackage.MyClass;
public class OtherClass extends MyClass {
public void accessFromSubclass() {
System.out.println("\nInside OtherClass (subclass in another package):");
System.out.println(publicVar);      	// accessible
System.out.println(protectedVar); 	// accessible because it's a subclass
// System.out.println(defaultVar);  	// not accessible (different package)
// System.out.println(privateVar);  	// not accessible (private)
}
}
