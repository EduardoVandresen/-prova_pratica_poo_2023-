package prova_pratica_poo_2023;

import javax.swing.JOptionPane;

public class Pessoas {
	private String nome;
	private int idade;
	private String sexo;
	
	
	


	public Pessoas() {
		setNome(JOptionPane.showInputDialog(null, "qual o nome da pessoa"));
		setSexo(JOptionPane.showInputDialog(null, "qual o Sexo da pessoa"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "qual a idade da pessoa")));
	}
	public Pessoas(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
