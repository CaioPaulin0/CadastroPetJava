package model;

public class Gato {
	private String nome;
	private int idade;
	private int peso;
	
	public Gato(String nome, int idade, int peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return nome;}
	
	public void setIdade(int idade) {this.idade = idade;}
	public int getIdade() {return idade;}
	
	public void setPeso(int peso) {this.peso = peso;}
	public int getPeso() {return peso;}
}
