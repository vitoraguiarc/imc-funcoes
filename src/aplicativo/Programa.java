package aplicativo;

import atributos.Imc;

public class Programa {

	public static void main(String[] args) {
		
		Imc meuImc = new Imc();
		
		meuImc.altura = 1.78;
		meuImc.peso = 30;
		meuImc.calcularImc();
		meuImc.obterStatusImc();
		
		

	}

}
