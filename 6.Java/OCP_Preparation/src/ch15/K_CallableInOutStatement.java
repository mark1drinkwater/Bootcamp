package ch15;

import java.sql.*;

public class K_CallableInOutStatement {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
        var sql = "{call double_number(?)}";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql)
        ) {
            cs.setInt(1, 8);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
