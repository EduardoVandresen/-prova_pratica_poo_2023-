package prova_pratica_poo_2023;

public class Veiculos {
	private int ano; 
	private Pessoas pessoa;
	
	
	

	public Veiculos(int ano, String nome, int idade, char sexo) {
		super();
		
		this.ano = ano;
		this.pessoa = new Pessoas(nome, idade, sexo);
	}




	@Override
	public String toString() {
		return "Veiculos [ano=" + ano + ", lista=" + pessoa + "]";
	}




	public int getAno() {
		return ano;
	}




	public void setAno(int ano) {
		this.ano = ano;
	}




	public Pessoas getPessoa() {
		return pessoa;
	}




	public void setPessoa(Pessoas pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
