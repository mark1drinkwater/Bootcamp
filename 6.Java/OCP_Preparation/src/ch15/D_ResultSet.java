package ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class D_ResultSet {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:hsqldb:file:zoo";
        // Reading a ResultSet
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "SELECT id, name FROM exhibits";
            var idToNameMap = new HashMap<Integer, String>();

            try (var ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
//                    int id = rs.getInt("id");
//                    String name = rs.getString("name");
////                    int id = rs.getInt("total"); // java.sql.SQLException: Column not found: total
//                    idToNameMap.put(id, name);
//                }
//                System.out.println(idToNameMap); // This is the first line that goes outside the while loop


                    ////// Getting Data for a column (Goes inside while loop)
                    Object idField = rs.getObject("id");
                    Object nameField = rs.getObject("name");
                    if (idField instanceof Integer id)
                        System.out.println(id);
                    if (nameField instanceof String name)
                        System.out.println(name);
                    // Using Bind variables
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
