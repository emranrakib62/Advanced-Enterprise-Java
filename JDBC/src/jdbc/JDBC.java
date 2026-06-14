package jdbc;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
          ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aej_60", "root", "");
            System.out.println("=== Connected Successfully to Database ===");
            stmt = con.createStatement();

            stmt.executeUpdate("TRUNCATE TABLE student");

            //  CREATE / INSERT 
          
            stmt.executeUpdate("INSERT INTO student VALUES('Emran', 1014, 'CSE')");
            
            System.out.println("1 Records Inserted Successfully.");

           

            //  READ / VIEW 
            System.out.println("\n--- 2. Current Student List (View) ---");
            rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getString("Name") + " | "
                        + rs.getInt("Id") + " | "
                        + rs.getString("Department"));
            }
            rs.close();

            //  UPDATE -  (Jisan)- 'Kakoli' 
            System.out.println("\n--- 3. Updating Record (ID: 1176) ---");
            stmt.executeUpdate("UPDATE student SET Name = 'Kakoli' WHERE Id = 1014");
            System.out.println("Record Updated Successfully.");

            
            System.out.println("\n--- Student List After Update ---");
            rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getString("Name") + " | "
                        + rs.getInt("Id") + " | "
                        + rs.getString("Department"));
            }
            rs.close();

            //  DELETE -()
       
            stmt.executeUpdate("DELETE FROM student WHERE Id = 1014");
            System.out.println("Record Deleted Successfully.");

            System.out.println("\n--- Final Student List After Delete ---");
            rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getString("Name") + " | "
                        + rs.getInt("Id") + " | "
                        + rs.getString("Department"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
    }

