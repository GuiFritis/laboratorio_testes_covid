/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.EFormaColeta;
import classes.EMotivo;
import classes.Recoleta;
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
public class DAORecoleta implements DAOGenerico<Recoleta, Integer> {
    
    public void insert(Recoleta obj) throws SQLException, ClassNotFoundException{
        
        new DAOColeta().insert(obj);

        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "insert into recoleta "
                + "(codRecoleta, codColetaPai, motivo, primeira) "
                + "values(?, ?, ?, ?);";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setInt(1, obj.getCodColeta());
        pre.setInt(2, obj.getColetaPai().getCodColeta());
        pre.setString(3, String.valueOf(obj.getMotivo()));
        pre.setBoolean(4, obj.isPrimeira());
                
        pre.executeUpdate();
    
    }
    
    public void alter(Recoleta obj) throws SQLException, ClassNotFoundException{
        
        new DAOColeta().alter(obj);
        
        Connection c = ConnectionSingleton.getConnection();
                
        String sql = "update recoleta set "
                + "codColetaPai = ?, "
                + "motivo = ?, "
                + "primeira = ? "
                + "where codRecoleta = ?";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setInt(1, obj.getColetaPai().getCodColeta());
        pre.setString(2, String.valueOf(obj.getMotivo()));
        pre.setBoolean(3, obj.isPrimeira());
        pre.setInt(4, obj.getCodColeta());
                
        pre.executeUpdate();
        
    }
    
    public Recoleta selectPk(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from "
                + "recoleta r inner join coleta c on "
                + "r.codRecoleta = c.codColeta "
                + "where r.codRecoleta = ?";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setInt(1, chave);
        
        ResultSet rs = pre.executeQuery();
         
        Recoleta recoleta = new Recoleta(new DAOColeta().selectPk(rs.getInt("codColetaPai")),
            EMotivo.valueOf(rs.getString("motivo")),
            rs.getBoolean("primeira"),
            rs.getInt("codRecoleta"),
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(String.valueOf(rs.getInt("cpf"))), 
            rs.getString("horarioColeta"),  
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            rs.getBoolean("sucesso"),
            rs.getString("observacao"));
        
        return new Recoleta();
    }
    
    public ArrayList<Recoleta> selectAll() throws SQLException, ClassNotFoundException{      
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from "
                + "recoleta r inner join coleta c on "
                + "r.codRecoleta = c.codColeta "
                + "order by codRecoleta";

        PreparedStatement st = c.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        ArrayList<Recoleta> recoletas = new ArrayList<>();
        
        while(rs.next()){
            Recoleta recoleta = new Recoleta(new DAOColeta().selectPk(rs.getInt("codColetaPai")),
                EMotivo.valueOf(rs.getString("motivo")),
                rs.getBoolean("primeira"),
                rs.getInt("codRecoleta"),
                rs.getString("profissional"), 
                rs.getString("cidade"), 
                rs.getString("tipoMaterial"), 
                new DAOPaciente().selectPk(String.valueOf(rs.getInt("cpf"))), 
                rs.getString("horarioColeta"),  
                EFormaColeta.valueOf(rs.getString("formaColeta")),
                rs.getBoolean("sucesso"),
                rs.getString("observacao"));
        }
        
        return recoletas;
    }
      
        
}
