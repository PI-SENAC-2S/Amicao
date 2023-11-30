package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class homeClienteController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public homeClienteController(){
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
}
