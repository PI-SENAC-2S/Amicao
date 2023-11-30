package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.clienteModel;
import model.enderecoModel;
import model.usuarioModel;

public class cadastroLoginController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public cadastroLoginController() {
        super(); 
    }
    
    // Tabela incluir Usuario
    public void incluirUsuario(usuarioModel usM){
        
        sql = "INSERT INTO usuario VALUES (?, ?, ?, ?)";

        try {
            
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, usM.getIdUsuario());
            ps.setString(2, usM.getLogin());
            ps.setString(3, usM.getSenha());
            ps.setString(4, usM.getTipo());
            ps.execute();
            ps.close();

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, "Erro ao incluir o usuário! " +  err.getMessage());

        }       
    }
           
    //Tabela Cliente
    public void incluirEndereco(enderecoModel en){
        
        sql = "INSERT INTO endereco VALUES (?, ?, ?, ?)";
        
        try {
            
            ps = mycon.prepareStatement(sql);
            
            ps.setInt(1, en.getIdEndereco());
            ps.setString(2, en.getRua());
            ps.setInt(3, en.getNumero());
            ps.setString(4, en.getCep());
            
            ps.execute();
            ps.close();
            
            
        } catch (SQLException err ) {
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir o endereço! " +  err.getMessage());
            
        }
    }

    // Puxar Endereco
    public int buscarIdEndereco(enderecoModel enM){   
        
        sql = "SELECT * FROM endereco WHERE rua='"+ enM.getRua()+ "'"
                + "AND numero='"+ enM.getNumero()+ "'"
                + "AND cep='"+ enM.getCep()+ "'";        
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            int id_endereco = 0;
            
            if(result.next()){                
                id_endereco = result.getInt("idEndereco");
            }
                                                
            return id_endereco;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return 0;
        }        
    }
    
    // Puxar Usuario
    public int buscarIdUsuario(usuarioModel usM){
        
        sql = "SELECT * FROM usuario WHERE login='"+ usM.getLogin()+ "'";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            int id_usuario = 0;
            
            if(result.next()){
                id_usuario = result.getInt("idUsuario");
            }
                                                
            return id_usuario;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return 0;
        }
        
    }

    //Tabela Cliente
    public void incluirCliente(clienteModel cl, enderecoModel en){
        
        sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
            ps = mycon.prepareStatement(sql);
            
            ps.setInt(1, cl.getIdCliente());
            ps.setString(2, cl.getNome());
            ps.setString(3, cl.getTelefone());
            ps.setString(4, cl.getEmail());
            ps.setString(5, cl.getCpf());
            ps.setInt(6, cl.getId_endereco());
            ps.setInt(7, cl.getId_usuario());
            
            ps.execute();
            ps.close();           
            
        } catch (SQLException err ) {
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir o usuário! " +  err.getMessage());
            
        }
    }
    
}
