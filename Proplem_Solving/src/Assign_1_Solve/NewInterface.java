/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Assign_1_Solve;
import java.io.*;
/**
 *
 * @author Emranul Hoque
 */
public interface NewInterface {
      public static void main(String[] args) {

        try {
            File file = new File("Student.txt");
            file.createNewFile();   // create file

            FileWriter fw = new FileWriter(file);
            fw.write("Hello Student");  // write in file
            fw.close();

            System.out.println("File created and written successfully");

        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
