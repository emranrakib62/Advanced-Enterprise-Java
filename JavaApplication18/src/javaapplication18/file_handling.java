
package javaapplication18;

import java.io.*;
public class file_handling {

   
    public static void main(String[] args) {
       
        
       try{
           File file=new File("Student123.txt");
           file.createNewFile();
           System.out.println(""+file.getAbsolutePath());
           FileWriter fw=new FileWriter(file);
           fw.write("bdhfdjhu");
           
           fw.close();
           file.delete();
           System.out.println("File created and written successfully");
       }catch(Exception e){
           System.out.println(""+e);
       }
        
    }
    
}
