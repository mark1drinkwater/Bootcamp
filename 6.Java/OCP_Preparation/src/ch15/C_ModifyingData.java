package ch15;

import java.sql.*;

class C_ModifyingData {
    static Connection connGlobal;

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            connGlobal = conn;
            var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
            var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
            var deleteSql = "DELETE FROM exhibits WHERE id = 10";
            var updateSql2 = "UPDATE names SET name = 'Ezabelle' " + "WHERE name = 'Elsa'";

//            System.out.println("Insert");
//            try (var ps = conn.prepareStatement(insertSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 1
//            }
//            System.out.println("Update");
//            try (var ps = conn.prepareStatement(updateSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 0
//            }
//            System.out.println("Update 2");
//            try (var ps = conn.prepareStatement(updateSql2)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 0
//            }
//            System.out.println("Delete");
//            try (var ps = conn.prepareStatement(deleteSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 1
//            }
//
//            var sql = "SELECT * FROM exhibits";
//            System.out.println("Select:");
//            try (var ps = conn.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//                while (rs.next()) {
//                    System.out.println(rs.getString(2));
//                }
//            }
//
//
//            sql = "SELECT * FROM names";
//            System.out.println("==========Select Names:==============");
//            try (var ps = conn.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//                 while (rs.next()) {
//                     System.out.println(rs.getString(3));
//                 }
//            }

            // The improved way to run SQL.
            query(insertSql);
            query(updateSql);
            query(updateSql2);
            query(deleteSql);

            register(7, 2, "Stripes");

            query("SELECT * FROM names", 3);

            // Will get an exception if we try to get a result from an Update.
//            var sql = "SELECT * FROM names";
//            try (var ps = conn.prepareStatement(sql)) {
//                var result = ps.executeUpdate();
//            }
        }
    }

    public static void query(String s, int... i) throws SQLException {
        int col = 1;
        if (i.length >= 1)
            col = i[0];

        System.out.println("Just using execute:");
        var ps = connGlobal.prepareStatement(s);
        boolean isResultSet = ps.execute();
        if (isResultSet) {
            try (ResultSet rs = ps.getResultSet()) {
                System.out.println("ran a query");
                while (rs.next()) {
                    System.out.println(rs.getString(col));
                }
            }
        } else {
            int result = ps.getUpdateCount();
            System.out.println("ran an update");
            System.out.println("No. Rows affected: " + result);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////
    // Working with parameters:
    public static void register(int key, int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)"; // If you have less ? then columns in your table then you get an exception

        try (PreparedStatement ps = connGlobal.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name); // If you don't pass all parameters, you get an exception
            ps.setInt(2, type);
            // You can use setObject() and Java will auto-convert to the applicable wrapper type:
//            ps.setObject(1, key);
//            ps.setObject(2, type);
//            ps.setObject(3, name);
            ps.executeUpdate();
        }
    }
}