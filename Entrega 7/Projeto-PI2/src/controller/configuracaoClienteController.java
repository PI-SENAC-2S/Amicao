package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.clienteModel;
import model.enderecoModel;

public class configuracaoClienteController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public configuracaoClienteController() {
        super(); 
    }       
    
    // Função para listar usuario
    public ResultSet buscarClientes(int idCliente){
        
        sql = "SELECT * FROM endereco JOIN cliente ON endereco.idEndereco = cliente.id_Endereco where cliente.idCliente='" + idCliente + "'";        
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();            
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os Funcionários!");
                return null;
        }
        
    }    
    
    // Deletar
    public void deletarCliente(int id, int idEnd, int idUser){                        
        String sqlAnimal = "DELETE FROM animal WHERE id_cliente=?";
        String sqlServico = "DELETE FROM servicos WHERE id_cliente=?";
        sql = "DELETE FROM cliente WHERE idCliente=?"; 
        String sql2 = "DELETE FROM endereco WHERE idEndereco=?";         
        String sql3 = "DELETE FROM usuario WHERE idUsuario=?";                         
        
        try {
            
            PreparedStatement psServico = mycon.prepareStatement(sqlServico);
            psServico.setInt(1, id);
            
            psServico.execute();
            psServico.close();
            
            PreparedStatement psAnimal = mycon.prepareStatement(sqlAnimal);
            psAnimal.setInt(1, id);
            
            psAnimal.execute();
            psAnimal.close();  
            
            JOptionPane.showMessageDialog(null, "FDOI");
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
        
        try {                                    
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
            
            PreparedStatement ps2 = mycon.prepareStatement(sql2);
            ps2.setInt(1, idEnd);
            
            ps2.execute();
            ps2.close();            
            
            PreparedStatement ps3 = mycon.prepareStatement(sql3);
            ps3.setInt(1, idUser);
            
            ps3.execute();
            ps3.close();            
            
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    public void alterarCliente(clienteModel clienteModel, enderecoModel enderecoModel, int idCli, int idEnd){
        String sql = "UPDATE cliente SET nome=?, telefone=?, email=?, cpf=? WHERE idCliente=?";
        String sql2 = "UPDATE endereco SET rua=?, numero=?, cep=? WHERE idEndereco=?";
    
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, clienteModel.getNome());
            ps.setString(2, clienteModel.getTelefone());
            ps.setString(3, clienteModel.getEmail());
            ps.setString(4, clienteModel.getCpf());
            ps.setInt(5, idCli);                        

            ps.execute();
            ps.close();
            
            PreparedStatement ps2 = mycon.prepareStatement(sql2);
            ps2.setString(1, enderecoModel.getRua());
            ps2.setInt(2, enderecoModel.getNumero());
            ps2.setString(3, enderecoModel.getCep());           
            ps2.setInt(4, idEnd);

            ps2.execute();
            ps2.close();          

            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso.");            

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }                
    }
}
