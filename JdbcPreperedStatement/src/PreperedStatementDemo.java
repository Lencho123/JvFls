import java.sql.*;

public class PreperedStatementDemo {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String uname = "root";
        String password = "lincozino";
        String url = "jdbc:mysql://localhost:3306/StudentDB";

        ///////////////////////////////////////////////////
        try {

            // 1.connedct to database
            Connection connection = DriverManager.getConnection(url, uname, password);

            // 2. Insert new student record
            insertStudent(connection, "Bitny", "101101", "linna@gmail.com", "+2512123243", "Bole");
            // update data
            updateStudent(connection, 1, "Lenna", "101101", "linna@gmail.com", "+2512123243", "kjlkj09");
            retrieveStudent(connection, 15);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    ///////////////////////////////////////
    private static void insertStudent(Connection connection, String name, String roleNumber,
            String email, String phoneNumber, String address) throws SQLException {
        String sql = "INSERT INTO Students (Name, Role_number, Email, Phone_number, Address) VALUES(?,?,?,?,?)";
        try (
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, roleNumber);
            statement.setString(3, email);
            statement.setString(4, phoneNumber);
            statement.setString(5, address);

            int affectedRow = statement.executeUpdate();
            if (affectedRow > 0) {
                System.out.println("Data is inserted seccesfully");
            }
        }
    }

    /////////// update using id method
    private static void updateStudent(Connection connection, int id, String name, String roleNumber,
            String email, String phoneNumber, String address) throws SQLException {
        String sql = "UPDATE Students  SET Name=?, Role_number= ?, Email = ?, Phone_number = ?, Address = ? WHERE Id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, roleNumber);
            statement.setString(3, email);
            statement.setString(4, phoneNumber);
            statement.setString(5, address);
            statement.setInt(6, id);

            int affectedRow = statement.executeUpdate();
            if (affectedRow > 0) {
                System.out.println("Data is updated seccesfully");
            }
        }
    }

    ////////////////////////// Retrieve data using ID set////////////////////
    private static void retrieveStudent(Connection connection, int Id) throws SQLException {
        String sql = "SELECT name, role_number, email, phone_number, address FROM Students wHERE Id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, Id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("      The Student Information: ");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Role_Number: " + rs.getString("role_number"));
                System.out.println("Email: "+ rs.getString("email"));
                System.out.println("Phone_number: "+ rs.getString("phone_number"));
                System.out.println("Address: "+ rs.getString("address"));

            }
        }
    }
}
