package metodos;

import java.util.Scanner;
import metodos.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lado1, lado2, baseMaior, baseMenor, altura;
		String resposta;
		
		Quadrilatero quad;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("EXERCICIO DE CRIACAO DE METODOS");
		
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
		
		
		System.out.println("EXERCICIO DE SOBREPOSICAO:");
		System.out.println();
		
		System.out.println("Informe qual quadrilatero deseja calcular a area:");
		System.out.println("- Digite 1 para Quadrado;");
		System.out.println("- Digite 2 para Retangulo;");
		System.out.println("- Digite 3 para Trapezio;");
		resposta = scan.next();
		
		if  (resposta.equals("1")) {
			quad = new Quadrilatero();
			System.out.printf("Entre lado 1:");
			lado1 = scan.nextDouble();	
			quad.area(lado1);
		
		} else if (resposta.equals("2")) { 
			quad = new Quadrilatero();
			System.out.printf("Entre lado 1: ");
			lado1 = scan.nextDouble();	
			System.out.printf("Entre lado 2: ");
			lado2 = scan.nextDouble();
			quad.area(lado1,lado2);
			
		} else if (resposta.equals("3")) { 
			quad = new Quadrilatero();
			System.out.printf("Entre base maior: ");
			baseMaior = scan.nextDouble();	
			System.out.printf("Entre base menor: ");
			baseMenor = scan.nextDouble();
			System.out.printf("Entre altura: ");
			altura = scan.nextDouble();
			quad.area(baseMaior,baseMenor,altura);
		}
		
		scan.close();

	}

}
