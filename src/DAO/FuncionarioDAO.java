package DAO;

import DTO.FuncionarioDTO;
import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author stocaline
 */
public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    FuncionarioDTO funcionario = new FuncionarioDTO();

    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "INSERT INTO funcionario (nome, senha, endereco, email, cpf, registro_funcionario, salario, tipo) VALUES (?, ?, ? , ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getSenha());
            pstm.setString(3, objfuncionariodto.getEndereco());
            pstm.setString(4, objfuncionariodto.getEmail());
            pstm.setInt(5, objfuncionariodto.getCpf());
            pstm.setInt(6, objfuncionariodto.getRegistro_funciona());
            pstm.setInt(7, objfuncionariodto.getSalario());
            pstm.setString(8, "Funcionário");

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO cadastrar: " + erro);
        }
    }

    public ArrayList<FuncionarioDTO> consultarTodosFuncionarios() {
        String sql = "SELECT * FROM funcionario";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                objfuncionarioDTO.setId(rs.getInt("id"));
                objfuncionarioDTO.setNome(rs.getString("nome"));
                objfuncionarioDTO.setTipo(rs.getString("tipo"));
                objfuncionarioDTO.setIdLivro(rs.getInt("id_livro"));

                lista.add(objfuncionarioDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Consultar: " + erro);
        }
        return lista;
    }

    public FuncionarioDTO consultarFuncionario(int id) {
        String sql = "SELECT id, nome FROM funcionario WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                objfuncionarioDTO.setId(rs.getInt("id"));
                objfuncionarioDTO.setNome(rs.getString("nome"));

                funcionario = objfuncionarioDTO;
            }

//            objfuncionarioDTO.setTipo(rs.getString("tipo"));
//            objfuncionarioDTO.setIdLivro(rs.getInt("id_livro"));
//            objfuncionarioDTO.setCpf(rs.getInt("id_livro"));
//            objfuncionarioDTO.setEmail(rs.getString("nome"));
//            objfuncionarioDTO.setEndereco(rs.getString("nome"));
//            objfuncionarioDTO.setSalario(rs.getInt("id_livro"));
//            objfuncionarioDTO.setRegistro_funciona(rs.getInt("id_livro"));
            return funcionario;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO consultar: " + erro);
        }
        return null;
    }

    public ResultSet autenticacaoFuncionario(UsuarioDTO objusuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO: " + erro);
            return null;
        }
    }

}
