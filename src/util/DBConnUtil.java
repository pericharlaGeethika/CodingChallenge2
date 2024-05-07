package util;
//import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.Properties;

public class DBConnUtil {
    public static Connection getConnection(String filename)  {
        // Get the connection string using the getConnectionString method from DBPropertyUtil
        //String connectionString = DBPropertyUtil.getConnectionString(filename);

        // Establish the connection
        //Connection connection = DriverManager.getConnection(connectionString);

       // return connection;
    	Connection connection = null;
        try {
            // Get the connection string using the getConnectionString method from DBPropertyUtil
            String connectionString = DBPropertyUtil.getConnectionString(filename);

            // Establish the connection
            connection = DriverManager.getConnection(connectionString);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace(); // or log the exception or throw a custom exception
        }
        return connection;
    }

    // Example of loading JDBC driver (you may need to load your specific driver)
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}