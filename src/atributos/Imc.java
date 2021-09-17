package atributos;

public class Imc {
	
	public double peso;
	public double altura;
	public double valorImc;
	public String statusImc;
	
	public void calcularImc(){
		valorImc = peso / (altura*altura);
		System.out.println(valorImc);
	}
	
	public void obterStatusImc() {
		if (valorImc < 18.5) {
			statusImc = "Abaixo do Peso";
		} 
		System.out.println(statusImc);
	}

}
