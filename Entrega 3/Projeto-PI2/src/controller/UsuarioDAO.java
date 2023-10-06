package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO extends ConectarDAO{

        String sql = "";
        PreparedStatement ps; 
        
        public UsuarioDAO() {
            super(); 
        }
    
        public void criarBanco () {
        
        // ----------------------------- Tabela Cliente -----------------------------
        
        sql = " CREATE TABLE IF NOT EXISTS Cliente ("
                + "idCliente int not null AUTO_INCREMENT, "
                + "nome varchar(20) not null,"
                + "telefone varchar(15) not null ,"
                + "email varchar(50) not null ,"
                + "endereco varchar(50) not null,"
                + "CPF varchar(14) not null,"
                + "primary key (idCliente) ) ";
        
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Cliente!\n" + err.getMessage());
        }
        
        // ----------------------------- Tabela Animal -----------------------------


        sql = " CREATE TABLE IF NOT EXISTS Animal ("
                + "idAnimal int not null AUTO_INCREMENT, "
                + "apelido varchar(50) not null, "
                + "especie varchar(50) not null, "
                + "raca varchar(50) not null, "
                + "porte varchar(50) not null, "
                + "sexo varchar(50) not null, "
                + "id_cliente int not null, "
                + "foreign key (id_cliente) references Cliente(idCliente), "
                + "primary key (idAnimal) ) ";                
                
        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Animal \n" + err.getMessage());
        }
        
                // ----------------------------- Tabela Funcionários -----------------------------
        
        sql = " CREATE TABLE IF NOT EXISTS Funcionarios ("
                + "idFuncionarios int not null AUTO_INCREMENT, "
                + "nome varchar(20) not null, "
                + "telefone varchar(15) not null ,"
                + "email varchar(50) not null ,"
                + "endereco varchar(50) not null ,"
                + "CPF varchar(14) not null,"
                + "cargo varchar(20) not null,"
                + "salario float not null, "
                + "data_admissao date," 
                + "primary key (idFuncionarios) ) ";                
        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela funcionarios \n" + err.getMessage());
        }
        
        // ----------------------------- Tabela Serviços -----------------------------
        
        sql = " CREATE TABLE IF NOT EXISTS Servicos ("
                + "idServicos int not null AUTO_INCREMENT, "
                + "id_cliente int not null, "
                + "id_funcionario int not null, "
                + "foreign key (id_cliente) references Cliente(idCliente), "
                + "foreign key (id_funcionario) references Funcionarios(idFuncionarios), "
                + "primary key (idServicos) ) ";
                
        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela servicos \n" + err.getMessage());
        }        
    }
    
}
