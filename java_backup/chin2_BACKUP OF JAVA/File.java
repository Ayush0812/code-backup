
/**
 * Write a description of class File here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class File
{
    /*public static void main(String args[]){ 
      File file = new File("Hello1.txt");
      file.createNewFile();
      FileWriter writer = new FileWriter(file); 
      
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

   
      FileReader fr = new FileReader(file); 
      String a =fr.readLine();
      System.out.println(a);  
      fr.close();
    } */
   public static void main(String args[]){   
   try{
      String a = "{11,21,3,40,5}";
      OutputStream os = new FileOutputStream("test.txt");
      os.write( a.charAt(0) );
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      System.out.print(is.read(a) + "  ");
      is.close();
      
   }catch(IOException e){
      System.out.print("Exception");
   }	
}
}
