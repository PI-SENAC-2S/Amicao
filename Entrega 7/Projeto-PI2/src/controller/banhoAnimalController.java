package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.servicosModel;

public class banhoAnimalController extends ConectarDAO{

    String sql = "";
    PreparedStatement ps; 

    public banhoAnimalController() {
        super(); 
    }
    
    // Puxar animais com id do cliente
    public ResultSet buscarIdAnimal(int id_cliente){
        
        sql = "SELECT * FROM animal WHERE id_cliente='"+ id_cliente+ "'";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();                                       
                                                
            return result;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }        
    }
    
    // Puxar um uníco Animal de um único cliente
    public ResultSet buscarAnimalCliente(int id_cliente, String nome){
        
        sql = "SELECT * FROM animal WHERE id_cliente='"+ id_cliente+ "'"
                + "AND apelido='"+ nome+ "'";
        
        try {            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();                                       
                                                
            return result;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }        
    }   
    
    //Tabela serviços
    public void incluirServicos(servicosModel sv){
    
        sql = "INSERT INTO servicos VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = mycon.prepareStatement(sql);
        
            ps.setInt(1, sv.getIdServicos());
            ps.setString(2, sv.getData());
            ps.setString(3, sv.getObservacoes());
            ps.setString(4, sv.getForma_pagamento());
            ps.setInt(5, sv.getId_animal());
            ps.setInt(6, sv.getId_cliente()); //id_cliente
            ps.setInt(7, 1); //id_funcionario 
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Serviço solicitado com sucesso!");
       
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir o o serviço!! " +  err.getMessage());
            
        }                
    }    
}
