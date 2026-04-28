
package file;

 import java.io.*;


 
public class Fileeeeeee {

    

    public static void main(String[] args) {
     try{
         File file=new File("Stu.txt");
         file.createNewFile();
         System.out.println(""+file.getAbsoluteFile());
         FileWriter f=new FileWriter(file);
         f.write("fhbvjhfgbvjd");
         f.close();
         System.out.println("File Crteated and written successfully");
     }catch(Exception e){
         System.out.println(""+e);
     }
    }

    
}
    
    

