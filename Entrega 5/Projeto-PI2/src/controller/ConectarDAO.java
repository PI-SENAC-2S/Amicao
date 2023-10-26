package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDAO {
    
    public Connection mycon = null;

    public ConectarDAO(){
         String strcon = "jdbc:mysql://localhost:3306/amicao";//cria a string de conexão ao servidor xaamp 
         try {

             mycon = DriverManager.getConnection(strcon, "root", "");

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
         }
     }
}

