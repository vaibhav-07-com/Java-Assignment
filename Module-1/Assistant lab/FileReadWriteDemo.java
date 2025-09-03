//Create a program that reads from one file and writes the content to another file.
import java.io.*;
public class FileReadWriteDemo{
public static void main(String[] args){
String sourceFile="source.txt";
String destinationFile="output.txt";
try(
FileReader fr=new FileReader(sourceFile);
FileWriter fw=new FileWriter(destinationFile)
){
int ch;
while ((ch=fr.read())!= -1){
fw.write(ch);
}
System.out.println("File copied successfully from"+sourceFile+"to"+destinationFile);
}
catch (IOException e){
e.printStackTrace();
}
}
}
