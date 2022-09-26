package metodos;

import java.util.Scanner;
import metodos.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();

		System.out.println("Informe os valores de entrada:");
		System.out.printf("Valor1:");
		double valor1 = scan.nextDouble();
		System.out.printf("Valor2:");
		double valor2 = scan.nextDouble();
		
		calc.adicao(valor1,valor2);
		calc.subtracao(valor1,valor2);
		calc.multiplicacao(valor1,valor2);
		calc.divisao(valor1,valor2);
		
		scan.close();

	}

}
