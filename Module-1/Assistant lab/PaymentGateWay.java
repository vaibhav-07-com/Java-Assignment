//Write a program that implements multiple interfaces in a single class

//Implement an interface for a real-world example, such as a payment gateway

interface PGateWay{
void Payment(double amount);
}

class CCPayment implements PGateWay {
public void Payment(double amount) {
System.out.println("Processing Credit Card Payment of $" + amount);
}
}

class GpayPayment implements PGateWay {
public void Payment(double amount) {
System.out.println("Processing GooglePay Payment of $" + amount);
}
}

class UpiPayment implements PGateWay {
public void Payment(double amount) {
System.out.println("Processing UPI Payment of $" + amount);
}
}

public class PaymentGateWay{
public static void main(String[] args) {
PGateWay p1,p2,p3;
p1 = new CCPayment();
p1.Payment(2500.500);
p2 = new GpayPayment();
p2.Payment(1500.75);
p3 = new UpiPayment();
p3.Payment(500.00);
}
}
