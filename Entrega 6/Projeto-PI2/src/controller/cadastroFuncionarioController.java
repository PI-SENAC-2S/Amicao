package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.enderecoModel;
import model.funcionarioModel;
import model.usuarioModel;

public class cadastroFuncionarioController extends ConectarDAO{

    String sql = "";
    PreparedStatement ps; 

    public cadastroFuncionarioController() {
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
    
    
    // Tabela Funcionário
    public void incluirFuncionario(funcionarioModel fm, int id_endereco, int id_usuario){

        sql = "INSERT INTO funcionarios VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            ps = mycon.prepareStatement(sql);

            ps.setInt(1, fm.getIdFuncionario());
            ps.setString(2, fm.getNome());
            ps.setString(3, fm.getTelefone());
            ps.setString(4, fm.getEmail());
            ps.setString(5, fm.getCpf());
            ps.setString(6, fm.getCargo());
            ps.setInt(7, id_endereco);
            ps.setInt(8, id_usuario);
            ps.execute();
            ps.close();

        } catch (SQLException err) {

            JOptionPane.showMessageDialog(null, "Erro ao incluir o usuário! " +  err.getMessage());

        }

    }    
}
