package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuarioDTO){
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
    
}

