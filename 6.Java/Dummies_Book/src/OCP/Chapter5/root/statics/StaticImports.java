package OCP.Chapter5.root.statics;

import java.util.Date;

public class StaticImports {
    public static void main(String[] args) {
        Date d1 = new Date();
        java.sql.Date sd = new java.sql.Date(2023,9,26);
    }
}
