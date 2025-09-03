//Implement a program that reads a file line by line using BufferedReader.

import java.io.*;
public class BufferedReaderDemo{
public static void main(String[] args){
try {
BufferedReader br = new BufferedReader(new FileReader("Demo.txt"));
String line;
System.out.println("Reading file line by line:");
	while ((line = br.readLine()) != null){
	System.out.println(line);
	}
br.close();
}
catch (IOException e){
e.printStackTrace();
}
}
}
