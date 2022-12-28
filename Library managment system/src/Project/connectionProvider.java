/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Mohamad Moaqaly
 * matriculation number: 1310757
 */
public class connectionProvider {
    public static Connection getCon(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","7230676");
        return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
