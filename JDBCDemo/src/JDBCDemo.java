

/**STEOS FOR JDBC
 * 1. Import packages. java.sql.*;
 * 2. Load a driver and register driver. 
 * 3. create a connection
 * 4. create statement
 * 5.excute statement 
 * 6. proccess the result
 * 7. close the connection
 * 
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//this is optional
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemoDB", "root", "lincozino");
            System.out.println("Connected to the database successfully!");
                    //  PREPEREDSTATEMENT Interface is used if you are going to use user input data instead of using STATEMENT INTETFECE.  
            Statement stm = c.createStatement();// here stm is a method that impliments connection and return Statement type interface. 
            String sql = "INSERT INTO jdbctable (name, age) VALUES " 
            + " ('Josh', 223), "
            + "('lencho', 234),"  
            + "('Kuma', 21)";
            int rowsAffected = stm.executeUpdate(sql);

            String sql2 = "select * from jdbctable";
            ResultSet rs = stm.executeQuery(sql2);

            rs.next();
            String name;//fetch a data from where the pointer is pointing. here since we have called the rs.next static method at first the pointer would move from attiribute row to first tuple.

            System.out.println("Rows affected: " + rowsAffected);
            int i = 0;
            while (rs.next())
            {   i++; 
                name = rs.getString(i);
                System.out.println(name);
            }

            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}