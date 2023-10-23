package ch15;

import java.sql.*;

class B_MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM names");
             ResultSet rs = ps.executeQuery()) {
            System.out.println(conn);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }



        }
    }
}