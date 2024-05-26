package Poo;

public class Regular extends Aluno  {

	public Regular(String nome, String cpf, int idade, float matricula) {
		super(nome, cpf, idade, matricula);
		// TODO Auto-generated constructor stub
	}

public void pagarMensalidade() {
    System.out.println(nome + " pagou a mensalidade integral.");
}
}
