/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daves
 */
public class ConnectionSingleton {

    private static Connection conexao;

    private ConnectionSingleton() {
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try{
            if (conexao == null || conexao.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");
                
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_dugustin",
                        "root",
                        "");            
            }
        }catch (SQLException ex){
            throw new SQLException();
        }
        catch (ClassNotFoundException ex){
            throw new ClassNotFoundException();
        }            
            return conexao;
    }
}