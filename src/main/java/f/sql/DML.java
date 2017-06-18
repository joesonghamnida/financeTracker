package f.sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DML {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    //TODO: ENCRYPT ENCRYPT ENCRYPT

    public static void insertRecord(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

    public static void updateRecord(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

    public static void retrieveRecord(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

    public static void deleteRecord(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

    public static void withdrawMoney(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

    public static void depositMoney(Connection conn)throws SQLException{
        PreparedStatement statement = conn.prepareStatement("");
    }

}
