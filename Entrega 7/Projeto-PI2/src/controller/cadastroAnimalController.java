package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.animalModel;

public class cadastroAnimalController extends ConectarDAO{

    String sql = "";
    PreparedStatement ps; 

    public cadastroAnimalController() {
        super(); 
    }
    
    //Tabela animal
    public void incluirAnimal(animalModel an, int id_cliente){
        
        sql = "INSERT INTO animal VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
            ps = mycon.prepareStatement(sql);            
            
            ps.setInt(1, an.getIdAnimal());
            ps.setString(2, an.getNome());
            ps.setString(3, an.getEspecie());
            ps.setString(4, an.getRaca());
            ps.setString(5, an.getPorte());
            ps.setString(6, an.getSexo());           
            ps.setInt(7, id_cliente);
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
            
        } catch (SQLException err ) {
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir o animal! " +  err.getMessage());
            
        }
        
    }
    
    
    
}
