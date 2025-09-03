//Write a program to read and write content to a file using FileReader and FileWriter

import java.io.*;
public class FileReaderWriterDemo{
public static void main(String[] args){
try{
FileWriter writer = new FileWriter("example.txt");
writer.write("Hello, this is write using FileWriter.\n");
writer.write("Second line here.");
writer.close();
System.out.println("File written successfully.");
FileReader reader = new FileReader("example.txt");
int ch;
System.out.println("File content:");
	while((ch = reader.read()) != -1){
		System.out.print((char) ch);
	}
reader.close();
}
catch (IOException e){
e.printStackTrace();
}
}
}
