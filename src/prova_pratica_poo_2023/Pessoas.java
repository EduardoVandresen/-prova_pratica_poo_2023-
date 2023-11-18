package prova_pratica_poo_2023;

public class Pessoas {
	private String nome;
	private int idade;
	private char sexo;
	
	
	


	public Pessoas(String nome, int idade, char sexo) {
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



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
