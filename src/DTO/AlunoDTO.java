package DTO;

public class AlunoDTO extends PessoaDTO {

    private int matricula_aluno;
    private String turma;

    public int getMatricula_aluno() {
        return matricula_aluno;
    }

    public void setMatricula_aluno(int matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
