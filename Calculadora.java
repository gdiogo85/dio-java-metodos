package metodos;

public class Calculadora {
	
	public void adicao(double valor1, double valor2) {
		
		double resultado = (valor1 + valor2);
	
		System.out.println("A soma de " + valor1 + " mais " + valor2 + " = "+ resultado);
	}
	
	public void subtracao(double valor1, double valor2) {
		
		double resultado = (valor1 - valor2);
		
		System.out.println("A subtracao de " + valor1 + " menos " + valor2 + " = "+ resultado);
	}
	
	public void multiplicacao(double valor1, double valor2) {
		
		double resultado = (valor1 * valor2);
		
		System.out.println("A multiplicacao de " + valor1 + " vezes " + valor2 + " = "+ resultado);
	}
	
	public void divisao(double valor1, double valor2) {
	
		double resultado = (valor1 / valor2);
		
		System.out.println("A divisao de " + valor1 + " por " + valor2 + " = "+ resultado);
	}

}
