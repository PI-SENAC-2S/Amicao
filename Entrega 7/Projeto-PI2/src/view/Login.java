package view;

import controller.ConectarDAO;
import controller.loginController;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import model.clienteModel;
import model.usuarioModel;

public class Login extends javax.swing.JFrame {

    ConectarDAO cn = new ConectarDAO();
    
    public Login() {
        initComponents();
        cn.criarBanco();
    }     
    
    loginController loginController = new loginController();
    
    usuarioModel usuarioModel = new usuarioModel();
    clienteModel clienteModel = new clienteModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JTextField();
        bntEntrar = new javax.swing.JButton();
        lblSenha = new javax.swing.JPasswordField();
        lblCadastrar = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mthal\\Downloads\\Design sem nome (2).png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Login:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Senha:");

        lblLogin.setBackground(new java.awt.Color(204, 204, 204));
        lblLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 0, 255));
        lblLogin.setName("lblLogin"); // NOI18N
        lblLogin.setSelectionColor(new java.awt.Color(255, 102, 255));

        bntEntrar.setBackground(new java.awt.Color(204, 204, 204));
        bntEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntEntrar.setForeground(new java.awt.Color(204, 51, 255));
        bntEntrar.setText("Entrar");
        bntEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntEntrarMouseClicked(evt);
            }
        });

        lblSenha.setBackground(new java.awt.Color(204, 204, 204));
        lblSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 0, 255));
        lblSenha.setName("lblSenha"); // NOI18N
        lblSenha.setSelectionColor(new java.awt.Color(204, 102, 255));

        lblCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(102, 102, 255));
        lblCadastrar.setText("        Cadastrar");
        lblCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastrar.setName("linkLogin"); // NOI18N
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCadastrar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(lblLogin)
                        .addComponent(jLabel3)
                        .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    // Botão para abrir a tela de cadastro
    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
                
        Cadastro cd = new Cadastro();        

        try {
            cd.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de cadastro!", "Erro de operação!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblCadastrarMouseClicked

    // Botão para fazer login
    private void bntEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEntrarMouseClicked

        String login = lblLogin.getText();
        String senha = lblSenha.getText();                
        
        try {
            ResultSet result = loginController.validarLogin(login, senha);                                
            
            if(result.next()){
                
                int id_usuario = result.getInt("idUsuario");
                int id_cliente = loginController.buscarIdCliente(clienteModel, id_usuario);
                
                usuarioModel.setIdUsuario(id_usuario);                  
                
                String tipo = result.getString("tipo");
                
                
                if(tipo.equals("cliente")){
                    homeCliente homeCliente = new homeCliente(id_cliente);
                    homeCliente.setVisible(true);
                    this.setVisible(false);                
                }
                else{
                    homeFuncionario homeFuncionario = new homeFuncionario();
                    homeFuncionario.setVisible(true);
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            }
            
        } catch (Exception e) {            
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        
    }//GEN-LAST:event_bntEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JTextField lblLogin;
    private javax.swing.JPasswordField lblSenha;
    // End of variables declaration//GEN-END:variables
}
