
package filecreate;
import java.io.File;
import java.io.FileWriter;

public class FileCreate {

    
    public static void main(String[] args) {
        
         try {
            File file = new File("Student.txt");

            if(file.createNewFile()){
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello Student");
            writer.close();

            System.out.println("Data written successfully");

        } catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        
        
    }
    
}
