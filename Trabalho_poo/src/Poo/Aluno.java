package Poo;

public class Aluno extends Pessoa {
	private Float matricula;
	
	public Aluno(String nome, String cpf, int idade, float matricula) {
        super(nome, cpf, idade);
        this.setMatricula(matricula);
    }
    
    // método
    public void pagarMensalidade() {
    	super.pagarMensalidade();
        System.out.println(getNome() + " pagou a mensalidade.");
    }

	public Float getMatricula() {
		return matricula;
	}

	public void setMatricula(Float matricula) {
		this.matricula = matricula;
	}
}
