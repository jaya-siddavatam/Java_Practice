package practice1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;                   //importing all the required packages


public class FileHandling {
	public static void readDataUsingNIO() throws IOException //specify that it throws an exception 
	{
		
		List<String> list=Collections.emptyList();
		Path path= Paths.get("C:\\Users\\Toshiba\\Desktop\\Practice\\File_Handling.txt");
		list= Files.readAllLines(path,StandardCharsets.UTF_8);
		Iterator<String> it= list.iterator();
	
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
public static void main(String[] args) {
	try {
	
		readDataUsingNIO();                //calling the method
	} 
	catch (IOException e) {          // exception handing using try catch
	
	
		System.out.println("File is not available at the given specified path ");
	}
	
	}
}