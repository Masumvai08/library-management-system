
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            Connction con=DriverManager.getConnection("jdbc:mysql://localhost:8080/lms","root");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
