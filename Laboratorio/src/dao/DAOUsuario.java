/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Usuario;
import conexao.ConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilh
 */
public class DAOUsuario {
    
    public Usuario logar(String usuario, String senha) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from mysql.user "
                + "where user = ? and password = ?";

        PreparedStatement pre = c.prepareStatement(sql);

        pre.setString(1, usuario);
        pre.setString(2, senha);

        ResultSet rs = pre.executeQuery();

        Usuario user = null;
        if (rs.next()) {
            user = new Usuario(rs.getString("user"), rs.getString("password"));
            
            return user;
        }
        else{
            sql = "select cpf, senha from paciente "
                + "where cpf = ? and senha = ?";

            pre = c.prepareStatement(sql);

            pre.setString(1, usuario);
            pre.setString(2, senha);

            rs = pre.executeQuery();
            
            if (rs.next()) {
                user = new Usuario((rs.getString("cpf")), rs.getString("senha"));

                return user;
            } else { 
                return user;
            }
        }
    }
    
}
