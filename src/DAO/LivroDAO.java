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
    LivroDTO livro;

    public void cadastrarLivro(LivroDTO objlivrodto) {
        String sql = "INSERT INTO obras (titulo, categoria, autores, editora, isbn, tipo, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getTitulo());
            pstm.setString(2, objlivrodto.getCategoria());
            pstm.setString(3, objlivrodto.getAutores());
            pstm.setString(4, objlivrodto.getEditora());
            pstm.setInt(5, objlivrodto.getIsbn());
            pstm.setString(6, objlivrodto.getTipo());
            pstm.setString(7, "Disponivel");

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
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId(rs.getInt("id"));
                objlivrodto.setTipo(rs.getString("tipo"));
                objlivrodto.setTitulo(rs.getString("titulo"));
                objlivrodto.setAutores(rs.getString("autores"));
                objlivrodto.setIdDono(rs.getInt("id_dono"));
                objlivrodto.setStatus(rs.getString("status"));

                lista.add(objlivrodto);
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
                objlivrodto.setStatus(rs.getString("status"));
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

    public void alugarLivro(int idlivro, int iddono) {
        String sql = "UPDATE obras set status = ?, id_dono = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "Alugado");
            pstm.setInt(2, iddono);
            pstm.setInt(3, idlivro);

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO alugar: " + erro);
        }
    }
    
    public void devolverLivro(int idlivro) {
        String sql = "UPDATE obras set status = ?, id_dono = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "Disponivel");
            pstm.setInt(2, 0);
            pstm.setInt(3, idlivro);

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO devolver: " + erro);
        }
    }

    public ArrayList<LivroDTO> mostrarLivrosAlugados(int iddono) {
        String sql = "SELECT * FROM obras WHERE id_dono = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, iddono);
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
                objlivrodto.setStatus(rs.getString("status"));
                
                lista.add(objlivrodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO consultar: " + erro);
        }
        return lista;
    }
}

