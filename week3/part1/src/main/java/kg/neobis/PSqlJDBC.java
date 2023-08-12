package kg.neobis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PSqlJDBC {
    public static void main(String args[]) throws SQLException {
        Connection c;
        Statement stmt;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/jdbcpost",
                            "postgres", "123");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO BUSINESS (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (1, 'Askar', 76, 'Moskva', 300000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO BUSINESS (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (2, 'Kurmanbek', 73, 'Minsk', 450000.00 );";
            stmt.executeUpdate(sql);


            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

}