package view;

import controller.configuracaoClienteController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clienteModel;
import model.enderecoModel;
import model.usuarioModel;

public class configuracaoCliente extends javax.swing.JFrame {

    configuracaoClienteController configuracaoClienteController = new configuracaoClienteController();
    
    usuarioModel usuarioModel = new usuarioModel();
    clienteModel clienteModel = new clienteModel();
    enderecoModel enderecoModel = new enderecoModel();
    
    int id_cliente = 0;
    
    public configuracaoCliente() {
        initComponents();        
    }
    
    public configuracaoCliente(int id_cliente) {
        initComponents();
        this.id_cliente = id_cliente;
        listarUsuarios();
    }
    
    public void listarUsuarios(){                                           
        ResultSet result2=  configuracaoClienteController.buscarClientes(id_cliente);                 
        
        DefaultTableModel MdlTableCli2 = (DefaultTableModel) tableCliente.getModel();    
                
        MdlTableCli2.setRowCount(0);                
        
        try {                                                        
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
        btnExcluirCli = new javax.swing.JButton();
        btnAlterarCli = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        btnVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/voltar.png"))); // NOI18N
        btnVoltar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltar5btnVoltar1MouseClicked(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(btnAlterarCli)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCli)
                .addContainerGap())
            .addComponent(jScrollPane7)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluirCli)
                        .addComponent(btnAlterarCli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnVoltar5btnVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltar5btnVoltar1MouseClicked
        homeCliente homeCliente = new homeCliente();

        homeCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltar5btnVoltar1MouseClicked

    private void btnExcluirCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirCliMouseClicked
        int linha = tableCliente.getSelectedRow();

        Object objIdCliente = tableCliente.getValueAt(linha, 7);
        Object objIdEndereco = tableCliente.getValueAt(linha, 8);

        int idCliente = Integer.parseInt(objIdCliente.toString());
        int idEndereco = Integer.parseInt(objIdEndereco.toString());

        if(linha != -1){

            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir o cliente?" );

            if(resposta == JOptionPane.YES_OPTION){
                configuracaoClienteController.deletarCliente(idCliente, idEndereco, usuarioModel.getIdUsuario());
                listarUsuarios();
            }
            
            Login Login = new Login();
            
            this.setVisible(false);
            Login.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione o registro que deseja deletar!");
        }
    }//GEN-LAST:event_btnExcluirCliMouseClicked

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
                configuracaoClienteController.alterarCliente(clienteModel, enderecoModel, clienteModel.getIdCliente(), enderecoModel.getIdEndereco());
                Login login = new Login();
                this.setVisible(false);
                login.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAlterarCliMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracaoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JLabel btnVoltar5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tableCliente;
    // End of variables declaration//GEN-END:variables
}
