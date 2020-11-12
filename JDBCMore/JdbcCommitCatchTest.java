package JDBCMore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        System.out.println("hello");
        try (
                //Step1:
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                //Step2:
                Statement stmt = conn.createStatement();
        ) {
            try{
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values (4004, 'Paul Chan', 'Mahjong 101', 4.4, 4)");
                stmt.executeUpdate("insert into books values (4001, 'Peter Chan', 'Mahjong 102', 4.4, 4)");
                conn.commit();
            }catch (SQLException ex){
                System.out.println("____Rolling back changes____");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
