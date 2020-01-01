
package database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConnectToDatabase {

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String sql = null;

    private static void setConnection() {

        try {

            File file = new File(new File("").getAbsolutePath()+"/FPBM-RES/");
            
            if(!file.exists()){
                
                file.mkdirs();
            }

            Class.forName("org.sqlite.JDBC");
            ConnectToDatabase.connection = DriverManager.getConnection(
                    "jdbc:sqlite:" + file.getAbsolutePath() + "/datas.sqlite");
            ConnectToDatabase.statement = ConnectToDatabase.connection.createStatement();
            ConnectToDatabase.statement.execute("CREATE  TABLE  IF NOT EXISTS numbers("
                    + "name VARCHAR NOT NULL  UNIQUE , "
                    + "numbers VARCHAR, address VARCHAR, mail VARCHAR, website VARCHAR)");
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void executeQuery() {

        try {

            ConnectToDatabase.setConnection();
            ConnectToDatabase.statement.execute(sql);
            ConnectToDatabase.resultSet = ConnectToDatabase.statement.getResultSet();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static ResultSet getResult(String sql) {

        try {

            ConnectToDatabase.sql = sql;
            ConnectToDatabase.executeQuery();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }

        return ConnectToDatabase.resultSet;
    }
}
