package f.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL {

    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./main");
        return conn;
    }

    //TODO: ENCRYPT ENCRYPT ENCRYPT

    //tables to be created: bank, account type (checking or savings), credit cards, loans

    /*
    //TODO: flesh out db
    public static void createDatabase(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS finances(id IDENTITY)");
    }
    */

    public static void createBanksTable(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS banks(id IDENTITY )");
    }

    public static void createAccountsTable(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS accounts(id IDENTITY )");
    }

    public static void createCreditCardsTable(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS creditCards(id IDENTITY )");
    }

    public static void createLoansTable(Connection conn)throws SQLException{
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS loans(id IDENTITY )");
    }

}
