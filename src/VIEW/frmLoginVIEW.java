package VIEW;

import DAO.FuncionarioDAO;
import DAO.ProfessorDAO;
import DAO.AlunoDAO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author stocaline
 */
public class frmLoginVIEW extends javax.swing.JFrame {

    private String nome_usuario;
    private String senha_usuario;

    public frmLoginVIEW() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrarSistema = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        btnEntrarSistema.setText("Entrar");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Sistema Biblioteca");

        btnCadastrar.setText("cadastre-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnEntrarSistema)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeUsuario)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnEntrarSistema)
                .addGap(41, 41, 41)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        try {
            Logar();
        } catch (SQLException ex) {
            Logger.getLogger(frmLoginVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        frmCadastroVIEW objcadastroview = new frmCadastroVIEW();
        objcadastroview.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLoginVIEW tela = new frmLoginVIEW();
                tela.setVisible(true);
                tela.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    private void Logar() throws SQLException {
        int controlador = 0;
        try {
            String NOME_ADMIN, SENHA_ADMIN;

            setNome_usuario(txtNomeUsuario.getText());
            setSenha_usuario(txtSenhaUsuario.getText());
            NOME_ADMIN = "admin";
            SENHA_ADMIN = "admin@admin";

            if (NOME_ADMIN.equals(getNome_usuario()) && SENHA_ADMIN.equals(getSenha_usuario())) {
                frmAdminVIEW frmadminview = new frmAdminVIEW();
                frmadminview.setVisible(true);

                dispose();
            } else {

                UsuarioDTO objusuarioDTO = new UsuarioDTO();
                objusuarioDTO.setNome_usuario(getNome_usuario());
                objusuarioDTO.setSenha_usuario(getSenha_usuario());

                FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
                ProfessorDAO objprofessordao = new ProfessorDAO();
                AlunoDAO objalunodao = new AlunoDAO();
                ResultSet rsfuncionariodao = objfuncionariodao.autenticacaoFuncionario(objusuarioDTO);
                ResultSet rsprofessordao = objprofessordao.autenticacaoProfessor(objusuarioDTO);
                ResultSet rsalunodao = objalunodao.autenticacaoAluno(objusuarioDTO);
                if (rsfuncionariodao.next()) {
                    controlador = 1;
                    frmFuncionarioVIEW objfrmfuncionarioview = new frmFuncionarioVIEW();
                    objfrmfuncionarioview.setVisible(true);

                    dispose();
                }

                if (rsprofessordao.next()) {
                    controlador = 1;
                    frmProfessorVIEW objprofessorview = new frmProfessorVIEW();
                    objprofessorview.setVisible(true);

                    dispose();
                }
                if (rsalunodao.next()) {
                    controlador = 1;
                    frmAlunoVIEW objalunoview = new frmAlunoVIEW();
                    objalunoview.setVisible(true);

                    dispose();
                }

                if (controlador != 1) {
                    JOptionPane.showMessageDialog(null, "Usuario ou senha inválida");
                }
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "frmLoginVIEW: " + erro);
        }

    }

}
