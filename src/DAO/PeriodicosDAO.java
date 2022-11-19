package DAO;

import DTO.PeriodicosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PeriodicosDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PeriodicosDTO> lista = new ArrayList<>();
    PeriodicosDTO periodico = new PeriodicosDTO();

    public void cadastrarPeriodico(PeriodicosDTO objperiodicodto) {
        String sql = "INSERT INTO obras (titulo, categoria, autores, editora, issn, tipo) VALUES (?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objperiodicodto.getTitulo());
            pstm.setString(2, objperiodicodto.getCategoria());
            pstm.setString(3, objperiodicodto.getAutores());
            pstm.setString(4, objperiodicodto.getEditora());
            pstm.setInt(5, objperiodicodto.getIssn());
            pstm.setString(6, objperiodicodto.getTipo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PeriodicoDAO cadastrar: " + erro);
        }

    }

    public PeriodicosDTO consultarPeriodico(int id) {
        String sql = "SELECT * FROM obras WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            while (rs.next()) {
                PeriodicosDTO objperiodicodto = new PeriodicosDTO();
                objperiodicodto.setId(rs.getInt("id"));
                objperiodicodto.setTitulo(rs.getString("titulo"));
                objperiodicodto.setCategoria(rs.getString("categoria"));
                objperiodicodto.setAutores(rs.getString("autores"));
                objperiodicodto.setEditora(rs.getString("editora"));
                objperiodicodto.setIssn(rs.getInt("issn"));
                objperiodicodto.setTipo(rs.getString("tipo"));
                periodico = objperiodicodto;
            }

            return periodico;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PeriodicoDAO consultar: " + erro);
        }
        return null;
    }

    public void alterarPeriodico(PeriodicosDTO objperiodicoDTO) {
        String sql = "UPDATE obras set titulo = ?, categoria = ?, autores = ?, editora = ?, issn = ? WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objperiodicoDTO.getTitulo());
            pstm.setString(2, objperiodicoDTO.getCategoria());
            pstm.setString(3, objperiodicoDTO.getAutores());
            pstm.setString(4, objperiodicoDTO.getEditora());
            pstm.setInt(5, objperiodicoDTO.getIssn());
            pstm.setInt(6, objperiodicoDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PeriodicoDAO alterar: " + erro);
        }

    }

    public void excluirPeriodico(PeriodicosDTO objperiodicodto) {
        String sql = "DELETE FROM obras WHERE id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objperiodicodto.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PeriodicoDAO excluir: " + erro);
        }

    }

}
