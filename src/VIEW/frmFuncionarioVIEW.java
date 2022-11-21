package VIEW;

import DAO.AlunoDAO;
import DAO.FuncionarioDAO;
import DAO.LivroDAO;
import DAO.ProfessorDAO;
import DTO.AlunoDTO;
import DTO.LivroDTO;
import DTO.ProfessorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stocaline
 */
public class frmFuncionarioVIEW extends javax.swing.JFrame {

    private int id;

    public frmFuncionarioVIEW() {
        initComponents();
        listarValoresUsuarios();
        listarValoresObras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdSessao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAtualizarTabela = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaObras = new javax.swing.JTable();
        btnCadastrarObra = new javax.swing.JButton();
        btnEditarObra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Usuários:");

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

        tabelaObras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaObras);

        btnCadastrarObra.setText("Cadastrar Obra");
        btnCadastrarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarObraActionPerformed(evt);
            }
        });

        btnEditarObra.setText("Editar Obra");
        btnEditarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarObraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Obras:");

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
                                        .addComponent(jLabel3)
                                        .addGap(200, 200, 200)
                                        .addComponent(btnConsultar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCadastrarObra)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnEditarObra))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(380, 380, 380))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(btnAtualizarTabela)))
                .addContainerGap(33, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnConsultar)
                    .addComponent(btnCadastrarObra)
                    .addComponent(btnEditarObra)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizarTabela)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultarCampos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        frmLoginVIEW objfrmloginview = new frmLoginVIEW();
        objfrmloginview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        editarUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarObraActionPerformed
        frmCadastroObraVIEW objfrmcadastroobraview = new frmCadastroObraVIEW();
        objfrmcadastroobraview.setVisible(true);
    }//GEN-LAST:event_btnCadastrarObraActionPerformed

    private void btnEditarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarObraActionPerformed
        consultarCampoObras();
    }//GEN-LAST:event_btnEditarObraActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        listarValoresUsuarios();
        listarValoresObras();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnCadastrarObra;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditarObra;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaObras;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField txtIdSessao;
    // End of variables declaration//GEN-END:variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setarUsuario(String nome, String senha) {
        FuncionarioDAO objfuncionariodao = new FuncionarioDAO();

        setId(objfuncionariodao.consultarFuncionarioPorNomeSenha(nome, senha));
        txtIdSessao.setText(String.valueOf(getId()));

    }

    private void editarUsuario() {
        frmEditarFuncionarioVIEW objeditarfuncionarioview = new frmEditarFuncionarioVIEW();
        objeditarfuncionarioview.setVisible(true);
        objeditarfuncionarioview.mostrarFuncionario(getId());
    }

    public void listarValoresUsuarios() {
        try {
            ProfessorDAO objprofessordao = new ProfessorDAO();
            AlunoDAO objalunodao = new AlunoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
            model.setNumRows(0);

            int controladorListaProfessor;
            ArrayList<ProfessorDTO> listaProfessor = objprofessordao.consultarTodosProfessores();
            ArrayList<AlunoDTO> listaAluno = objalunodao.consultarTodosAlunos();

            for (controladorListaProfessor = 0; controladorListaProfessor < listaProfessor.size(); controladorListaProfessor++) {
                model.addRow(new Object[]{
                    listaProfessor.get(controladorListaProfessor).getId(),
                    listaProfessor.get(controladorListaProfessor).getNome(),
                    listaProfessor.get(controladorListaProfessor).getTipo(),
                    listaProfessor.get(controladorListaProfessor).getIdLivro()
                });
            }
            
            for (controladorListaProfessor = 0; controladorListaProfessor < listaAluno.size(); controladorListaProfessor++) {
                model.addRow(new Object[]{
                    listaAluno.get(controladorListaProfessor).getId(),
                    listaAluno.get(controladorListaProfessor).getNome(),
                    listaAluno.get(controladorListaProfessor).getTipo(),
                    listaAluno.get(controladorListaProfessor).getIdLivro()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }

    public void listarValoresObras() {
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

    private void consultarCampos() {
        String TIPO_PROFESSOR = "Professor";
        int setar = tabelaUsuarios.getSelectedRow();
        setId((int) tabelaUsuarios.getModel().getValueAt(setar, 0));
        String tipoUsuarioProcurado = tabelaUsuarios.getModel().getValueAt(setar, 2).toString();

        if (TIPO_PROFESSOR.equals(tipoUsuarioProcurado)) {
            frmEditarProfessorVIEW objfrmeditarprofessorview = new frmEditarProfessorVIEW();
            objfrmeditarprofessorview.setVisible(true);
            objfrmeditarprofessorview.mostrarProfessor(id);
        }else{
            frmEditarAlunoVIEW objfrmeditaralunoview = new frmEditarAlunoVIEW();
            objfrmeditaralunoview.setVisible(true);
            objfrmeditaralunoview.mostrarAluno(id);
        }
    }

    private void consultarCampoObras() {
        String TIPO_LIVRO = "livro";
        int setar = tabelaObras.getSelectedRow();
        setId((int) tabelaObras.getModel().getValueAt(setar, 0));
        String tipoObraProcurado = tabelaObras.getModel().getValueAt(setar, 1).toString();

        frmEditarObraVIEW objeditarobras = new frmEditarObraVIEW();
        objeditarobras.setVisible(true);

        if (tipoObraProcurado.equals(TIPO_LIVRO)) {
            objeditarobras.mostrarLivro(id);

        } else {
            objeditarobras.mostrarPeriodico(id);
        }

    }

}
