package ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class G_BindVariables {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
        var sql = "SELECT id, name FROM exhibits WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql);) {
            ps.setString(1, "Zebra");

            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + " : " + name);
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }






    }
}

