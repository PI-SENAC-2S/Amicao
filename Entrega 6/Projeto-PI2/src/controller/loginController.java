package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.clienteModel;

public class loginController extends ConectarDAO{

    String sql = "";
    PreparedStatement ps; 

    public loginController() {
        super(); 
    }
    
    // Função Validar Login
    public ResultSet validarLogin(String login, String senha){
        sql = "SELECT * FROM USUARIO WHERE login='"+ login+ "'"
            + " AND senha='" + senha+ "'";

        try {

            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            return result;

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;

        }       
    }
    
     // Puxar Cliente
    public int buscarIdCliente(clienteModel clM, int id_usuario){
        
        sql = "SELECT * FROM cliente WHERE id_usuario='"+ id_usuario+ "'";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            int id_cliente = 0;
            
            if(result.next()){
                id_cliente = result.getInt("idCliente");
            }
                                                
            return id_cliente;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return 0;
        }
        
    }
    
}
