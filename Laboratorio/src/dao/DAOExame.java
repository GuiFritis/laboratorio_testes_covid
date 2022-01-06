/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.EResultado;
import classes.Exame;
import conexao.ConnectionSingleton;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class DAOExame implements DAOGenerico<Exame, Integer>{
    
        
    public void insert(Exame obj) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "insert into exame "
                + "(codExame, nome, numTeste, codColeta, resultado, "
                + "diaExame, valido, validado, observacao) "
                + "values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        int codExame = 1;
        
        try{
            ResultSet result = pre.executeQuery("select LAST_INSERT_ID();");
            result.next();
            codExame = result.getInt(1);            
        } catch(Exception ex){
            System.out.println("Problema com result;");
        }
        
        obj.setCodExame(codExame);
                
        pre = c.prepareStatement(sql);
        
       pre.setInt(1, obj.getCodExame());
       pre.setString(2, obj.getNome());
       pre.setString(3, obj.getTeste().getNumTeste());
       pre.setInt(4, obj.getColeta().getCodColeta());
       pre.setString(5, String.valueOf(obj.getResultado()));
       pre.setString(6, obj.getDiaExame());
       pre.setBoolean(7, obj.isValido());
       pre.setBoolean(8, obj.isValidado());
       pre.setString(9, obj.getObservacao());
       
        
        pre.executeUpdate();
    
    }
    
    public void alter(Exame obj) throws SQLException, ClassNotFoundException{
        
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "update exame set "
                + "nome = ?, "
                + "resultado = ?, "
                + "diaExame = ?, "
                + "validado = ?, "
                + "observacao = ? "
                + "where codExame = ?";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
       pre.setString(1, obj.getNome());
       pre.setString(2, String.valueOf(obj.getResultado()));
       pre.setString(3, obj.getDiaExame());
       pre.setBoolean(4, obj.isValidado());
       pre.setString(5, obj.getObservacao());
       pre.setInt(6, obj.getCodExame());
       
       pre.executeUpdate();
        
    }
    
    public Exame selectPk(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from exame "
                + "where codExame = ? "
                + "order by codExame";
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setInt(1, chave);
        
        ResultSet rs = pre.executeQuery();
        
        Exame exame = null;
        
        if(rs.next()){
            exame = new Exame(rs.getString("nome"),
        rs.getString("observacao"),
        chave,
        rs.getBoolean("valido"),
        rs.getBoolean("validado"),
        rs.getString("diaExame"),
        EResultado.valueOf(rs.getString("resultado")),
        new DAOColeta().selectPk(rs.getInt("codColeta")),
        new DAOTeste().selectPk(rs.getString("numTeste")));
            return exame;
        }else{
            return exame;
        }       
        
    }  
    
    public ArrayList<Exame> selectAll() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from exame "
                + "order by codExame";

        PreparedStatement pre = c.prepareStatement(sql);

        ResultSet rs = pre.executeQuery();

        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }
    
    public ArrayList<Exame> examesPaciente(String cpf) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from exame e inner join coleta c "
                + "on e.codColeta = c.codColeta "
                + "where c.cpfPaciente like ? "
                + "order by cpfPaciente";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, cpf + "%");
        
        ResultSet rs = pre.executeQuery();
        
        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }  
    
    public ArrayList<Exame> Invalidados() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "select * from einvalidados";
        
        PreparedStatement pre = c.prepareStatement(sql);
        
        ResultSet rs = pre.executeQuery();
        
        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }
    
    public void validarExame(int codExame, boolean valido) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();
        
        String sql = "update exame set "
                + "validado = true, "
                + "valido = ? "
                + "where codExame = ?";
        
         PreparedStatement pre = c.prepareStatement(sql);
         
         pre.setBoolean(1, valido);
         pre.setInt(2, codExame);
         
         pre.executeUpdate();
        
    }
    
    public ArrayList<Exame> selectNumTeste(String numTeste) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from exame "
                + "where numTeste like ? "
                + "order by numTeste";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, numTeste + "%");

        ResultSet rs = pre.executeQuery();

        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }    
    
    public ArrayList<Exame> selectCodColeta(String codColeta) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from exame "
                + "where codColeta like ? "
                + "order by codColeta";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, codColeta + "%");

        ResultSet rs = pre.executeQuery();

        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }
    
    public ArrayList<String[]> getDias() throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from dias";

        PreparedStatement pre = c.prepareStatement(sql);

        ResultSet rs = pre.executeQuery();

        ArrayList<String []> linhas = new ArrayList<>();
        
        while(rs.next()){
            String[] linha = new String[2];
            linha[0] = rs.getString("diaExame");
            linha[1] = rs.getString("quantidade");
            
            linhas.add(linha);
        }
        
        return linhas;
    }
    
    public ArrayList<Exame> dia(String dia) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select * from exame "
                + "where diaExame = ? "
                + "order by codExame";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, dia);

        ResultSet rs = pre.executeQuery();

        ArrayList<Exame> exames = new ArrayList<>();
        
        while (rs.next()) {
            Exame exame = new Exame(rs.getString("nome"),
                rs.getString("observacao"),
                rs.getInt("codExame"),
                rs.getBoolean("valido"),
                rs.getBoolean("validado"),
                rs.getString("diaExame"),
                EResultado.valueOf(rs.getString("resultado")),
                new DAOColeta().selectPk(rs.getInt("codColeta")),
                new DAOTeste().selectPk(rs.getString("numTeste")));
            
            exames.add(exame);
        } 
        
        return exames;
    }   
    
    public int numPacientesAtendidos(String dia) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select count(*) as quantidade "
                + "from exame e inner join coleta c on e.codColeta = c.codColeta "
                + "inner join paciente p on c.cpfPaciente = p.cpf "
                + "where e.diaExame = ?";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, dia);

        ResultSet rs = pre.executeQuery();
        
        if(rs.next()){
            return rs.getInt("quantidade");
        }
        return 0;
    }
    
    public int selectResultado(String result, String dia) throws SQLException, ClassNotFoundException{
        Connection c = ConnectionSingleton.getConnection();

        String sql = "select count(*) as quantidade from exame "
                + "where resultado = ? and diaExame = ?";

        PreparedStatement pre = c.prepareStatement(sql);
        
        pre.setString(1, result);
        pre.setString(2, dia);

        ResultSet rs = pre.executeQuery();
        
        rs.next();
        
        return rs.getInt("quantidade");
        
    }
          
}
