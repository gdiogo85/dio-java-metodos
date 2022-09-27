package metodos;

public class Quadrilatero {

	public static void area(double lado1) {
		
		double area = (lado1*lado1);
		
		System.out.println("A area do quadrado de lado = " + lado1 + " eh " + area);
		
	}
	
	public static void area(double lado1, double lado2) {
		
		double area = (lado1*lado2);
		
		System.out.println("A area do retangulo de lados = " + lado1 + " e " + lado2 + " eh " + area);
		
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
	
	double area = ((baseMaior+baseMenor)*altura/2);
	
	System.out.println("A area do trapezio de base maior = " + baseMaior + ", base menor = " + 
	baseMenor + " e altura= " + altura + " eh " + area);
	
}

}
