
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
   
    public static void main(String[] args) {               
        Connection con = null;         
        try {     
            Class.forName("com.mysql.cj.jdbc.Driver");                 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AEJ_60", "root", "");                  
            if (con != null) {
                System.out.println("Database Connection Successful!");
            }
            
        } catch (Exception e) {
           
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}

