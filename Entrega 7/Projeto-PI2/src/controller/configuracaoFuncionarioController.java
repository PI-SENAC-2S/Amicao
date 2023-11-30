package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.clienteModel;
import model.enderecoModel;
import model.funcionarioModel;

public class configuracaoFuncionarioController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public configuracaoFuncionarioController() {
        super(); 
    }   
    
    // Função para listar funcionario
    public ResultSet buscarFuncionario(){
        
        sql = "SELECT * FROM Funcionarios INNER JOIN Usuario ON Funcionarios.id_usuario = Usuario.idUsuario INNER JOIN Endereco ON Funcionarios.id_endereco = Endereco.idEndereco;";        
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();         
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os Funcionários!");
                return null;
        }
        
    }
    
    // Função para listar usuario
    public ResultSet buscarClientes(){
        
        sql = "SELECT * FROM cliente INNER JOIN Usuario ON cliente.id_usuario = Usuario.idUsuario INNER JOIN endereco ON endereco.idEndereco = cliente.id_endereco;";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();            
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os Funcionários!");
                return null;
        }
        
    }
    
    public void alterar(funcionarioModel funcionarioModel, enderecoModel enderecoModel, int idFunc, int idEnd){
        String sql = "UPDATE funcionarios SET nome=?, telefone=?, email=?, cpf=?, cargo=? WHERE idFuncionarios=?";
        String sql2 = "UPDATE endereco SET rua=?, numero=?, cep=? WHERE idEndereco=?";
    
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, funcionarioModel.getNome());
            ps.setString(2, funcionarioModel.getTelefone());
            ps.setString(3, funcionarioModel.getEmail());
            ps.setString(4, funcionarioModel.getCpf());
            ps.setString(5, funcionarioModel.getCargo());            
            ps.setInt(6, idFunc);                        

            ps.execute();
            ps.close();
            
            PreparedStatement ps2 = mycon.prepareStatement(sql2);
            ps2.setString(1, enderecoModel.getRua());
            ps2.setInt(2, enderecoModel.getNumero());
            ps2.setString(3, enderecoModel.getCep());           
            ps2.setInt(4, idEnd);

            ps2.execute();
            ps2.close();          

            JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso.");            

        } catch (SQLException err) {
            System.out.println(err);
        }                
    }
    
    // Deletar
    public void deletar(int id, int idEnd, int idUser){
        sql = "DELETE FROM funcionarios WHERE idFuncionarios=?"; 
        String sqlServico = "DELETE FROM servicos WHERE id_funcionario=?";
        String sql2 = "DELETE FROM endereco WHERE idEndereco=?";  
        String sql3 = "DELETE FROM usuario WHERE idUsuario=?";  
                
        try {
            
            PreparedStatement psServico = mycon.prepareStatement(sqlServico);
            psServico.setInt(1, id);
            
            psServico.execute();
            psServico.close();
            
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
            
            JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso!");
            
        } catch (SQLException err) {
            System.out.println(err);
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
            System.out.println(err);
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
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            
        } catch (SQLException err) {
            System.out.println(err);
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
                        
            
        } catch (SQLException err) {
            System.out.println(err);
        }
    }
    
}
