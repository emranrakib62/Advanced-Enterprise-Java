/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_solve;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    public static void main(String[] args) {
         try {
            File file = new File("dent.txt");
            file.createNewFile();   // create file

            FileWriter fw = new FileWriter(file);
            fw.write("fdxhfgjhfgjhhhStudent");  // write in file
            fw.close();

            System.out.println("File created and written successfully");

        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
        
        
    }
}
