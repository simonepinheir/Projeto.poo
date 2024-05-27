package Poo;

public class Professor{
private float centro;
private String nome;

public Professor(String nome, String cpf, int idade, float centro) {
    super();
    this.centro = centro;
}

public void darAula() {
    System.out.println("Professor " + this.nome + " está dando aula no centro " + this.centro);
}
}