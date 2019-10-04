import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public  class ConnectionDatabase
    {
    private static final String USERNAME="diabasread";
    private static final String PASSWORD="Unionen99";
    private static final String CONN_STRING="jdbc:hsqldb:data/explorecalifornia";


    public static Connection  connectToDatabase()
        {

        Connection conn = null;
        try
            {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("CONNECTED");
            }
        catch (SQLException e)
            {
            System.err.println(e);
            }
        
        return conn;
        }
    
    }
