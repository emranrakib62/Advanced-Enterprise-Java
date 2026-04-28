 
package File_Handling_Mid;

import java.io.*;


public class File_Handaling {
    
   
public class FileExample{
    public static void main(String[] args) {

        try {
            File file = new File("Student22.txt");
            file.createNewFile();   // create file

            FileWriter fw = new FileWriter(file);
            fw.write("cgjffffffffffffffffffffffffffffffffffffffffg");  // write in file
            fw.close();

            System.out.println("File created and written successfully");

        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
}
