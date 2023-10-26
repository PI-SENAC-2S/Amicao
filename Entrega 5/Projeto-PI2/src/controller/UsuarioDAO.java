package controller;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.animalModel;
import model.clienteModel;
import model.enderecoModel;
import model.funcionarioModel;
import model.servicosModel;
import model.usuarioModel;

public class UsuarioDAO extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public UsuarioDAO() {
        super(); 
    }

    // ----------------------------- Funções -----------------------------

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
        
        JOptionPane.showMessageDialog(null, "Banco criado com sucesso!");
    }

    // ----------------------------- Inserir Dados no Banco de Dados -----------------------------

    
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
    
    //Tabela serviços
    public void incluirServicos(servicosModel sv){
    
        sql = "INSERT INTO servicos VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = mycon.prepareStatement(sql);
        
            ps.setInt(1, sv.getIdServicos());
            ps.setString(2, sv.getData());
            ps.setString(3, sv.getObservacoes());
            ps.setString(4, sv.getForma_pagamento());
            ps.setInt(5, sv.getId_animal());
            ps.setInt(6, sv.getId_cliente()); //id_cliente
            ps.setInt(7, 1); //id_funcionario 
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Serviço solicitado com sucesso!");
       
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, "Erro ao incluir o o serviço!! " +  err.getMessage());
            
        }                
    }
    
   
    // ----------------------------- Puxar Dados no Banco de Dados -----------------------------
    
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
    
    // Puxar animais com id do cliente
    public ResultSet buscarIdAnimal(int id_cliente){
        
        sql = "SELECT * FROM animal WHERE id_cliente='"+ id_cliente+ "'";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();                                       
                                                
            return result;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
        
    }
    
    // Puxar um uníco Animal de um único cliente
    public ResultSet buscarAnimalCliente(int id_cliente, String nome){
        
        sql = "SELECT * FROM animal WHERE id_cliente='"+ id_cliente+ "'"
                + "AND apelido='"+ nome+ "'";
        
        try {            
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet result = ps.executeQuery();                                       
                                                
            return result;
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }        
    }  

    // Função para listar serviços
    public ResultSet buscarServicos(){
        
        sql = "SELECT * FROM servicos";
        
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
