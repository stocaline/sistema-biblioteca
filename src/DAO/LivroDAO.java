package DAO;

import DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LivroDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();
    LivroDTO livro = new LivroDTO();
    
    public void cadastrarLivro(LivroDTO objlivrodto) {
        String sql = "INSERT INTO obras (titulo, categoria, autores, editora, isbn, tipo) VALUES (?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getTitulo());
            pstm.setString(2, objlivrodto.getCategoria());
            pstm.setString(3, objlivrodto.getAutores());
            pstm.setString(4, objlivrodto.getEditora());
            pstm.setInt(5, objlivrodto.getIsbn());
            pstm.setString(6, objlivrodto.getTipo());
            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO cadastrar: " + erro);
        }
    
    
    }

    public ArrayList<LivroDTO> consultarTodasObras() {
        String sql = "SELECT * FROM obras";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                LivroDTO objlivroDTO = new LivroDTO();
                objlivroDTO.setId(rs.getInt("id"));
                objlivroDTO.setTipo(rs.getString("tipo"));
                objlivroDTO.setTitulo(rs.getString("titulo"));
                objlivroDTO.setAutores(rs.getString("autores"));
                objlivroDTO.setIdDono(rs.getInt("id_dono"));
                

                lista.add(objlivroDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Consultar: " + erro);
        }
        return lista;
    }
    
    public LivroDTO consultarLivro(int id) {
        String sql = "SELECT * FROM obras WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId(rs.getInt("id"));
                objlivrodto.setTitulo(rs.getString("titulo"));
                objlivrodto.setCategoria(rs.getString("categoria"));
                objlivrodto.setAutores(rs.getString("autores"));
                objlivrodto.setEditora(rs.getString("editora"));
                objlivrodto.setIsbn(rs.getInt("isbn"));
                objlivrodto.setTipo(rs.getString("tipo"));
                livro = objlivrodto;
            }

            return livro;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO consultar: " + erro);
        }
        return null;
    }
    
    public void alterarLivro(LivroDTO objlivrodto) {
        String sql = "UPDATE obras set titulo = ?, categoria = ?, autores = ?, editora = ?, isbn = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getTitulo());
            pstm.setString(2, objlivrodto.getCategoria());
            pstm.setString(3, objlivrodto.getAutores());
            pstm.setString(4, objlivrodto.getEditora());
            pstm.setInt(5, objlivrodto.getIsbn());
            pstm.setInt(6, objlivrodto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO alterar: " + erro);
        }

    }
    
        public void excluirLivro(LivroDTO objlivrodto) {
        String sql = "DELETE FROM obras WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO excluir: " + erro);
        }

    }
}
