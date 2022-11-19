package DAO;

import DTO.AlunoDTO;
import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AlunoDTO> lista = new ArrayList<>();
    AlunoDTO aluno = new AlunoDTO();
    int Idaluno;

    public void cadastrarAluno(AlunoDTO objaluno) {
        String sql = "INSERT INTO aluno (nome, senha, endereco, email, cpf, matricula_aluno, turma, tipo) VALUES (?, ?, ? , ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objaluno.getNome());
            pstm.setString(2, objaluno.getSenha());
            pstm.setString(3, objaluno.getEndereco());
            pstm.setString(4, objaluno.getEmail());
            pstm.setInt(5, objaluno.getCpf());
            pstm.setInt(6, objaluno.getMatricula_aluno());
            pstm.setString(7, objaluno.getTurma());
            pstm.setString(8, "Aluno");

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO cadastrar: " + erro);
        }
    }


    public AlunoDTO consultaraluno(int id) {
        String sql = "SELECT * FROM aluno WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                AlunoDTO objalunoDTO = new AlunoDTO();
                objalunoDTO.setId(rs.getInt("id"));
                objalunoDTO.setNome(rs.getString("nome"));
                objalunoDTO.setSenha(rs.getString("senha"));
                objalunoDTO.setEndereco(rs.getString("endereco"));
                objalunoDTO.setEmail(rs.getString("email"));
                objalunoDTO.setCpf(rs.getInt("cpf"));
                objalunoDTO.setTurma(rs.getString("turma"));
                objalunoDTO.setMatricula_aluno(rs.getInt("matricula_aluno"));
                objalunoDTO.setIdLivro(rs.getInt("id_livro"));
                aluno = objalunoDTO;
            }

            return aluno;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO consultar: " + erro);
        }
        return null;
    }

    public int consultarAlunoPorNomeSenha(String nome, String senha) {
        String sql = "SELECT id FROM aluno WHERE nome = ? && senha = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();

            while (rs.next()) {
                AlunoDTO objalunoDTO = new AlunoDTO();
                objalunoDTO.setId(rs.getInt("id"));
                Idaluno = objalunoDTO.getId();
            }

            return Idaluno;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO consultar por nome e senha: " + erro);
        }
        return 0;
    }


    public ResultSet autenticacaoAluno(UsuarioDTO objusuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM aluno WHERE nome = ? AND senha = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO: " + erro);
            return null;
        }
    }

    public void alterarAluno(AlunoDTO objalunodto) {
        String sql = "UPDATE aluno set nome = ?, senha = ?, endereco = ?, email = ?, cpf = ?, matricula_aluno = ?,turma  = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalunodto.getNome());
            pstm.setString(2, objalunodto.getSenha());
            pstm.setString(3, objalunodto.getEndereco());
            pstm.setString(4, objalunodto.getEmail());
            pstm.setInt(5, objalunodto.getCpf());
            pstm.setInt(6, objalunodto.getMatricula_aluno());
            pstm.setString(7, objalunodto.getTurma());
            pstm.setInt(8, objalunodto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO alterar: " + erro);
        }

    }

    public void excluirAluno(AlunoDTO objalunodto) {
        String sql = "DELETE FROM aluno WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objalunodto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO excluir: " + erro);
        }

    }

}