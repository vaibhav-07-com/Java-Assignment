//Use inter-thread communication methods like wait(), notify(), and notifyAll().

class Message {
private String msg;
private boolean hasMessage = false;
public synchronized void writeMessage(String m) {
while (hasMessage) { 
try { wait(); } catch (InterruptedException e) {}
}
msg = m;
hasMessage = true;
System.out.println("Produced: " + msg);
notify();  
}
public synchronized void readMessage() {
while (!hasMessage) { 
try { wait(); } catch (InterruptedException e) {}
}
System.out.println("Consumed: " + msg);
hasMessage = false;
notify();
}
}

class Writer extends Thread {
private Message message;
public Writer(Message m) { this.message = m; }
public void run() {
message.writeMessage("Hello from Writer!");
}
}

class Reader extends Thread {
private Message message;
public Reader(Message m) { this.message = m; }
public void run() {
message.readMessage();
}
}

public class WaitNotifyDemo {
public static void main(String[] args) {
Message msg = new Message();
new Writer(msg).start();
new Reader(msg).start();
}
}
