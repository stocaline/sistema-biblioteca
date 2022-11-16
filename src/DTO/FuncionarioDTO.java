package DTO;

public class FuncionarioDTO extends PessoaDTO {
    
    private int registro_funciona, salario;

    public int getRegistro_funciona() {
        return registro_funciona;
    }

    public void setRegistro_funciona(int registro_funciona) {
        this.registro_funciona = registro_funciona;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
