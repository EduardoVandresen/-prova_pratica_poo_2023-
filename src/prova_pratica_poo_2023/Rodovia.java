package prova_pratica_poo_2023;

public class Rodovia {
	private char sigla;
	private char grau;
	
	
	
	
	
	
	
	public Rodovia(char sigla, char grau) {
		super();
		this.sigla = sigla;
		this.grau = grau;
	}







	public char getSigla() {
		return sigla;
	}







	public void setSigla(char sigla) {
		this.sigla = sigla;
	}







	public char getGrau() {
		return grau;
	}







	public void setGrau(char grau) {
		this.grau = grau;
	}







	@Override
	public String toString() {
		return "Rodovia [sigla=" + sigla + ", grau=" + grau + "]";
	}
	
}
