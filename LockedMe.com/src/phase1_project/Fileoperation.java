package phase1_project;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fileoperation {
	
//	List<FilePath> listOffiles  = new ArrayList<FilePath>();	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the file path to proceed with the application");	
//	String path = sc.next();

	
	    static void RecursivePrint(File[] arr, int level)
	    {
	        // for-each loop for main directory files
	        for (File f : arr) {
	            // tabs for internal levels
	            for (int i = 0; i < level; i++)
	                System.out.print("\t");
	 
	            if (f.isFile())
	                System.out.println(f.getName());
	 
	            else if (f.isDirectory()) {
	                System.out.println("[" + f.getName() + "]");
	 
	                // recursion for sub-directories
	                RecursivePrint(f.listFiles(), level + 1);
	            }
	        }
	    }
	 

	
//	File ff = new File("path");
//	public String[]  filesasc() {
//		//String files;
//		//File ff = new File("C:\\Users\\Toshiba\\Desktop\\P1Projext");
//		
//		return ff.list();
//		//return Collections.sort(ff.list());
//		//return listoffiles[];
//	}
	
	public String addfile(FilePath file) throws Exception {
		//listOffiles.add(file);
		ff.createNewFile();
		return "File Created";
	}
	public String deletefile() {
		//String f = sc.next("Enter the file name to delete");
		ff.delete();
		return "File deleted";
	}
	public String findfile() {
		System.out.println("enter the file name ");
	//String F  = sc.next();
		ff.exists()	;

		return "file exists";
		
	
}
}
