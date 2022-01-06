/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public interface DAOGenerico <Obj, Pk> {
    
    public void insert(Obj obj) throws SQLException, ClassNotFoundException;
    public void alter(Obj obj) throws SQLException, ClassNotFoundException;
    public Obj selectPk(Pk chave) throws SQLException, ClassNotFoundException;
    public ArrayList<Obj> selectAll() throws SQLException, ClassNotFoundException;
    
}