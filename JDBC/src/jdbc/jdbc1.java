/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author Emranul Hoque
 */
public class jdbc1 {
    
    public static void main(String[] args) {
   Connection con=null;
   ResultSet rs=null;
   Statement stmt=null;
   
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse_60","root","");
       System.out.println("Database connect succesfully");
       stmt=con.createStatement();
       
       stmt.executeUpdate("TRUNCATE TABLE Student");
       
       
       
       stmt.executeUpdate("INSERT INTO Student VALUES('RAKIB',102,'CSE')");
        stmt.executeUpdate("INSERT INTO Student VALUES('HASAN',103,'CSE')");
         stmt.executeUpdate("INSERT INTO Student VALUES('EMRAN',104,'CSE')");
          stmt.executeUpdate("INSERT INTO Student VALUES('KARIM',105,'CSE')");
      
       System.out.println("inser recod successfully");
       
       System.out.println("View list after inserted");
       rs=stmt.executeQuery("SELECT * FROM Student");
      while(rs.next()){
       System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
   }
      rs.close();
       
      
      stmt.executeUpdate("UPDATE Student SET Name='Rahim' WHERE Id=102");
       
      
      rs=stmt.executeQuery("SELECT * FROM Student");
      
      while(rs.next()){
       System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
   }
      rs.close();
      
      
       System.out.println("After Delete");
       stmt.executeUpdate("DELETE FROM Student  WHERE Id=102");
       
      
      rs=stmt.executeQuery("SELECT * FROM Student");
      
      while(rs.next()){
       System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
   }
      rs.close();
       
      
      
      
      
       
       
       
       
   }catch(Exception e){
       e.printStackTrace();
   }
    
   
    
}
}