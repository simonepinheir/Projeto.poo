package Poo;

public abstract class Pessoa {

private String nome;
private String cpf;
private int idade;

public Pessoa(String nome, String cpf, int idade) {
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
}
public String getNome() {
    return cpf;
}
public void setNome(String nome) {
    this.cpf = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}

public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public void incrementarIdade() {
    this.idade++;
}
public void fazerAniversario() {
    this.incrementarIdade();
    System.out.println("Parabéns " + this.nome + "! Você completou " + this.idade + " anos!");
}
public void pagarMensalidade() {
	// TODO Auto-generated method stub
	
}
}


