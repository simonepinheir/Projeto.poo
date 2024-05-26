package Poo;

public class Bolsista extends Aluno{
	private float bolsa;
	

	 
	  public Bolsista(String nome, String cpf, int idade, float matricula, float bolsa) {
        super(nome, cpf, idade, matricula);
        this.bolsa = bolsa;
}
	  public void pagarMensalidade() {
	        System.out.println(nome + " é bolsista, a mensalidade foi paga.");
	    }
	}