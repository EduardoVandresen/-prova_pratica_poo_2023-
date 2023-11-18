package prova_pratica_poo_2023;

public class Condutor extends Pessoas {
	private char Embriagado;

	public Condutor(String nome, int idade, char sexo, char embriagado) {
		super(nome, idade, sexo);
		Embriagado = embriagado;
	}

	@Override
	public String toString() {
		return super.toString() +" Condutor [Embriagado=" + Embriagado + "]";
	}

	public char getEmbriagado() {
		return Embriagado;
	}

	public void setEmbriagado(char embriagado) {
		Embriagado = embriagado;
	}
	
	
}
