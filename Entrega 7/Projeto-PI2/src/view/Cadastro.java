package view;

import controller.cadastroLoginController;
import javax.swing.JOptionPane;
import model.clienteModel;
import model.enderecoModel;
import model.usuarioModel;

public class Cadastro extends javax.swing.JFrame {       
    
    cadastroLoginController cadastroLoginController = new cadastroLoginController();
    
    Login frameLogin = new Login();
        
    clienteModel clienteModel = new clienteModel();
    enderecoModel enderecoModel = new enderecoModel();
    usuarioModel usuarioModel = new usuarioModel();
    
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JToggleButton();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        lblRua = new javax.swing.JTextField();
        lblConfiSenha = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JTextField();
        lblCEP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblLoginName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\mthal\\Downloads\\Design sem nome (2).png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        lblNome.setBackground(new java.awt.Color(204, 204, 204));
        lblNome.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 0, 255));
        lblNome.setName("lblNome"); // NOI18N
        lblNome.setSelectionColor(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Rua:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("CPF:");

        lblCPF.setBackground(new java.awt.Color(204, 204, 204));
        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 0, 255));
        lblCPF.setName("lblCPF"); // NOI18N
        lblCPF.setSelectionColor(new java.awt.Color(255, 102, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 255));
        jLabel6.setText("E-mail:");

        lblTelefone.setBackground(new java.awt.Color(204, 204, 204));
        lblTelefone.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 0, 255));
        lblTelefone.setName("lblTelefone"); // NOI18N
        lblTelefone.setSelectionColor(new java.awt.Color(255, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Senha:");

        lblEmail.setBackground(new java.awt.Color(204, 204, 204));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 0, 255));
        lblEmail.setName("lblEmail"); // NOI18N
        lblEmail.setSelectionColor(new java.awt.Color(255, 102, 255));

        btnCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(204, 51, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setName("btnCadastro"); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 255));
        lblLogin.setText("Já tem uma conta?");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.setName("linkLogin"); // NOI18N
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        lblSenha.setBackground(new java.awt.Color(204, 204, 204));
        lblSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 0, 255));
        lblSenha.setName("lblSenha"); // NOI18N
        lblSenha.setSelectionColor(new java.awt.Color(204, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 51, 255));
        jLabel9.setText("Número:");

        lblRua.setBackground(new java.awt.Color(204, 204, 204));
        lblRua.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 0, 255));
        lblRua.setName("lblRua"); // NOI18N
        lblRua.setSelectionColor(new java.awt.Color(255, 102, 255));

        lblConfiSenha.setBackground(new java.awt.Color(204, 204, 204));
        lblConfiSenha.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblConfiSenha.setForeground(new java.awt.Color(255, 0, 255));
        lblConfiSenha.setName("lblSenha"); // NOI18N
        lblConfiSenha.setSelectionColor(new java.awt.Color(204, 102, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 255));
        jLabel10.setText("Confirmar senha:");

        lblNumero.setBackground(new java.awt.Color(204, 204, 204));
        lblNumero.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 0, 255));
        lblNumero.setName("lblCPF"); // NOI18N
        lblNumero.setSelectionColor(new java.awt.Color(255, 102, 255));

        lblCEP.setBackground(new java.awt.Color(204, 204, 204));
        lblCEP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(255, 0, 255));
        lblCEP.setName("lblCEP"); // NOI18N
        lblCEP.setSelectionColor(new java.awt.Color(255, 102, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 51, 255));
        jLabel11.setText("CEP:");

        lblLoginName.setBackground(new java.awt.Color(204, 204, 204));
        lblLoginName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLoginName.setForeground(new java.awt.Color(255, 0, 255));
        lblLoginName.setName("lblEndereco"); // NOI18N
        lblLoginName.setSelectionColor(new java.awt.Color(255, 102, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 51, 255));
        jLabel12.setText("Login:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRua, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1)
                                        .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(lblTelefone)))))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(lblCPF)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(lblConfiSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfiSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(58, 58, 58)))
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    // Botão para abrir a tela de login
    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked

        Login  lg = new Login();

        try {
            lg.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de login!", "Erro de operação!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_lblLoginMouseClicked

    // Botão para realizar o cadastro
    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        
        //Passando os valores dos inputs da tela para variáveis
        String nome = lblNome.getText();
        String cpf = lblCPF.getText();
        String telefone = lblTelefone.getText();
        String email = lblEmail.getText();
        String rua = lblRua.getText();
        String numero = lblNumero.getText();
        String cep = lblCEP.getText();                
        String login = lblLoginName.getText();
        String senha = lblSenha.getText();
        String confSenha = lblConfiSenha.getText();
        
        // Verificando se todos os campos foram preenchidos
        if(nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || email.isEmpty() || rua.isEmpty() || numero.isEmpty() || cep.isEmpty() || login.isEmpty() || senha.isEmpty() || confSenha.isEmpty()){
                        
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
            
        }
        else{

            // Transformar o número recebido como String em Int
            int numero2 = Integer.parseInt(lblNumero.getText());
            
            // Verificar se as senhas combinam
            if(senha.equals(confSenha)){
                
                // Passando pra tabela Usuário
                usuarioModel.setLogin(login);
                usuarioModel.setSenha(senha);
                usuarioModel.setTipo("cliente");                
                
                // Incluir na tabela usuário 
                cadastroLoginController.incluirUsuario(usuarioModel);                
                
                //Passando pra tabela endereço
                enderecoModel.setRua(rua);
                enderecoModel.setNumero(numero2);
                enderecoModel.setCep(cep);                                
                
                // Chama a função para cadastrar o endereço
                cadastroLoginController.incluirEndereco(enderecoModel);
                
                // Pegar id do Endereco
                int id_endereco = cadastroLoginController.buscarIdEndereco(enderecoModel);
                
                // Variável que vai armazenar o valor do id do usuario
                int id_usuario = cadastroLoginController.buscarIdUsuario(usuarioModel);   
                
                // Passando pra tabela cliente
                clienteModel.setNome(nome);
                clienteModel.setTelefone(telefone);
                clienteModel.setEmail(email);
                clienteModel.setCpf(cpf);
                clienteModel.setId_usuario(id_usuario);      
                clienteModel.setId_endereco(id_endereco);
                
                // Chama a função para cadastrar o cliente no banco!
                cadastroLoginController.incluirCliente(clienteModel, enderecoModel);  
                
                JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
                
                
                frameLogin.setVisible(true);
                this.setVisible(false);
                
            }
            else{

                JOptionPane.showMessageDialog(null, "As senhas não batem!");  

            }
        }
        
    }//GEN-LAST:event_btnCadastrarMouseClicked
     
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCEP;
    private javax.swing.JTextField lblCPF;
    private javax.swing.JPasswordField lblConfiSenha;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField lblLoginName;
    private javax.swing.JTextField lblNome;
    private javax.swing.JTextField lblNumero;
    private javax.swing.JTextField lblRua;
    private javax.swing.JPasswordField lblSenha;
    private javax.swing.JTextField lblTelefone;
    // End of variables declaration//GEN-END:variables

}
