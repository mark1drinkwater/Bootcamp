package igbook2.lesson18.practice1;

import java.sql.*;

public class Practice1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/Movies";
        String user = "root";
        String pw = "password";

        // Load Driver
        // No longer necessary as of JDBC 4.0 to manually load the driver.
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // A try-with-resources example
        // Connection and Statement implement java.lan.AutoCloseable
        try (
                // Connection is the session between your Java application and database.
                Connection con = DriverManager.getConnection(url, user, pw)) {
            // Statement is a static object used to execute your SQL statements and return the result.
            Statement stmt = con.createStatement();

            // Insert a new Employee.
            String query = "INSERT INTO EMPLOYEE VALUES(400, 'Bill', 'Murray', '1950-09-21', 150000)";
            if (stmt.executeUpdate(query) != 1) {
                System.out.println("Failed to add a new employee record");
            }

            query = "select * from EMPLOYEE";

            // ResultSet is an object representing the database result set.
            ResultSet rs = stmt.executeQuery(query);

            // Loop through and print out all the records.
            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birth_date = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first.trim() + " " + last.trim() + "\n"
                        + "Birth Date:    " + birth_date + "\n"
                        + "Salary:        " + salary + "\n");
            }

        } catch (SQLException e) {
            System.out.println("Exception creating connection: " + e);
            System.exit(0);
        }
        // No need to close the Connection and Statement objects, the compiler
        // will generate these for us and call the close() statement on this
        // objects in the order we obtained them in the try
    }

}
