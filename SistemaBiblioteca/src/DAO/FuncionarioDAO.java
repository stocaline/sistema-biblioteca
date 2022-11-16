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
    
    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto){
        String sql ="INSERT INTO funcionario (nome, endereco_funcionario) VALUES (?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO cadastrar" + erro);
        }
    }
    
    public ArrayList<FuncionarioDTO> consultarFuncionario(){
        String sql = "SELECT * FROM funcionario";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                objfuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario"));
                objfuncionarioDTO.setNome_funcionario(rs.getString("nome"));
                objfuncionarioDTO.setEndereco_funcionario(rs.getString("endereco_funcionario"));
                
                lista.add(objfuncionarioDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO Consultar" + erro);
        }
        return lista;
    }
        public ResultSet autenticacaoFuncionario(UsuarioDTO objusuarioDTO){
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
            PreparedStatement pstmFuncionario = conn.prepareStatement(sql);
            pstmFuncionario.setString(1, objusuarioDTO.getNome_usuario());
            pstmFuncionario.setString(2, objusuarioDTO.getSenha_usuario());
            
            ResultSet rsFuncionario = pstmFuncionario.executeQuery();
            return rsFuncionario;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
   
}
