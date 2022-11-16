package DAO;

import DTO.ProfessorDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProfessorDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarProfessor(ProfessorDTO objprofessordto){
        String sql ="INSERT INTO professor (nome, senha, endereco, email, cpf, matricula_professor, materia) VALUES (?, ?, ?, ? , ? , ? ,?)";
        
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
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProfessorDAO cadastrar" + erro);
        }
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
    
}
