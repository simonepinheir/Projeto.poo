package Poo;

import java.util.ArrayList;

class Turma {
    private int codigo;
    private String disciplina;
    private String professor;
    private ArrayList<Aluno> alunos;

  
    public Turma(int codigo, String disciplina, String professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

   
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    
    public void listarAlunos() {
        System.out.println("Alunos na turma:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    class Aluno {
        private String nome;
        private int matricula;

        
        public Aluno(String nome, int matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

       
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }
    }

}

