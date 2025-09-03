//Write a program to create and run multiple threads using the Thread class.

//Implement thread synchronization using synchronized blocks or methods.

class Counter {
private int count = 0;
public synchronized void increment(String threadName) {
count++;
System.out.println(threadName + " incremented count to: " + count);
}
}
class MyThread extends Thread {
private Counter counter;
public MyThread(Counter counter, String name) {
super(name);
this.counter = counter;
}
public void run() {
for (int i = 1; i <= 3; i++) {
counter.increment(getName());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}

public class MultiThreadDemo {
public static void main(String[] args) {
Counter c1 = new Counter();
MyThread t1 = new MyThread(c1, "Thread-1");
MyThread t2 = new MyThread(c1, "Thread-2");
MyThread t3 = new MyThread(c1, "Thread-3");
t1.start();
t2.start();
t3.start();
}
}
