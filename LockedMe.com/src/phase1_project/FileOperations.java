package phase1_project;

import java.io.File;
import java.util.*;
import java.io.File;


public class FileOperations {
	
	



	public  void  listoffiles() {
		
		File files[] = path.listFiles();
		Arrays.sort(path);

		for (int i = 0; i < files.length; i++)
			System.out.println(m[i]);
		
	}
	public  addfile throws Exception{
		
	File file = new File(path, filename);

	try {
		boolean value = file.createNewFile();
		if (value) {
			System.out.println("The new file is created. \n");
		} else {
			System.out.println("The file already exists.");
		}
	} catch (Exception e) {
		e.getStackTrace();
	}
	}
	
}