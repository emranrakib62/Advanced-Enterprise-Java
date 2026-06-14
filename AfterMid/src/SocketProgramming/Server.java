package SocketProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5001);
            System.out.println("Server is running...waiting for client");        
            Socket a = ss.accept();
            System.out.println("Client is accept");            
            PrintWriter pw = new PrintWriter(a.getOutputStream(), true);
            pw.println("Hello how are you From client");
            BufferedReader br = new BufferedReader(new InputStreamReader(a.getInputStream()));
            //br.readLine();
            System.out.println("message from server:" + br.readLine());                             
        } catch (Exception e) {
            e.printStackTrace();
        }       
        try {
            throw new DusterException("No Duster");
        } catch (DusterException d) {
            System.out.println(d.getMessage());
        }}}

class DusterException extends Exception {
    public DusterException(String m) {
        super(m); 
}}
