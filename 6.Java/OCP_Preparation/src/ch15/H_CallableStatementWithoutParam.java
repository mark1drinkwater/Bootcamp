package ch15;

import java.sql.*;

public class H_CallableStatementWithoutParam {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
        String sql = "{call read_e_names()}";
//        Calling a Procedure without Parameters
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
