package VIEW;

import DAO.LivroDAO;
import DAO.PeriodicosDAO;
import DAO.ProfessorDAO;
import DTO.LivroDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hamat
 */
public class frmProfessorVIEW extends javax.swing.JFrame {

    private int id;

    public frmProfessorVIEW() {
        initComponents();
        listarValoresObras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaObras = new javax.swing.JTable();
        btnAlugar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdSessao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaObrasAlugadas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id","Tipo", "Titulo", "Autor", "status"

            }
        ));
        jScrollPane1.setViewportView(tabelaObras);

        btnAlugar.setText("Alugar");
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Obras Alugadas:");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setText("Editar meus dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Id de sessão:");

        txtIdSessao.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Sistema Biblioteca");

        btnAtualizarTabela.setText("Atualizar Tabelas");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });

        tabelaObrasAlugadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id","Tipo", "Titulo", "Autor", "status"
            }
        ));
        jScrollPane2.setViewportView(tabelaObrasAlugadas);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Obras:");

        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(txtIdSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(301, 301, 301)
                                        .addComponent(btnAlugar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDevolver))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(380, 380, 380))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(btnAtualizarTabela)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel5)
                    .addContainerGap(840, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnSair))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlugar)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnAtualizarTabela))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(jLabel5)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editarUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        frmLoginVIEW objfrmloginview = new frmLoginVIEW();
        objfrmloginview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        listarValoresObras();
        listarValoresObrasAlugadas(getId());
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed
        alugarObra();

    }//GEN-LAST:event_btnAlugarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        DevolverObra();
        JOptionPane.showMessageDialog(null, "Livro Devolvido, Obrigado :)");
    }//GEN-LAST:event_btnDevolverActionPerformed

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
            java.util.logging.Logger.getLogger(frmProfessorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProfessorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProfessorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProfessorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProfessorVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaObras;
    private javax.swing.JTable tabelaObrasAlugadas;
    private javax.swing.JTextField txtIdSessao;
    // End of variables declaration//GEN-END:variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setarUsuario(String nome, String senha) {
        ProfessorDAO objprofessordao = new ProfessorDAO();

        setId(objprofessordao.consultarProfessorPorNomeSenha(nome, senha));
        txtIdSessao.setText(String.valueOf(getId()));
        listarValoresObrasAlugadas(getId());

    }

    private void editarUsuario() {
        frmEditarProfessorVIEW objeditarprofessorview = new frmEditarProfessorVIEW();
        objeditarprofessorview.setVisible(true);
        objeditarprofessorview.mostrarProfessor(id);
    }

    private void listarValoresObras() {
        try {
            LivroDAO objlivrodao = new LivroDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaObras.getModel();
            model.setNumRows(0);

            int controladorListaLivro;
            ArrayList<LivroDTO> listaLivro = objlivrodao.consultarTodasObras();

            for (controladorListaLivro = 0; controladorListaLivro < listaLivro.size(); controladorListaLivro++) {
                model.addRow(new Object[]{
                    listaLivro.get(controladorListaLivro).getId(),
                    listaLivro.get(controladorListaLivro).getTipo(),
                    listaLivro.get(controladorListaLivro).getTitulo(),
                    listaLivro.get(controladorListaLivro).getAutores(),
                    listaLivro.get(controladorListaLivro).getStatus()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }

    private void alugarObra() {
        String STATUS_DISPONIVEL = "Disponivel";
        String TIPO_LIVRO = "Livro";
        String status;
        String tipo;
        int idObra;

        int idUsuario = Integer.parseInt(txtIdSessao.getText());
        int setar = tabelaObras.getSelectedRow();
        idObra = ((int) tabelaObras.getModel().getValueAt(setar, 0));
        status = (String) tabelaObras.getModel().getValueAt(setar, 4);
        tipo = (String) tabelaObras.getValueAt(setar, 1);

        if (status.equals(STATUS_DISPONIVEL)) {
            if (tipo.equals(TIPO_LIVRO)) {
                LivroDAO objlivrodao = new LivroDAO();
                objlivrodao.alugarLivro(idObra, idUsuario);
                JOptionPane.showMessageDialog(null, "Livro Alugado!");
            } else {
                PeriodicosDAO objperiodicodao = new PeriodicosDAO();
                objperiodicodao.alugarPeriodico(idObra, idUsuario);
                JOptionPane.showMessageDialog(null, "Periodico Alugado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Está obra não está disponivel");
        }
    }

    private void DevolverObra() {
        String STATUS_ALUGADO = "Alugado";
        String TIPO_LIVRO = "Livro";
        String status;
        String tipo;
        int idObra;

        int idUsuario = Integer.parseInt(txtIdSessao.getText());
        int setar = tabelaObrasAlugadas.getSelectedRow();
        idObra = ((int) tabelaObrasAlugadas.getModel().getValueAt(setar, 0));
        status = (String) tabelaObrasAlugadas.getModel().getValueAt(setar, 4);
        tipo = (String) tabelaObrasAlugadas.getValueAt(setar, 1);

        if (status.equals(STATUS_ALUGADO)) {
            if (tipo.equals(TIPO_LIVRO)) {
                LivroDAO objlivrodao = new LivroDAO();
                objlivrodao.devolverLivro(idObra);
            } else {
                PeriodicosDAO objperiodicodao = new PeriodicosDAO();
                objperiodicodao.devolverPeriodico(idUsuario);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Está obra não está disponivel");
        }
    }

    private void listarValoresObrasAlugadas(int idUsuario) {

        try {
            LivroDAO objlivrodao = new LivroDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaObrasAlugadas.getModel();
            model.setNumRows(0);

            int controladorListaLivro;
            ArrayList<LivroDTO> listaLivro = objlivrodao.mostrarLivrosAlugados(idUsuario);

            for (controladorListaLivro = 0; controladorListaLivro < listaLivro.size(); controladorListaLivro++) {
                model.addRow(new Object[]{
                    listaLivro.get(controladorListaLivro).getId(),
                    listaLivro.get(controladorListaLivro).getTipo(),
                    listaLivro.get(controladorListaLivro).getTitulo(),
                    listaLivro.get(controladorListaLivro).getAutores(),
                    listaLivro.get(controladorListaLivro).getStatus()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }
}
