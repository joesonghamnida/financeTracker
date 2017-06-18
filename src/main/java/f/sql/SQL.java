package f.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    //tables to be created: bank, account type (checking or savings), credit cards, loans

    //TODO: flesh out db
    public static void createDatabase(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS finances(id IDENTITY)");
    }

    public static void createBanksTable(Connection conn)throws SQLException{

    }

    public static void createAccountsTable(Connection conn)throws SQLException{

    }

    public static void createCreditTable(Connection conn)throws SQLException{

    }

    public static void createLoansTable(Connection conn)throws SQLException{

    }

    public static void insertRecord(){}

    public static void updateRecord(){}

    public static void retrieveRecord(){}

    public static void deleteRecord(){}

    public static void withdrawMoney(){}

    public static void depositMoney(){}

}
