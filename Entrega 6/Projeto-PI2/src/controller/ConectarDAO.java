package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDAO {
    
    public Connection mycon = null;
    String sql = "";
    PreparedStatement ps;   

    // Função que faz a conexão
    public ConectarDAO(){
         String strcon = "jdbc:mysql://localhost:3306/amicao";//cria a string de conexão ao servidor xaamp 
         try {
             mycon = DriverManager.getConnection(strcon, "root", "");             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
         }
    }
    
    // Função criar banco
    public void criarBanco () {
        
        sql = "CREATE DATABASE IF NOT EXISTS Amicao";        
        
        try {
            
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, "Erro ao criar o banco!\n" + err.getMessage());
            
        }                

        // ----------------------------- Tabelas Banco de Dados -----------------------------

        // Tabela Usuários
        sql = "CREATE TABLE IF NOT EXISTS Usuario ("
                + "idUsuario int primary key AUTO_INCREMENT, "
                + "login varchar(50) not null ,"
                + "senha varchar(50) not null ,"
                + "tipo enum('cliente', 'funcionario'))";
        
        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Usuario \n" + err.getMessage());
        }    
        
        // Tabela endereço
        sql = " CREATE TABLE IF NOT EXISTS Endereco ("
                + "idEndereco int not null AUTO_INCREMENT, "
                + "rua varchar(50) not null, "
                + "numero int(9) not null, "
                + "cep varchar(9) not null, "                
                + "primary key (idEndereco) ) ";

        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Endereço \n" + err.getMessage());
        } 
        
        
        
        // Tabela cliente
        sql = " CREATE TABLE IF NOT EXISTS Cliente ("
                + "idCliente int not null AUTO_INCREMENT, "
                + "nome varchar(20) not null,"
                + "telefone varchar(15) not null ,"
                + "email varchar(50) not null ,"
                + "CPF varchar(14) not null,"
                + "id_endereco int ,"
                + "id_usuario int ,"
                + "foreign key (id_endereco) references Endereco(idEndereco),"
                + "foreign key (id_usuario) references Usuario(idUsuario),"
                + "primary key (idCliente) ) ";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela Cliente!\n" + err.getMessage());
        }

        // Tabela Animal
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

        // Tabela Funcionários        
        sql = " CREATE TABLE IF NOT EXISTS Funcionarios ("
                + "idFuncionarios int not null AUTO_INCREMENT, "
                + "nome varchar(20) not null, "
                + "telefone varchar(15) not null ,"
                + "email varchar(50) not null ,"
                + "CPF varchar(14) not null,"
                + "cargo varchar(20) not null,"
                + "id_endereco int ,"
                + "id_usuario int ,"
                + "foreign key (id_endereco) references Endereco(idEndereco),"
                + "foreign key (id_usuario) references Usuario(idUsuario),"
                + "primary key (idFuncionarios) ) ";                
        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela funcionarios \n" + err.getMessage());
        }                       
           

        //Tabela Serviços        
        sql = " CREATE TABLE IF NOT EXISTS Servicos ("
                + "idServicos int not null AUTO_INCREMENT, "
                + "data varchar(50) not null ,"
                + "observacoes varchar(1000) not null ,"
                + "forma_pagamento varchar(50) not null ,"
                + "id_animal int ,"
                + "id_cliente int ,"
                + "id_funcionario int ,"
                + "foreign key (id_cliente) references Cliente(idCliente), "
                + "foreign key (id_animal) references Animal(idAnimal), "
                + "foreign key (id_funcionario) references Funcionarios(idFuncionarios), "
                + "primary key (idServicos) ) ";

        try{
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela servicos \n" + err.getMessage());
        }                 
        
        sql = "INSERT INTO endereco VALUES (?, ?, ?, ?)";
        
        try {
            
            ps = mycon.prepareStatement(sql);
            
            ps.setInt(1, 1);
            ps.setString(2, "Rua Admin");
            ps.setInt(3, 123);
            ps.setString(4, "65412145");
            
            ps.execute();
            ps.close();
            
            
        } catch (SQLException err ) {
            
            System.out.println("Erro!");
            
        }
        
        sql = "INSERT INTO usuario VALUES (?, ?, ?, ?)";
        
        try {
            
           ps= mycon.prepareStatement(sql);
           
           ps.setInt(1, 1);
           ps.setString(2, "admin");
           ps.setString(3, "123");
           ps.setString(4, "funcionario");
            
           ps.execute();
           ps.close();
           
        } catch (Exception e) {
            System.out.println("Erro ao inserir usuario!!");
        }
                        
        sql = "INSERT INTO funcionarios VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
           ps= mycon.prepareStatement(sql);
           
           ps.setInt(1, 1);
           ps.setString(2, "Matheus Maia Alvarez");
           ps.setString(3, "(11) 99423-7418");
           ps.setString(4, "mthalvarez2005@gmail.com");
           ps.setString(5, "435.214.214-15");
           ps.setString(6, "Dono");
           ps.setInt(7, 1);
           ps.setInt(8, 1);
            
           ps.execute();
           ps.close();
           
        } catch (Exception e) {
            System.out.println("Erro!");
        }                
    }
}

