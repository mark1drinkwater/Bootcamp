package ch15;

import java.sql.*;

public class J_OUTStatement {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
//        We include two special characters (?=) to specify that the stored procedure
//        has an output value. This is optional since we have the OUT parameter, but it does aid in
//        readability
        var sql = "{?= call magic_number(?) }";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql)
        ) {
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
