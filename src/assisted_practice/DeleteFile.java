package assisted_practice;

import java.io.IOException; 
import java.nio.file.*; 
  
public class DeleteFile 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("C:\\Users\\Toshiba\\Desktop\\Practice\\demo.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Demo file Deleted successful."); 
    } 
}
