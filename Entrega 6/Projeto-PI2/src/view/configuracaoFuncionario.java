package view;

import controller.cadastroFuncionarioController;
import controller.configuracaoFuncionarioController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clienteModel;
import model.enderecoModel;
import model.funcionarioModel;
import model.usuarioModel;

public class configuracaoFuncionario extends javax.swing.JFrame {

    configuracaoFuncionarioController configuracaoFuncionarioController = new configuracaoFuncionarioController();   
    
    funcionarioModel funcionarioModel = new funcionarioModel();
    
    clienteModel clienteModel = new clienteModel();
    
    enderecoModel enderecoModel = new enderecoModel();
    
    usuarioModel usuarioModel = new usuarioModel();
    
    public configuracaoFuncionario() {
        initComponents();
        listarUsuarios();
    }
    
    public void listarUsuarios(){                
        
        ResultSet result =  configuracaoFuncionarioController.buscarFuncionario();               
        ResultSet result2 =  configuracaoFuncionarioController.buscarClientes();                 
        
        DefaultTableModel MdlTableCli = (DefaultTableModel) tableFuncionario.getModel();                                             
        DefaultTableModel MdlTableCli2 = (DefaultTableModel) tableCliente.getModel();    
        
        MdlTableCli.setRowCount(0);
        MdlTableCli2.setRowCount(0);
        
        try {                                
            while (result.next()) {                
                
                String nome = result.getString("nome");
                String telefone = result.getString("telefone");
                String email = result.getString("email");
                String cpf = result.getString("cpf");
                String cargo = result.getString("cargo");                
                
                String rua = result.getString("rua");
                String numero = result.getString("numero");
                String cep = result.getString("cep");
                String idFuncionario = result.getString("idFuncionarios");
                String idEndereco = result.getString("idEndereco");
                String idUsuario = result.getString("id_usuario");
                
                int id_usuario = Integer.parseInt(idUsuario);                               
                                
                usuarioModel.setIdUsuario(id_usuario);                

                Object[] linhas = {nome, telefone, email, cpf, cargo, rua, numero, cep, idFuncionario, idEndereco, idUsuario};
                MdlTableCli.addRow(linhas);
            }  
            
            while (result2.next()) {                
                
                String nome = result2.getString("nome");
                String telefone = result2.getString("telefone");
                String email = result2.getString("email");
                String cpf = result2.getString("cpf");             
                
                String rua = result2.getString("rua");
                String numero = result2.getString("numero");
                String cep = result2.getString("cep");            
                String idCliente = result2.getString("idCliente");
                String idEndereco = result2.getString("idEndereco");
                String idUsuario = result2.getString("id_usuario");
                
                int id_usuario = Integer.parseInt(idUsuario);                               
                                
                usuarioModel.setIdUsuario(id_usuario);
                

                Object[] linhas2 = {nome, telefone, email, cpf, rua, numero, cep, idCliente, idEndereco, idUsuario};
                MdlTableCli2.addRow(linhas2);
            }  
        
        } catch (SQLException err) {
            System.out.println(err);
        }                
        
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnExcluirFunc = new javax.swing.JButton();
        btnAlterarFunc = new javax.swing.JButton();
        btnAlterarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        btnVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/voltar.png"))); // NOI18N
        btnVoltar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltar1MouseClicked(evt);
            }
        });

        tableFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "E-mail", "CPF", "Cargo", "Rua", "Número", "CEP", "idFuncionario", "idEndereço", "idUsuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tableFuncionario);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Funcionários");

        tableCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "E-mail", "CPF", "Rua", "Número", "CEP", "idCliente", "idEndereço", "idUsuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tableCliente);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 255));
        jLabel6.setText("Clientes:");

        btnExcluirFunc.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluirFunc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluirFunc.setForeground(new java.awt.Color(204, 51, 255));
        btnExcluirFunc.setText("Excluir");
        btnExcluirFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirFuncMouseClicked(evt);
            }
        });

        btnAlterarFunc.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterarFunc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterarFunc.setForeground(new java.awt.Color(204, 51, 255));
        btnAlterarFunc.setText("Alterar");
        btnAlterarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarFuncMouseClicked(evt);
            }
        });

        btnAlterarCli.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterarCli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterarCli.setForeground(new java.awt.Color(204, 51, 255));
        btnAlterarCli.setText("Alterar");
        btnAlterarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarCliMouseClicked(evt);
            }
        });

        btnExcluirCli.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluirCli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluirCli.setForeground(new java.awt.Color(204, 51, 255));
        btnExcluirCli.setText("Excluir");
        btnExcluirCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirCliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addComponent(jScrollPane7)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 328, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(188, 188, 188)
                                .addComponent(btnAlterarFunc)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirFunc))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(208, 208, 208)
                                .addComponent(btnAlterarCli)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirCli)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluirFunc)
                            .addComponent(btnAlterarFunc)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnExcluirCli)
                    .addComponent(btnAlterarCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar1MouseClicked
        homeFuncionario homeFuncionario = new homeFuncionario();

        homeFuncionario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltar1MouseClicked

    private void btnAlterarFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarFuncMouseClicked
                          
         DefaultTableModel tableFunc = (DefaultTableModel) tableFuncionario.getModel();
         
         int linha = tableFuncionario.getSelectedRow();
         
         if(linha != -1){
            int numColunas = tableFunc.getColumnCount();            
            for(int i = 0; i < numColunas; i++){
                Object valor = tableFunc.getValueAt(linha, i);                                 
                switch (i) {
                    case 0:
                        funcionarioModel.setNome((String) valor);
                        break;
                    case 1:
                        funcionarioModel.setTelefone((String) valor);
                        break;                            
                    case 2:
                        funcionarioModel.setEmail((String) valor);
                        break;
                    case 3:
                        funcionarioModel.setCpf((String) valor);
                        break;
                    case 4:
                        funcionarioModel.setCargo((String) valor);
                        break;
                    case 5:
                        enderecoModel.setRua((String) valor);
                        break;
                    case 6:                        
                        enderecoModel.setNumero(Integer.parseInt((String) valor));
                        break;
                    case 7:
                        enderecoModel.setCep((String) valor);
                        break;
                    case 8:
                        funcionarioModel.setIdFuncionario(Integer.parseInt((String) valor));
                        break;
                    case 9:
                        enderecoModel.setIdEndereco(Integer.parseInt((String) valor));
                        break;
                    case 10:
                        usuarioModel.setIdUsuario(Integer.parseInt((String) valor));
                        break;
                }
            }
            
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja alterar esse dado?");;
             
           if(resposta == JOptionPane.YES_OPTION){                
                configuracaoFuncionarioController.alterar(funcionarioModel, enderecoModel, funcionarioModel.getIdFuncionario(), enderecoModel.getIdEndereco());
            }               
        }
    }//GEN-LAST:event_btnAlterarFuncMouseClicked

    private void btnExcluirFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirFuncMouseClicked
        DefaultTableModel tableFunc = (DefaultTableModel) tableFuncionario.getModel();
        
        int linha = tableFuncionario.getSelectedRow();
        
        Object objIdFuncionario = tableFuncionario.getValueAt(linha, 8);
        Object objIdEndereco = tableFuncionario.getValueAt(linha, 9);
        
        int idFuncionario = Integer.parseInt(objIdFuncionario.toString());
        int idEndereco = Integer.parseInt(objIdEndereco.toString());        
        
        if(linha != -1){            
            
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir o funcionário?" );
            
            if(resposta == JOptionPane.YES_OPTION){                
                configuracaoFuncionarioController.deletar(idFuncionario, idEndereco, usuarioModel.getIdUsuario());
                listarUsuarios();
            }                        
        }      
        else{
            JOptionPane.showMessageDialog(null, "Selecione o registro que deseja deletar!");
        }
    }//GEN-LAST:event_btnExcluirFuncMouseClicked

    private void btnAlterarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarCliMouseClicked
         DefaultTableModel tableCli = (DefaultTableModel) tableCliente.getModel();
         
         int linha = tableCliente.getSelectedRow();
         
         if(linha != -1){
            int numColunas = tableCli.getColumnCount();            
            for(int i = 0; i < numColunas; i++){
                Object valor = tableCli.getValueAt(linha, i);                                 
                switch (i) {
                    case 0:
                        clienteModel.setNome((String) valor);
                        break;
                    case 1:
                        clienteModel.setTelefone((String) valor);
                        break;                            
                    case 2:
                        clienteModel.setEmail((String) valor);
                        break;
                    case 3:
                        clienteModel.setCpf((String) valor);
                        break;
                    case 4:
                        enderecoModel.setRua((String) valor);
                        break;
                    case 5:                        
                        enderecoModel.setNumero(Integer.parseInt((String) valor));
                        break;
                    case 6:
                        enderecoModel.setCep((String) valor);
                        break;
                    case 7:
                        clienteModel.setIdCliente(Integer.parseInt((String) valor));
                        break;
                    case 8:
                        enderecoModel.setIdEndereco(Integer.parseInt((String) valor));
                        break;
                }
            }
            
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja alterar esse dado?");;
             
           if(resposta == JOptionPane.YES_OPTION){                
                configuracaoFuncionarioController.alterarCliente(clienteModel, enderecoModel, clienteModel.getIdCliente(), enderecoModel.getIdEndereco());
            }               
        }
    }//GEN-LAST:event_btnAlterarCliMouseClicked

    private void btnExcluirCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirCliMouseClicked
        int linha = tableCliente.getSelectedRow();
        
        Object objIdCliente = tableCliente.getValueAt(linha, 7);
        Object objIdEndereco = tableCliente.getValueAt(linha, 8);
        
        int idCliente = Integer.parseInt(objIdCliente.toString()); 
        int idEndereco = Integer.parseInt(objIdEndereco.toString());
        
        if(linha != -1){                       
            
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir o cliente?" );
            
            if(resposta == JOptionPane.YES_OPTION){                
                configuracaoFuncionarioController.deletarCliente(idCliente, idEndereco, usuarioModel.getIdUsuario());
                listarUsuarios();
            }                        
        }      
        else{
            JOptionPane.showMessageDialog(null, "Selecione o registro que deseja deletar!");
        }
    }//GEN-LAST:event_btnExcluirCliMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracaoFuncionario().setVisible(true);
            }
        });
    }        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCli;
    private javax.swing.JButton btnAlterarFunc;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnExcluirFunc;
    private javax.swing.JLabel btnVoltar5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTable tableFuncionario;
    // End of variables declaration//GEN-END:variables
}
