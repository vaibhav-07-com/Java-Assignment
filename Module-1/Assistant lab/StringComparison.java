public class StringComparison{
public static void main(String []args){
String str1 = "Apple";
String str2 = "Apple";
String str3 = "Banana";
System.out.println("Using equals():");
System.out.println("str1.equals(str2): "+str1.equals(str2)); 
System.out.println("str1.equals(str3): "+str1.equals(str3));
System.out.println("\nUsing compareTo():");
System.out.println("str1.compareTo(str2):"+str1.compareTo(str2)); 
System.out.println("str1.compareTo(str3):"+str1.compareTo(str3)); 
System.out.println("str3.compareTo(str1):"+str3.compareTo(str1));
}
}
