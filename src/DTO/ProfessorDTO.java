package DTO;

public class ProfessorDTO extends PessoaDTO{
    
    private int matriculaProfessor;
    private String materia;

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    } 
}
