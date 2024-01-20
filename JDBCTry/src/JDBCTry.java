import java.sql.*;

public class JDBCTry {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "lincozino";

        // 1. Register the driver
        Class.forName(driver);

        // 2. create connection
        Connection con = DriverManager.getConnection(url, username, password);

        // 3. create statement that is used to excute query
        Statement st = con.createStatement();

        // 4. Exicute queries
        // CREATE DATABASE NAMED DBTry
        String dbquery = "CREATE DATABASE IF NOT EXISTS DBTry";
        st.executeUpdate(dbquery);
        System.out.println("Database is seccessfully created!");

        // USE DBTry database
        String usequery = "USE DBTry";
        st.executeUpdate(usequery);
        System.out.println("Database is ready ro use!");

        // CREATE TABLE NAMED TableTry
        String tablequery = "CREATE TABLE TableTry(id int  PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), department VARCHAR(20))";
        st.executeUpdate(tablequery);
        System.out.println("Table is seccusfully created!");

        // INSERT DATA INTO THE DATABASE TABLE
        String insertdata = "INSERT INTO TableTry (name, department) VALUES ('John Doe', 'Finance'), ('Jane Smith', 'Marketing'), ('Alice Johnson', 'Human Resources'), ('Bob Anderson', 'Sales'), ('Sarah Williams', 'IT')";
        int affectedRow = st.executeUpdate(insertdata);
        System.out.println(affectedRow + " is affected!");

        // 5. process result eg. retreiving and fetching data from database using
        // RESULTSET INTERFACE
        ResultSet rs;

        // RETRIVE ALL DATA FROM THE TABLETRY DATABASE
        String fetch = "SELECT * FROM TableTry";
        rs = st.executeQuery(fetch);

        // ---using Resultset interface methods we can fetch eveydata in our resultset
        // rs.
        while (rs.next()) {
            int ID = rs.getInt("id");
            String NAME = rs.getString("name");
            String DEPARTMENT = rs.getString("name");
            System.out.println("ID: " + ID + " NAME: " + NAME + " DEPARTmENT: " + DEPARTMENT);
        }

        // 6. Close the connection
        st.close();
        con.close();
    }
}
