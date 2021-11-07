package main;

import java.util.ArrayList;

/**
 *
 * @author Pedro Henrique Munhoz Costa
 */
public class Curso {
    private String nome;
    private String horario;    
    private Professor professor;
    private ArrayList<Aluno> listaAlunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    public void adicionarAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }
}
