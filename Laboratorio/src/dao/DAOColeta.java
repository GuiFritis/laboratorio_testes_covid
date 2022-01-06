/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Coleta;
import classes.EFormaColeta;
import classes.EMotivo;
import classes.Paciente;
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
public class DAOColeta implements DAOGenerico<Coleta, Integer> {
    
    public void insert(Coleta obj) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "insert into coleta "
                + "(codColeta, cpfPaciente, profissional, cidade, tipoMaterial, "
                + "formaColeta, horarioColeta, sucesso, usado, observacao) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, false, ?)";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        int codColeta = 1;
        
        try{
            ResultSet result = pre.executeQuery("select LAST_INSERT_ID();");
            result.next();
            codColeta = result.getInt(1);            
        } catch(Exception ex){
            System.out.println("Problema com result;");
        }
        
        obj.setCodColeta(codColeta);
                
        pre = c.prepareStatement(sql);
        
        pre.setInt(1, obj.getCodColeta());
        pre.setString(2, obj.getPaciente().getCpf());
        pre.setString(3, obj.getProfissional().toUpperCase());
        pre.setString(4, obj.getCidade().toUpperCase());
        pre.setString(5, obj.getTipoMaterial().toUpperCase());
        pre.setString(6, obj.getFormaColeta().toString().toUpperCase());
        pre.setString(7, obj.getHorarioColeta().toUpperCase());
        pre.setBoolean(8, obj.isSucesso());
        pre.setString(9, obj.getObservacao());
        
        pre.executeUpdate();
    
    }
    
    public void alter(Coleta obj) throws SQLException, ClassNotFoundException{
        
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "update coleta set "
                + "cpfPaciente = ?,"
                + "profissional = ?, "
                + "cidade = ?, "
                + "tipoMaterial = ?, "
                + "formaColeta = ?, "
                + "horarioColeta = ?, "
                + "sucesso = ?, "
                + "observacao = ? "
                + "where codColeta = ?";
        
        PreparedStatement pre = c.prepareStatement(sql);
               
        pre.setString(1, obj.getPaciente().getCpf());
        pre.setString(2, obj.getProfissional().toUpperCase());
        pre.setString(3, obj.getCidade().toUpperCase());
        pre.setString(4, obj.getTipoMaterial().toUpperCase());
        pre.setString(5, obj.getFormaColeta().toString().toUpperCase());
        pre.setString(6, obj.getHorarioColeta().toUpperCase());
        pre.setBoolean(7, obj.isSucesso());
        pre.setString(8, obj.getObservacao());        
        pre.setInt(9, obj.getCodColeta()); 
        
        pre.executeUpdate();
        
    }
    
    public Coleta selectPk(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from coleta "
                + "where codColeta = ?";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setInt(1, chave);
        
        ResultSet rs = pre.executeQuery();
        
        Coleta coleta = null;
        if(rs.next()){
            coleta = new Coleta(rs.getInt("codColeta"), 
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(rs.getString("cpfPaciente")),
            rs.getString("horarioColeta"),  
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            rs.getBoolean("sucesso"),
            rs.getString("observacao"));
            
            return coleta;
        }
        else{
            return coleta;
        }
        
    }
    
    public ArrayList<Coleta> selectAll() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from coleta "
                + "order by codColeta";

        PreparedStatement st = c.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        ArrayList<Coleta> coletas = new ArrayList<>();
        while (rs.next()) {
            Coleta coleta = new Coleta(rs.getInt("codColeta"), 
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(rs.getString("cpfPaciente")), 
            rs.getString("horarioColeta"),  
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            rs.getBoolean("sucesso"),
            rs.getString("observacao"));
            
            coletas.add(coleta);
        } 
        
        return coletas;
    }
    
    public ArrayList<Coleta> selectAllCR() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from allCR";

        PreparedStatement st = c.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        ArrayList<Coleta> coletas = new ArrayList<>();
        while (rs.next()) {
                Coleta coleta;
           if(rs.getInt("codRecoleta") == 0){
                coleta = new Coleta(rs.getInt("codColeta"), 
                rs.getString("profissional"), 
                rs.getString("cidade"), 
                rs.getString("tipoMaterial"), 
                new DAOPaciente().selectPk(rs.getString("cpfPaciente")), 
                rs.getString("horarioColeta"),  
                EFormaColeta.valueOf(rs.getString("formaColeta")),
                rs.getBoolean("sucesso"),
                rs.getString("observacao"));
           } else {
               coleta = new Recoleta(new DAOColeta().selectPk(rs.getInt("codColetaPai")),
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
            
            coletas.add(coleta);
        } 
        
        return coletas;
    }
    
    public ArrayList<Coleta> selectColetasParaExame() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from CNusadas";

        PreparedStatement st = c.prepareStatement(sql);

        ResultSet rs = st.executeQuery();

        ArrayList<Coleta> coletas = new ArrayList<>();
        while (rs.next()) {
            Coleta coleta = new Coleta(rs.getInt("codColeta"), 
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(rs.getString("cpfPaciente")), 
            rs.getString("horarioColeta"),  
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            true,
            rs.getString("observacao"));
            
            coletas.add(coleta);
        } 
        
        return coletas;
    }
    
    public ArrayList<Coleta> coletasPaciente(String cpf) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from coleta "
                + "where cpfPaciente like ? "
                + "order by cpfPaciente";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, cpf + "%");
        
        ResultSet rs = pre.executeQuery();
        
        ArrayList<Coleta> coletas = new ArrayList<>();
        
        while(rs.next()){
            Coleta coleta = new Coleta(rs.getInt("codColeta"), 
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(cpf),
            rs.getString("horarioColeta"), 
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            rs.getBoolean("sucesso"),
            rs.getString("observacao"));
            
            coletas.add(coleta);
        }
                
        return coletas;
    }
    
    public ArrayList<Coleta> selectMaterial(String material) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from coleta "
                + "where tipoMaterial like ? "
                + "order by tipoMaterial";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, "%" + material + "%");
        
        ResultSet rs = pre.executeQuery();
        
        ArrayList<Coleta> coletas = new ArrayList<>();
        
        while(rs.next()){
            Coleta coleta = new Coleta(rs.getInt("codColeta"), 
            rs.getString("profissional"), 
            rs.getString("cidade"), 
            rs.getString("tipoMaterial"), 
            new DAOPaciente().selectPk(rs.getString("cpfPaciente")),
            rs.getString("horarioColeta"), 
            EFormaColeta.valueOf(rs.getString("formaColeta")),
            rs.getBoolean("sucesso"),
            rs.getString("observacao"));
            
            coletas.add(coleta);
        }
                
        return coletas;
    } 
    
}
