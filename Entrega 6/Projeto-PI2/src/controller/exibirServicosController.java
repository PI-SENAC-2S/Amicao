package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class exibirServicosController extends ConectarDAO{

    String sql = "";
    PreparedStatement ps; 

    public exibirServicosController() {
        super(); 
    }    
    
    // Função para listar serviços
    public ResultSet buscarServicos(){
        
        sql = "SELECT DISTINCT servicos.*, cliente.* FROM servicos INNER JOIN cliente ON servicos.id_cliente = cliente.idCliente;";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();            
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os serviços!");
                return null;
        }
        
    }
    
     // Puxar um uníco Animal de um único cliente
    public ResultSet buscarAnimalServico(int idAnimal){
        
        sql = "SELECT * FROM animal WHERE idAnimal='"+ idAnimal+ "'";
        
        try {            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();                                       
                                                
            return result;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar animal serviço " + err.getMessage());
            return null;
        }        
    } 
    
}
