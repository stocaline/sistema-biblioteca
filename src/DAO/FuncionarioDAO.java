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
        String sql ="INSERT INTO funcionario (nome, senha, endereco, email, cpf, registro_funcionario, salario) VALUES (?, ?, ? , ?, ?, ?, ?)";
        
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
            
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO cadastrar" + erro);
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
                objfuncionarioDTO.setId(rs.getInt("id"));
                objfuncionarioDTO.setNome(rs.getString("nome"));
                objfuncionarioDTO.setIdLivro(rs.getInt("id_livro"));
                
                lista.add(objfuncionarioDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Consultar" + erro);
        }
        return lista;
    }
    public ResultSet autenticacaoFuncionario(UsuarioDTO objusuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
            PreparedStatement pstmFuncionario = conn.prepareStatement(sql);
            pstmFuncionario.setString(1, objusuarioDTO.getNome_usuario());
            pstmFuncionario.setString(2, objusuarioDTO.getSenha_usuario());

            ResultSet rsFuncionario = pstmFuncionario.executeQuery();
            return rsFuncionario;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO: " + erro);
            return null;
        }
    }
   
}
