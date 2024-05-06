package Administrateur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/producttbl", "root", "");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement preparedStatement(String updateQuery) {
        try {
            return connection.prepareStatement(updateQuery);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
