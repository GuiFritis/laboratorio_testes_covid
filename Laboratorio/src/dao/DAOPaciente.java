/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Paciente;
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
public class DAOPaciente implements DAOGenerico<Paciente, String>{
    
    public void insert(Paciente obj) throws SQLException, ClassNotFoundException{             
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "insert into paciente "
                + "(nome, cpf, senha, dataNasc, sexo, comorbidade) "
                + "values (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, obj.getNome().toUpperCase());
        pre.setString(2, obj.getCpf());
        pre.setString(3, obj.getSenha());
        pre.setString(4, obj.getDataNasc());        
        pre.setString(5, obj.getSexo().toUpperCase());
        pre.setBoolean(6, obj.isComorbidade());
        
        pre.executeUpdate();
    
    }
    
    public void alter(Paciente obj) throws SQLException, ClassNotFoundException{
        
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "update paciente set "
                + "nome = ?, "
                + "dataNasc = ?, "
                + "sexo = ?, "
                + "comorbidade = ? "
                + "where cpf = ?";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, obj.getNome().toUpperCase());
        pre.setString(2, obj.getDataNasc());
        pre.setString(3, obj.getSexo().toUpperCase());
        pre.setBoolean(4, obj.isComorbidade());
        pre.setString(5, obj.getCpf());
        
        pre.executeUpdate();
        
    }
    
    public Paciente selectPk(String chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from paciente "
                + "where cpf = ?";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, chave);
        
        ResultSet rs = pre.executeQuery();
        
        Paciente paciente = null;
            
            if (rs.next()) {
                paciente = new Paciente(rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("sexo"), 
                rs.getString("dataNasc"), 
                rs.getString("senha"),
                rs.getBoolean("comorbidade"));

                return paciente;
            } else {
                return paciente;
            }
    }
    
    public ArrayList<Paciente> selectAll() throws ClassNotFoundException, SQLException {
       Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from paciente "
                + "order by nome";

        PreparedStatement pre = c.prepareStatement(sql);

        ResultSet rs = pre.executeQuery();

        ArrayList<Paciente> lista = new ArrayList<>();
        while (rs.next()) {
            Paciente p = new Paciente(rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("sexo"), 
                rs.getString("dataNasc"), 
                rs.getString("senha"),
                rs.getBoolean("comorbidade"));

            lista.add(p);
        } 
        
        return lista;
    
    }
    
    public ArrayList<Paciente> selectNome(String nome) throws ClassNotFoundException, SQLException {
       Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from paciente "
                + "where nome like ? "
                + "order by nome";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, "%" + nome + "%");

        ResultSet rs = pre.executeQuery();

        ArrayList<Paciente> lista = new ArrayList<>();
        while (rs.next()) {
            Paciente p = new Paciente(rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("sexo"), 
                rs.getString("dataNasc"), 
                rs.getString("senha"),
                rs.getBoolean("comorbidade"));

            lista.add(p);
        } 
        
        return lista;
    
    }
    
}