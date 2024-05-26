package Poo;

public class Visitante extends Pessoa{

	public Visitante(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
		// TODO Auto-generated constructor stub
		
		protected String motivoVisita;

	    public Visitante(String nome, int idade, String motivoVisita) {
	        super(nome, idade);
	        this.motivoVisita = motivoVisita;
	}

}
