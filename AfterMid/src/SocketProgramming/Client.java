
package SocketProgramming;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6005);
            
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello how are you From client");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Message from server: " + br.readLine());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
} 
