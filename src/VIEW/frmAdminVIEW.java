package VIEW;

import DAO.FuncionarioDAO;
import DAO.ProfessorDAO;
import DTO.FuncionarioDTO;
import DTO.ProfessorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stocaline
 */
public class frmAdminVIEW extends javax.swing.JFrame {

    private int id;

    public frmAdminVIEW() {
        initComponents();
        listarValoresUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nome", "Tipo", "Livro"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuarios);

        btnConsultar.setText("Editar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Usuários:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Entrou como Adiministrador");

        jButton1.setText("Atualizar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(btnConsultar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnSair))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultarCampos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listarValoresUsuarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        frmLoginVIEW objfrmloginview = new frmLoginVIEW();
        objfrmloginview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdminVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void listarValoresUsuarios() {
        try {
            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
            ProfessorDAO objprofessordao = new ProfessorDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
            model.setNumRows(0);

            int controladorListaFuncionario;
            int controladorListaProfessor;
            ArrayList<FuncionarioDTO> listaFuncionario = objfuncionariodao.consultarTodosFuncionarios();
            ArrayList<ProfessorDTO> listaProfessor = objprofessordao.consultarTodosProfessores();

            for (controladorListaFuncionario = 0; controladorListaFuncionario < listaFuncionario.size(); controladorListaFuncionario++) {
                model.addRow(new Object[]{
                    listaFuncionario.get(controladorListaFuncionario).getId(),
                    listaFuncionario.get(controladorListaFuncionario).getNome(),
                    listaFuncionario.get(controladorListaFuncionario).getTipo(),
                    listaFuncionario.get(controladorListaFuncionario).getIdLivro()
                });
            }
            for (controladorListaProfessor = 0; controladorListaProfessor < listaProfessor.size(); controladorListaProfessor++) {
                model.addRow(new Object[]{
                    listaProfessor.get(controladorListaProfessor).getId(),
                    listaProfessor.get(controladorListaProfessor).getNome(),
                    listaProfessor.get(controladorListaProfessor).getTipo(),
                    listaProfessor.get(controladorListaProfessor).getIdLivro()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }

    private void consultarCampos() {
        String TIPO_FUNCIONARIO = "Funcionário";
        String TIPO_PROFESSOR = "Professor";
        int setar = tabelaUsuarios.getSelectedRow();
        setId((int) tabelaUsuarios.getModel().getValueAt(setar, 0));
        String tipoUsuarioProcurado = tabelaUsuarios.getModel().getValueAt(setar, 2).toString();

        if (TIPO_FUNCIONARIO.equals(tipoUsuarioProcurado)) {
            frmEditarFuncionarioVIEW objeditarfuncionarioview = new frmEditarFuncionarioVIEW();
            objeditarfuncionarioview.setVisible(true);
            objeditarfuncionarioview.mostrarFuncionario(getId());
        }

        if (TIPO_PROFESSOR.equals(tipoUsuarioProcurado)) {
            frmEditarProfessorVIEW objeditarprofessorview = new frmEditarProfessorVIEW();
            objeditarprofessorview.setVisible(true);
            objeditarprofessorview.mostrarProfessor(getId());
        }

    }

//    private void consultarCampos() {
//        String TIPO_FUNCIONARIO = "Funcionário";
//        String TIPO_PROFESSOR = "Professor";
//        int setar = tabelaUsuarios.getSelectedRow();
//        int idUsuarioProcurado = (int) tabelaUsuarios.getModel().getValueAt(setar, 0);
//        String tipoUsuarioProcurado = tabelaUsuarios.getModel().getValueAt(setar, 2).toString();
//
//        if (TIPO_FUNCIONARIO.equals(tipoUsuarioProcurado)) {
//            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
//            FuncionarioDTO funcionario = objfuncionariodao.consultarFuncionario(idUsuarioProcurado);
//            txtTeste.setText(funcionario.getNome());
//            frmEditarFuncionarioVIEW objeditarfuncionarioview = new frmEditarFuncionarioVIEW();
//            objeditarfuncionarioview.setVisible(true);
//        }
//        
//        if (TIPO_PROFESSOR.equals(tipoUsuarioProcurado)) {
//            ProfessorDAO objprofessordao = new ProfessorDAO();
//            ProfessorDTO professor = objprofessordao.consultarProfessor(idUsuarioProcurado);
//            txtTeste.setText(professor.getNome());
//        }
//
//    }
}
