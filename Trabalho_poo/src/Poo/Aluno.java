package Poo;

public class Aluno extends pessoa; {
	private Float matricula;
	
	public Aluno(String nome, String cpf, int idade, float matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }
    
    // método
    public void pagarMensalidade() {
    	super.pagarMensalidade();
        System.out.println(nome + " pagou a mensalidade.");
    }
}
