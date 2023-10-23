package ch15;

import java.sql.*;

public class I_CallableStatementWithParam {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
        var sql = "{call read_names_by_letter(?)}";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql)
        ) {
            // Passing parameters to our function. Passing an IN parameter
            cs.setString("prefix", "Z");
            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
