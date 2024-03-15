/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dauxu
 */
public class ConnecSQL {
        public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            +"databaseName=gara3;user=sa;password = 123456";
    public static Connection getDBConnect(){
        try{
            Connection conn = null;
            conn = DriverManager.getConnection(connectionUrl);
            return conn; 
        }catch(SQLException ex){
            System.out.println("Error"+ex.toString());
        }
        return null ;
    }

  
}

