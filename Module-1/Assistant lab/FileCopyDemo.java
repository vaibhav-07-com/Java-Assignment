//Implement a file copy program using FileInputStream and FileOutputStream.

import java.io.*;

public class FileCopyDemo{
public static void main(String[] args){
String sourceFile = "source.txt";
String destinationFile = "copy.txt";
try (FileInputStream fis = new FileInputStream(sourceFile);
FileOutputStream fos = new FileOutputStream(destinationFile)) {
int byteData;
while ((byteData = fis.read()) != -1){
fos.write(byteData);
}
System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
}
catch(IOException e){
System.out.println("Error while copying file: " + e.getMessage());
}
}
}
