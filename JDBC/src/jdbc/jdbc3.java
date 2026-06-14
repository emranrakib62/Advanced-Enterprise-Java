
package jdbc;
import java.sql.*;
public class jdbc3{
    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs=null;
        Statement stmt=null;
        
              try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cs_60","root","");
                  System.out.println("Databse Connect Successfully");
                  
                  stmt=con.createStatement();
                  
                  stmt.executeUpdate("TRUNCATE TABLE Student1");
                  
                  stmt.executeUpdate("INSERT INTO Student1 VALUES('Rakib',102,'CSE')");
                  stmt.executeUpdate("INSERT INTO Student1 VALUES('mahin',103,'CSE')");
                  stmt.executeUpdate("INSERT INTO Student1 VALUES('robi',104,'CSE')");
                  System.out.println("Data inserted succsessfully");
                  System.out.println("After inserted list");
                  
                  rs=stmt.executeQuery("SELECT * FROM Student1");
                  while(rs.next()){
                      System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
                      
                  }
                  rs.close();
                  
                  //update
                 stmt.executeUpdate("UPDATE Student1 SET Name='tuhin' WHERE Id=104"); 
                  
                  System.out.println("After updated");
                  
                  rs=stmt.executeQuery("SELECT * FROM Student1");
                  while(rs.next()){
                      System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
                      
                  }
                  rs.close();
                  
                  //delete
                  stmt.executeUpdate("DELETE FROM Student1  WHERE Id=104"); 
                  
                  System.out.println("After dELETE");
                  
                  rs=stmt.executeQuery("SELECT * FROM Student1");
                  while(rs.next()){
                      System.out.println(rs.getString("Name")+"|"+rs.getInt("Id")+"|"+rs.getString("Department"));
                      
                  }
                  rs.close();
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
