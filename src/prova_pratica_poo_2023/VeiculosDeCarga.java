package prova_pratica_poo_2023;

public class VeiculosDeCarga extends Veiculos {
	Double carga;

	public VeiculosDeCarga(int ano, String nome, int idade, char sexo, Double carga) {
		super(ano, nome, idade, sexo);
		this.carga = carga;
	}
	
	
}
