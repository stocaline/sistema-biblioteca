package DTO;

public class FuncionarioDTO {
    
    private String nome_funcionario, senha_funcionario,endereco_funcionario;
    private int id_funcionario;


    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getSenha_funcionario() {
        return senha_funcionario;
    }

    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }
    
    public String getEndereco_funcionario() {
        return endereco_funcionario;
    }

    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

}
