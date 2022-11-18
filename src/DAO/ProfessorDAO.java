package DAO;

import DTO.ProfessorDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfessorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProfessorDTO> lista = new ArrayList<>();
    ProfessorDTO professor;

    public void cadastrarProfessor(ProfessorDTO objprofessordto) {
        String sql = "INSERT INTO professor (nome, senha, endereco, email, cpf, matricula_professor, materia, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprofessordto.getNome());
            pstm.setString(2, objprofessordto.getSenha());
            pstm.setString(3, objprofessordto.getEndereco());
            pstm.setString(4, objprofessordto.getEmail());
            pstm.setInt(5, objprofessordto.getCpf());
            pstm.setInt(6, objprofessordto.getMatriculaProfessor());
            pstm.setString(7, objprofessordto.getMateria());
            pstm.setString(8, objprofessordto.getTipo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO cadastrar" + erro);
        }
    }

    public ArrayList<ProfessorDTO> consultarTodosProfessores() {
        String sql = "SELECT * FROM professor";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProfessorDTO objprofessordto = new ProfessorDTO();
                objprofessordto.setId(rs.getInt("id"));
                objprofessordto.setNome(rs.getString("nome"));
                objprofessordto.setTipo(rs.getString("tipo"));
                objprofessordto.setIdLivro(rs.getInt("id_livro"));

                lista.add(objprofessordto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO Consultar" + erro);
        }
        return lista;
    }

    public ResultSet autenticacaoProfessor(UsuarioDTO objusuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM professor WHERE nome = ? AND senha = ?";
            PreparedStatement pstmProfessor = conn.prepareStatement(sql);
            pstmProfessor.setString(1, objusuarioDTO.getNome_usuario());
            pstmProfessor.setString(2, objusuarioDTO.getSenha_usuario());

            ResultSet rsProfessor = pstmProfessor.executeQuery();
            return rsProfessor;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO: " + erro);
            return null;
        }
    }

    public ProfessorDTO consultarProfessor(int id) {
        String sql = "SELECT * FROM professor WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProfessorDTO objprofessordto = new ProfessorDTO();
                objprofessordto.setId(rs.getInt("id"));
                objprofessordto.setNome(rs.getString("nome"));
                objprofessordto.setSenha(rs.getString("senha"));
                objprofessordto.setEndereco(rs.getString("endereco"));
                objprofessordto.setEmail(rs.getString("email"));
                objprofessordto.setCpf(rs.getInt("cpf"));
                objprofessordto.setMatriculaProfessor(rs.getInt("matricula_professor"));
                objprofessordto.setMateria(rs.getString("materia"));
                objprofessordto.setIdLivro(rs.getInt("id_livro"));
                professor = objprofessordto;
            }

            return professor;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO consultar: " + erro);
        }
        return null;
    }

        public void alterarProfessor(ProfessorDTO objprofessordto) {
        String sql = "UPDATE funcionario set nome = ?, senha = ?, endereco = ?, email = ?, cpf = ?, matricula_professor = ?, materia = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprofessordto.getNome());
            pstm.setString(2, objprofessordto.getSenha());
            pstm.setString(3, objprofessordto.getEndereco());
            pstm.setString(4, objprofessordto.getEmail());
            pstm.setInt(5, objprofessordto.getCpf());
            pstm.setInt(6, objprofessordto.getMatriculaProfessor());
            pstm.setString(7, objprofessordto.getMateria());
            pstm.setInt(8, objprofessordto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO alterar: " + erro);
        }

    }
            public void excluirProfessor(ProfessorDTO objprofessordto) {
        String sql = "DELETE FROM professor WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprofessordto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO excluir: " + erro);
        }

    }
    
}
