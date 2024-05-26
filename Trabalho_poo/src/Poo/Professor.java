package Poo;

private float centro;

public Professor(String nome, String cpf, int idade, float centro) {
    super(nome, cpf, idade);
    this.centro = centro;
}

public void darAula() {
    System.out.println("Professor " + this.nome + " está dando aula no centro " + this.centro);
}
}