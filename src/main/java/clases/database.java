package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/donostiluxdrive", "root", ""); // root is the default username while "" or empty is for the password
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
