package jdbc;
import java.sql.*;
public class jdbc2 {
    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null; 
        PreparedStatement pstmt = null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse_60", "root", "");
            System.out.println("Database connect successfully");                    
            stmt = con.createStatement();
            stmt.executeUpdate("TRUNCATE TABLE Student");       
            
            String insertSQL = "INSERT INTO Student (Name, Id, Department) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(insertSQL);          
            pstmt.setString(1, "RAKIB");
            pstmt.setInt(2, 102);
            pstmt.setString(3,"CSE");
            pstmt.executeUpdate();  
            
            pstmt.setString(1, "HASAN");
            pstmt.setInt(2, 103);
            pstmt.setString(3, "CSE");
            pstmt.executeUpdate();   
            
            pstmt.setString(1, "EMRAN");
            pstmt.setInt(2, 104);
            pstmt.setString(3, "CSE");
            pstmt.executeUpdate(); 
            
            pstmt.setString(1, "KARIM");
            pstmt.setInt(2, 105);
            pstmt.setString(3, "CSE");
            pstmt.executeUpdate();
            System.out.println("insert record successfully");

          
            System.out.println("View list after inserted");
            String selectSQL = "SELECT * FROM Student";
            pstmt = con.prepareStatement(selectSQL); 
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Name") + "|" + rs.getInt("Id") + "|" + rs.getString("Department"));
            }
            rs.close();

            
            System.out.println("\nAfter Update (Changing Id 102 Name to Rahim):");
            String updateSQL = "UPDATE Student SET Name = ? WHERE Id = ?";
            pstmt = con.prepareStatement(updateSQL);
            pstmt.setString(1, "Rahim");
            pstmt.setInt(2, 102);        
            pstmt.executeUpdate();

            
            rs = con.prepareStatement(selectSQL).executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Name") + "|" + rs.getInt("Id") + "|" + rs.getString("Department"));
            }
            rs.close();

            
            System.out.println("\nAfter Delete (Deleting Id 102):");
            String deleteSQL = "DELETE FROM Student WHERE Id = ?";
            pstmt = con.prepareStatement(deleteSQL);
            pstmt.setInt(1, 102);
            pstmt.executeUpdate();

         
            rs = con.prepareStatement(selectSQL).executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Name") + "|" + rs.getInt("Id") + "|" + rs.getString("Department"));
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}