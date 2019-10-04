import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main
    {

    public static void main(String[] args)
        {
        Statement stmt =null;
        ResultSet rs =null;
        Connection conn =ConnectionDatabase.connectToDatabase();
        try
            {
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs =stmt.executeQuery("select  top 3 * from  public .explorers");
            System.out.println(rs.next().);
            } catch (SQLException e)
            {
            e.printStackTrace();
            }
    
        }
    
    }
