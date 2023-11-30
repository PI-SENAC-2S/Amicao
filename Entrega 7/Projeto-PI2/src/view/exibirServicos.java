package view;

import controller.exibirServicosController;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class exibirServicos extends javax.swing.JFrame {    
    
    exibirServicosController exibirServicosController = new exibirServicosController();
    
    int idAnimal = 0;
    
    public exibirServicos() {
        initComponents();
        listarServicos();
    }
    
    public void listarServicos(){                
        
        ResultSet result =  exibirServicosController.buscarServicos();                
        DefaultTableModel MdlTableCli = (DefaultTableModel) tableServicos.getModel();                                             
        
        try {                                
            while (result.next()) {
                idAnimal = result.getInt("id_animal");
                ResultSet resultAnimal = exibirServicosController.buscarAnimalServico(idAnimal);

                String companheiro = "";
                if (resultAnimal.next()) {
                    companheiro = resultAnimal.getString("apelido");
                }                
                String observacao = result.getString("observacoes");
                String data = result.getString("data");
                String formaDePagamento = result.getString("forma_pagamento");
                String numero = result.getString("telefone");                

                Object[] linhas = {numero, companheiro, observacao, data, formaDePagamento, idAnimal};
                MdlTableCli.addRow(linhas);
            }                                                                                          
        
        } catch (SQLException err) {
            System.out.println(err);
        }               
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableServicos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

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

        tableServicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefone", "Companheiro", "Observação", "Data", "Forma de Pagamento", "idAnimal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableServicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableServicos);

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(204, 51, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
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

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        homeFuncionario homeFuncionario = new homeFuncionario();

        homeFuncionario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        DefaultTableModel tableExibir = (DefaultTableModel) tableServicos.getModel();
        
        int linha = 0;
        int id_animal = 0;
        
        try {
            linha = tableServicos.getSelectedRow();
        
            Object objIdAnimal = tableServicos.getValueAt(linha, 5);        

            id_animal = Integer.parseInt(objIdAnimal.toString());   
                        
        } catch (Exception e) {
            
        }
                
        
        if(linha != -1){            
            
            int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir serviço do animal com id = " + id_animal + "?" );
            
            if(resposta == JOptionPane.YES_OPTION){                
                exibirServicosController.deletarServico(id_animal);
                homeFuncionario homeFuncionario = new homeFuncionario();

                homeFuncionario.setVisible(true);
                this.setVisible(false);
            }                        
        }      
        else{
            JOptionPane.showMessageDialog(null, "Selecione o serviço que deseja deletar!");
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exibirServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableServicos;
    // End of variables declaration//GEN-END:variables
}
