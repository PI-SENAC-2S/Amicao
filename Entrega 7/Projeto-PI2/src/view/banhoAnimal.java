package view;

import controller.banhoAnimalController;
import javax.swing.JOptionPane;
import model.servicosModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class banhoAnimal extends javax.swing.JFrame {
    
    banhoAnimalController banhoAnimalController = new banhoAnimalController();
    
    servicosModel servicosModel = new servicosModel();
    
    int id_cliente, id_animal;    
    
    public banhoAnimal() {
        initComponents();
        trazerNomes();
    }
    
    public banhoAnimal(int id_cliente, int id_animal) {
        initComponents();        
        this.id_cliente = id_cliente;
        this.id_animal = id_animal;
        trazerNomes();
    }
    
    public void voltar(){
        homeCliente homeCliente = new homeCliente(id_cliente);

        homeCliente.setVisible(true);
        this.setVisible(false);
    }
    
    public void trazerNomes(){
        ResultSet result = banhoAnimalController.buscarIdAnimal(id_cliente);

        ArrayList<String> apelidoAnimais = new ArrayList<>();        
       
        try {            
            if(result.next()){                
                while(result.next()){                    
                    String apelido = result.getString("apelido");
                    apelidoAnimais.add(apelido);
                }
                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
                comboBoxModel.addAll(apelidoAnimais);
                cbNome.setModel(comboBoxModel);
            }         
        } catch (Exception e) {
            System.out.println("Erro ao trazer os nomes!");
        }                  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblData = new javax.swing.JTextField();
        cbNome = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        rbDinheiro = new javax.swing.JRadioButton();
        rbCartao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/voltar.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Forma de Pagamento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Data:");

        lblData.setBackground(new java.awt.Color(204, 204, 204));
        lblData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 0, 255));
        lblData.setName("lblData"); // NOI18N
        lblData.setSelectionColor(new java.awt.Color(255, 102, 255));

        cbNome.setBackground(new java.awt.Color(204, 204, 204));
        cbNome.setMaximumRowCount(20);
        cbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Qual companheiro?:");

        btnSolicitar.setBackground(new java.awt.Color(204, 204, 204));
        btnSolicitar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSolicitar.setForeground(new java.awt.Color(204, 51, 255));
        btnSolicitar.setText("Solicitar");
        btnSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitar.setName("btnCadastro"); // NOI18N
        btnSolicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolicitarMouseClicked(evt);
            }
        });

        txtObservacao.setBackground(new java.awt.Color(204, 204, 204));
        txtObservacao.setColumns(20);
        txtObservacao.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtObservacao.setForeground(new java.awt.Color(255, 0, 255));
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Observações:");

        buttonGroup1.add(rbDinheiro);
        rbDinheiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbDinheiro.setForeground(new java.awt.Color(0, 0, 0));
        rbDinheiro.setSelected(true);
        rbDinheiro.setText("Dinheiro");

        buttonGroup1.add(rbCartao);
        rbCartao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbCartao.setForeground(new java.awt.Color(0, 0, 0));
        rbCartao.setText("Cartão");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDinheiro)
                        .addGap(41, 41, 41)
                        .addComponent(rbCartao)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(244, 244, 244))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(205, 205, 205)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDinheiro)
                    .addComponent(rbCartao))
                .addGap(28, 28, 28)
                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão pra voltar
    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        voltar();        
    }//GEN-LAST:event_btnVoltarMouseClicked

    // Botão pra solicitar serviço
    private void btnSolicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitarMouseClicked
        
        String nome = cbNome.getSelectedItem().toString();
        String data = lblData.getText();
        String observacao = txtObservacao.getText();
        String opc = "";
        
        if(rbCartao.isSelected()){
            opc = rbCartao.getText();            
        }
        
        if(rbDinheiro.isSelected()){
            opc = rbDinheiro.getText();
        }
        
        if(nome.isEmpty() || data.isEmpty() || observacao.isEmpty() || opc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
        else{            
            
            ResultSet result = banhoAnimalController.buscarAnimalCliente(id_cliente, nome);
            
            int idAnimal = 0;
                                     
            try {
                if(result.next()){
                    idAnimal = result.getInt("idAnimal");
                }
            } catch (Exception e) {
                System.out.println("Erro ao pegar id do animal");
            }
            
            
            servicosModel.setData(data);
            servicosModel.setObservacoes(observacao);
            servicosModel.setForma_pagamento(opc);
            servicosModel.setId_animal(idAnimal);
            servicosModel.setId_cliente(id_cliente);
            
            banhoAnimalController.incluirServicos(servicosModel);
            
            voltar();
        }                
        
    }//GEN-LAST:event_btnSolicitarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(banhoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(banhoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(banhoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(banhoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banhoAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSolicitar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblData;
    private javax.swing.JRadioButton rbCartao;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JTextArea txtObservacao;
    // End of variables declaration//GEN-END:variables
}
