/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Teste;
import conexao.ConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class DAOTeste{
    
    public void insert(Teste obj) throws SQLException, ClassNotFoundException{             
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "insert into teste "
                + "(numTeste, usado) values (?, false)";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, obj.getNumTeste());
        
        pre.executeUpdate();
    
    } 
    
    public Teste selectPk(String chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from teste "
                + "where numTeste = ?";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, chave);
        
        ResultSet rs = pre.executeQuery();
        
        Teste teste = null;
            
            if (rs.next()) {
                teste = new Teste(rs.getString("numTeste"));

                return teste;
            } else {
                return teste;
            }
    }
    
    public ArrayList<Teste> selectAll() throws ClassNotFoundException, SQLException {
       Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from teste ";

        PreparedStatement pre = c.prepareStatement(sql);

        ResultSet rs = pre.executeQuery();

        ArrayList<Teste> lista = new ArrayList<>();
        while (rs.next()) {
            Teste teste = new Teste(rs.getString("numTeste"));

            lista.add(teste);
        } 
        
        return lista;
    
    }
    
    public ArrayList<Teste> selectTestesParaExame() throws ClassNotFoundException, SQLException {
       Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from TNusados";

        PreparedStatement pre = c.prepareStatement(sql);

        ResultSet rs = pre.executeQuery();

        ArrayList<Teste> lista = new ArrayList<>();
        while (rs.next()) {
            Teste teste = new Teste(rs.getString("numTeste"));

            lista.add(teste);
        } 
        
        return lista;
    
    }
    
    public ArrayList<Teste> selectNum(String numTeste) throws ClassNotFoundException, SQLException {
       Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from teste "
                + "where numTeste like ? "
                + "order by numTeste";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, numTeste + "%");

        ResultSet rs = pre.executeQuery();

        ArrayList<Teste> lista = new ArrayList<>();
        while (rs.next()) {
            Teste teste = new Teste(rs.getString("numTeste"));

            lista.add(teste);
        } 
        
        return lista;
    
    }
    
}
