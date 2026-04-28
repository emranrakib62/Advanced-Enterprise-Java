/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice11;
import java.io.*;
/**
 *
 * @author Emranul Hoque
 */
public class file_hand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            File file=new File("Stu.txt");
            file.createNewFile();
            System.out.println(""+file.getAbsolutePath());
            FileWriter fw=new FileWriter(file);
            fw.write("jhsdfgjsdfjs");
            fw.close();
           
            System.out.println("File Created and Wriitten Successgully");
        }catch(Exception e){
            System.out.println(""+e);
        }
        
        
    }
    
}
